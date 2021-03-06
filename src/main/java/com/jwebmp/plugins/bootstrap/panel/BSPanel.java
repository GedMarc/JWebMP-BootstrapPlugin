/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap.panel;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.utilities.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;

import java.util.Iterator;

/**
 * An implementation of the bootstrap panel layout.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Panel",
		description = "Panels can be used with bootstrap 3",
		url = "https://v4-alpha.getbootstrap.com/components/cards/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSPanel<J extends BSPanel<J>>
		extends Div<IComponentHierarchyBase, BSPanelAttributes, BSPanelFeatures, BSPanelEvents, J>
{


	/**
	 * The Panel Header Button Bar
	 */
	private Div panelHeaderButtonBar;

	/**
	 * The panel header
	 */
	private Div panelHeader;
	/*
	 * The panel body
	 */
	private Div panelBody;

	/**
	 * Specifies if the footer must render as a link, or as a div
	 */
	private boolean footerIsLink;

	/**
	 * The panel footer
	 */
	private Component panelFooter;
	/**
	 * The theme associated
	 */
	private BSPanelThemes theme;

	/**
	 * Construct a new controlled instance of the sb2 panel
	 *
	 * @param theme
	 */
	public BSPanel(BSPanelThemes theme)
	{
		addClass("panel");
		setTheme(theme);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getChildren().clear();
			getChildren().add(panelHeader);
			getChildren().add(panelBody);
			getChildren().add(panelFooter);

			if (panelFooter != null)
			{
				configureFooter();
			}
		}
		super.preConfigure();
	}

	/**
	 * Configures the footer
	 */
	private void configureFooter()
	{
		if (footerIsLink)
		{
			for (Iterator it = getPanelFooter().getChildren()
			                                   .iterator(); it.hasNext(); )
			{
				ComponentHierarchyBase comp = (ComponentHierarchyBase) it.next();
				comp.addClass(BSComponentPanelOptions.Panel_Footer);
			}
		}
	}

	/**
	 * Gets the panel footer as a link. Class cast exception may occur if you have set the footer to a custom component
	 *
	 * @return
	 */
	public Component getPanelFooter()
	{
		if (panelFooter == null)
		{
			setPanelFooter(new Link(StaticStrings.STRING_HASH));
			return panelFooter;
		}
		return panelFooter;
	}

	/**
	 * Sets the panel footer as a link with formatting
	 *
	 * @param panelFooter
	 */
	public void setPanelFooter(Link panelFooter)
	{
		this.panelFooter = panelFooter;
		if (this.panelFooter != null)
		{
			this.panelFooter.addClass(BSComponentPanelOptions.Panel_Footer);
		}
		footerIsLink = true;
	}

	/**
	 * Sets the panel footer as a regular div
	 *
	 * @param panelFooter
	 */
	public void setPanelFooter(Div panelFooter)
	{
		this.panelFooter = panelFooter;
		if (this.panelFooter != null)
		{
			this.panelFooter.addClass(BSComponentPanelOptions.Panel_Footer);
		}
		footerIsLink = false;
	}

	/**
	 * Sets and adds the panel body
	 *
	 * @return
	 */
	public Div getPanelBody()
	{
		if (panelBody == null)
		{
			setPanelBody(new Div());
		}
		return panelBody;
	}

	/**
	 * Sets the panel body
	 *
	 * @param panelBody
	 */
	public void setPanelBody(Div panelBody)
	{
		getChildren().remove(this.panelBody);
		this.panelBody = panelBody;
		if (this.panelBody != null)
		{
			this.panelBody.addClass(BSComponentPanelOptions.Panel_Body);
		}
	}

	/**
	 * Returns the current theme attached, default is the default
	 *
	 * @return
	 */
	public BSPanelThemes getTheme()
	{
		if (theme == null)
		{
			theme = BSPanelThemes.Default;
		}
		return theme;
	}

	/**
	 * Sets the theme to the given settings
	 *
	 * @param theme
	 */
	public final void setTheme(BSPanelThemes theme)
	{
		if (this.theme != null)
		{
			removeClass(this.theme.getClassText());
		}
		this.theme = theme;
		addClass(theme.getClassText());
	}

	/**
	 * Adds a button to the drop down header
	 *
	 * @param dropDownIcon
	 * @param dropDownContent
	 */
	public void addDropDownToHeaderButtonBar(ComponentHierarchyBase dropDownIcon, ComponentHierarchyBase dropDownContent)
	{
		Button b = new Button();
		b.addClass("btn btn-default btn-xs dropdown-toggle");
		b.add(dropDownIcon);
		b.addAttribute(ButtonAttributes.Type, "button");
		b.addAttribute(ButtonAttributes.Data_Toggle, "dropdown");

		dropDownContent.setTag("ul");
		dropDownContent.addClass("dropdown-menu slidedown");

		getPanelHeaderButtonBar().add(b);
		getPanelHeaderButtonBar().add(dropDownContent);
	}

	/**
	 * Returns the Panel Headers Button Bar
	 *
	 * @return
	 */
	public Div getPanelHeaderButtonBar()
	{
		if (panelHeaderButtonBar == null)
		{
			setPanelHeaderButtonBar(new Div());
		}
		return panelHeaderButtonBar;
	}

	/**
	 * Sets the panel header button bar to the assigned Div
	 *
	 * @param panelHeaderButtonBar
	 */
	public void setPanelHeaderButtonBar(Div panelHeaderButtonBar)
	{
		this.panelHeaderButtonBar = panelHeaderButtonBar;
		if (panelHeaderButtonBar != null)
		{
			panelHeaderButtonBar.addClass(BSDefaultOptions.Btn_Group);
			panelHeaderButtonBar.addClass(BSDefaultOptions.Pull_Right);
			getPanelHeader().add(panelHeaderButtonBar);
		}
	}

	/**
	 * Gets the panel header
	 *
	 * @return
	 */
	public Div getPanelHeader()
	{
		if (panelHeader == null)
		{
			setPanelHeader(new Div());
		}

		return panelHeader;
	}

	/**
	 * Sets the panel header
	 *
	 * @param panelHeader
	 */
	public void setPanelHeader(Div panelHeader)
	{
		this.panelHeader = panelHeader;
		if (this.panelHeader != null)
		{
			this.panelHeader.addClass(BSComponentPanelOptions.Panel_Heading);
		}
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
