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
package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.client.Browsers;
import com.jwebmp.core.base.html.Meta;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.MetaAttributes;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapPlugin.jar/download")
public class BootstrapPageConfigurator
		implements IPageConfigurator
{
	private static final long serialVersionUID = 1L;
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * The default page configurator for bootstrap
	 */
	public BootstrapPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BootstrapPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BootstrapPageConfigurator.enabled = mustEnable;
	}

	/**
	 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
	 * <p>
	 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via file://
	 *
	 * @return
	 */
	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			Meta charMeta = new Meta();
			charMeta.addAttribute(MetaAttributes.Charset, "utf-16");

			Meta viewportMeta = new Meta();
			viewportMeta.addAttribute(GlobalAttributes.Name, "viewport");

			viewportMeta.addAttribute(MetaAttributes.Content, "width=device-width, initial-scale=1, maximum-scale=1,user-scalable=no");

			Meta compatMeta = new Meta();
			compatMeta.addAttribute(MetaAttributes.Http_Equiv, "X-UA-Compatible");
			compatMeta.addAttribute(MetaAttributes.Content, "IE=Edge");

			page.getHead()
			    .add(charMeta);
			page.getHead()
			    .add(compatMeta);
			page.getHead()
			    .add(viewportMeta);

			page.getBody()
			    .addJavaScriptReference(BootstrapReferencePool.BootstrapCoreReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BootstrapReferencePool.BootstrapCoreReference.getCssReference());
			if (page.getBrowser()
			        .compareTo(Browsers.InternetExplorer9) < 1)
			{
				page.getBody()
				    .addJavaScriptReference(new JavascriptReference("html5shim", 1.0, "https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js", RequirementsPriority.Fourth));
				page.getBody()
				    .addJavaScriptReference(new JavascriptReference("html5shimrespond", 1.0, "https://oss.maxcdn.com/respond/1.4.2/respond.min.js", RequirementsPriority.Fourth));
			}

		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return BootstrapPageConfigurator.enabled;
	}

}
