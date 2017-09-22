package za.co.mmagon.jwebswing.plugins.bootstrap.tabs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.ListItem;

import java.io.Serializable;

/**
 * A tab specific to Bootstrap 4
 */
public class BSTab<J extends BSTab> implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * The tab header item
	 */
	private ListItem tabHeader;
	/**
	 * The actual tab content to be displayd
	 */
	private Div tabContent;
	/**
	 * If this tab is active
	 */
	private boolean active;
	
	/**
	 * Construct a blank tab
	 */
	public BSTab()
	{
	}
	
	/**
	 * Construct a new tab with the given items
	 *
	 * @param tabHeader  The header of the tab
	 * @param tabContent The content of the tab
	 */
	public BSTab(ListItem tabHeader, Div tabContent)
	{
		this.tabHeader = tabHeader;
		this.tabContent = tabContent;
	}
	
	/**
	 * Returns the list item. Nullable
	 *
	 * @return
	 */
	public ListItem getTabHeader()
	{
		return tabHeader;
	}
	
	/**
	 * Sets the tab header
	 *
	 * @param tabHeader
	 */
	public void setTabHeader(ListItem tabHeader)
	{
		this.tabHeader = tabHeader;
	}
	
	/**
	 * Gets the tab content. Nullable
	 *
	 * @return
	 */
	public Div getTabContent()
	{
		return tabContent;
	}
	
	/**
	 * Sets the tab content
	 *
	 * @param tabContent
	 */
	public void setTabContent(Div tabContent)
	{
		this.tabContent = tabContent;
	}
	
	/**
	 * If this tab is set as active
	 *
	 * @return
	 */
	public boolean isActive()
	{
		return active;
	}
	
	/**
	 * Sets this tab as active (try only have one per tab set)
	 *
	 * @param active
	 *
	 * @return
	 */
	public J setActive(boolean active)
	{
		this.active = active;
		return (J) this;
	}
}
