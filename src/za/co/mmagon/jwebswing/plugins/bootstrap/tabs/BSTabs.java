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
package za.co.mmagon.jwebswing.plugins.bootstrap.tabs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.plugins.bootstrap.accordion.BSAccordionAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSComponentNavsOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSNavs;
import za.co.mmagon.jwebswing.plugins.bootstrap.toggle.BSToggleAttributes;
import za.co.mmagon.logger.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * Tabs Takes the basic nav from above and adds the .nav-tabs class to generate a tabbed interface. Use them to create tabbable regions with our tab JavaScript plugin.
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSTabs<J> extends DivSimple<BSTabs<J>>
{
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogFactory.getLog("BSTabs");
	/**
	 * The tabs to render
	 */
	private List<BSTab> tabs;
	/**
	 * The actual tabs
	 */
	private BSNavs navigation;
	/**
	 * The tab content
	 */
	private Div tabContent;


	/**
	 * Tabs Takes the basic nav from above and adds the .nav-tabs class to generate a tabbed interface. Use them to create tabbable regions with our tab JavaScript plugin.
	 */
	public BSTabs()
	{
		super();
		setRenderIDAttibute(false);
		getNavigation().addClass(BSComponentNavsOptions.Nav_Tabs);
		getNavigation().setTag("ul");
		getNavigation().addAttribute("role", "tablist");
	}

	public J addTab(BSTab tab)
	{
		getTabs().add(tab);
		return (J) this;
	}

	/**
	 * Gets the navigation component, not allowed to be null
	 *
	 * @return
	 */
	protected BSNavs getNavigation()
	{
		if (navigation == null)
		{
			navigation = new BSNavs();
		}
		return navigation;
	}

	/**
	 * Sets the navigation component
	 *
	 * @param navigation
	 *
	 * @return
	 */
	protected J setNavigation(BSNavs navigation)
	{
		this.navigation = navigation;
		return (J) this;
	}

	/**
	 * Aligns the tabs to fill the available space in Justify mode
	 *
	 * @return
	 */
	public J setJustify(boolean justified)
	{
		if (justified)
		{
			addClass(BSComponentNavsOptions.Nav_Fill);
		}
		else
		{
			removeClass(BSComponentNavsOptions.Nav_Fill);
		}
		return (J) this;
	}

	/**
	 * Returns the current list of tabs
	 *
	 * @return
	 */
	public List<BSTab> getTabs()
	{
		if (this.tabs == null)
		{
			setTabs(new ArrayList<>());
		}
		return tabs;
	}

	/**
	 * Sets the tab list
	 *
	 * @param tabs
	 *
	 * @return
	 */
	public J setTabs(List<BSTab> tabs)
	{
		this.tabs = tabs;
		return (J) this;
	}

	/**
	 * Returns the tab content div. Never Null
	 *
	 * @return
	 */
	public Div getTabContent()
	{
		if (tabContent == null)
		{
			setTabContent(new Div());
		}
		return tabContent;
	}

	/**
	 * Sets the tab content
	 *
	 * @param tabContent
	 */
	public J setTabContent(Div tabContent)
	{
		this.tabContent = tabContent;
		if (this.tabContent != null)
		{
			this.tabContent.addClass("tab-content");
			this.tabContent.setRenderIDAttibute(false);
		}
		return (J) this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			add(getNavigation());
			add(getTabContent());

			for (BSTab tab : getTabs())
			{
				if (tab.getTabContent() == null || tab.getTabHeader() == null)
				{
					log.warning("Invalid Bootstrap Tab - Either content or header is missing. Will not render");
					continue;
				}

				ListItem li = tab.getTabHeader();
				li.addClass(BSComponentNavsOptions.Nav_Item);

				Link link = new Link();
				link.addClass(BSComponentNavsOptions.Nav_Link);
				link.addAttribute(BSToggleAttributes.Data_Toggle, "tab");
				link.addAttribute(BSAccordionAttributes.Role, "tab");
				link.setDirectToAddress(tab.getTabContent().getID(true));
				if (!li.getText(0).toString().isEmpty())
				{
					link.setText(li.getText(0));
					li.setText("");
				}

				tab.getTabContent().addClass(BSDefaultOptions.Tab_Pane);
				tab.getTabContent().addAttribute(BSAccordionAttributes.Role, "tabpanel");

				if (tab.isActive())
				{
					link.addClass(BSDefaultOptions.Active);
					tab.getTabContent().addClass(BSDefaultOptions.Active);
				}

				li.add(link);
				getNavigation().add(li);
				getTabContent().add(tab.getTabContent());
			}
		}
		super.init();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSTabs))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSTabs<?> bsTabs = (BSTabs<?>) o;
		return Objects.equals(getTabs(), bsTabs.getTabs()) &&
				Objects.equals(getNavigation(), bsTabs.getNavigation()) &&
				Objects.equals(getTabContent(), bsTabs.getTabContent());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getTabs(), getNavigation(), getTabContent());
	}
}
