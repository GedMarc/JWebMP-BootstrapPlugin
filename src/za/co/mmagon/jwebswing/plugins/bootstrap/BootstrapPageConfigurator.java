/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.client.Browsers;
import za.co.mmagon.jwebswing.base.html.Meta;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.MetaAttributes;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.plugins.bootstrap.dialog.BootstrapDialogFeature;

/**
 *
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via file://
 */
public class BootstrapPageConfigurator implements PageConfigurator
{

    @JsonIgnore
    public static final String BootstrapEnabledString = "bootstrap-enabled";
    /**
     * If the generator is generating for bootstrap 4
     */
    private static boolean bootstrap4;

    /**
     *
     * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
     * <p>
     * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via file://
     */
    @Override
    public Page configure(Page page)
    {
        if (page.getBody().readChildrenPropertyFirstResult(BootstrapEnabledString, true))
        {
            page.getOptions().setjQueryEnabled(true);
            page.getBody().configureJQuery();

            Meta charMeta = new Meta();
            charMeta.addAttribute(MetaAttributes.Charset, "utf-16");

            Meta viewportMeta = new Meta();
            viewportMeta.addAttribute(GlobalAttributes.Name, "viewport");
            if (isBootstrap4())
            {
                viewportMeta.addAttribute(MetaAttributes.Content, "width=device-width, initial-scale=1, shrink-to-fit=no");
            }
            else
            {
                viewportMeta.addAttribute(MetaAttributes.Content, "width=device-width, initial-scale=1");
            }
            Meta compatMeta = new Meta();
            compatMeta.addAttribute(MetaAttributes.Http_Equiv, "X-UA-Compatible");
            compatMeta.addAttribute(MetaAttributes.Content, "IE=Edge");

            page.getHead().add(charMeta);
            page.getHead().add(compatMeta);
            page.getHead().add(viewportMeta);
            if (isBootstrap4())
            {
                page.getBody().addJavaScriptReference(BootstrapReferencePool.Bootstrap4TetherReference.getJavaScriptReference());
                page.getBody().addJavaScriptReference(BootstrapReferencePool.Bootstrap4CoreReference.getJavaScriptReference());
                page.getBody().addCssReference(BootstrapReferencePool.Bootstrap4CoreReference.getCssReference());
            }
            else
            {
                page.getBody().addJavaScriptReference(BootstrapReferencePool.BootstrapCoreReference.getJavaScriptReference());
                page.getBody().addCssReference(BootstrapReferencePool.BootstrapCoreReference.getCssReference());
            }
            page.getBody().addFeature(new BootstrapDialogFeature(page.getBody())); //Default error message dialogs

            if (page.getBrowser().compareTo(Browsers.InternetExplorer9) < 1)
            {
                page.getBody().addJavaScriptReference(new JavascriptReference("html5shim", 1.0, "https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js", RequirementsPriority.Fourth));
                page.getBody().addJavaScriptReference(new JavascriptReference("html5shimrespond", 1.0, "https://oss.maxcdn.com/respond/1.4.2/respond.min.js", RequirementsPriority.Fourth));
            }
        }
        return page;
    }

    public BootstrapPageConfigurator()
    {

    }

    /**
     * Sets if bootstrap is required or not on this component
     *
     * @param component
     * @param bootstrapRequired
     */
    public static void setBootstrapRequired(ComponentHierarchyBase component, Boolean bootstrapRequired)
    {
        component.getProperties().put(BootstrapEnabledString, bootstrapRequired);
    }

    /**
     * Whether or not this binder is building for bootstrap 4
     *
     * @return
     */
    public static boolean isBootstrap4()
    {
        return bootstrap4;
    }

    /**
     * Whether or not the binder is building for bootstrap 4
     *
     * @param bootstrap4
     */
    public static void setBootstrap4(boolean bootstrap4)
    {
        BootstrapPageConfigurator.bootstrap4 = bootstrap4;
    }

}
