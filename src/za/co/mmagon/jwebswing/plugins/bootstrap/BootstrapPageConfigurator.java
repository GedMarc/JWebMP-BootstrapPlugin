/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.client.Browsers;
import za.co.mmagon.jwebswing.base.html.Meta;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.MetaAttributes;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via file://
 */
@PluginInformation(pluginName = "Bootstrap",
                   pluginDescription = "Bootstrap is the most popular HTML, CSS, and JS framework for developing responsive, mobile first projects on the web.<br/> We are bootstrap 4 ready!",
                   pluginUniqueName = "jwebswing-bootstrap",
                   pluginVersion = "3.3.7 / 4a6",
                   pluginCategories = "bootstrap,ui,web ui, framework",
                   pluginSubtitle = "Bootstrap makes front-end web development faster and easier.",
                   pluginSourceUrl = "http://getbootstrap.com/",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin",
                   pluginIconUrl = "bower_components/bootstrap/bootstrapicon.jpg",
                   pluginIconImageUrl = "bower_components/bootstrap/bootstraplogo.jpg",
                   pluginOriginalHomepage = "http://getbootstrap.com/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapPlugin.jar/download"
)
public class BootstrapPageConfigurator extends PageConfigurator
{

    private static final Logger log = LogFactory.getInstance().getLogger("Bootstrap");
    @JsonIgnore
    public static final String BootstrapEnabledString = "bootstrap-enabled";
    /**
     * If the generator is generating for bootstrap 4
     */
    private static boolean bootstrap4;
    private static final long serialVersionUID = 1L;

    /**
     *
     * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
     * <p>
     * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via file://
     *
     * @return
     */
    @Override
    public Page configure(Page page)
    {
        // log.info("Configuring for bootstrap");
        //  if (page.getBody().readChildrenPropertyFirstResult(BootstrapEnabledString, true))
        {
            JQueryPageConfigurator.setRequired(page.getBody(), true);
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
            if (page.getBrowser().compareTo(Browsers.InternetExplorer9) < 1)
            {
                page.getBody().addJavaScriptReference(new JavascriptReference("html5shim", 1.0, "https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js", RequirementsPriority.Fourth));
                page.getBody().addJavaScriptReference(new JavascriptReference("html5shimrespond", 1.0, "https://oss.maxcdn.com/respond/1.4.2/respond.min.js", RequirementsPriority.Fourth));
            }
        }
        //  else
        //    log.warning("No components using bootstrap were found");
        //   }
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
