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
package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Alerts
 * <p>
 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
@ComponentInformation(name = "Bootstrap Alert",
		description = "rovide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.",
		url = "https://v4-alpha.getbootstrap.com/components/alerts/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSAlert<J extends BSAlert<J>>
		extends Div<IComponentHierarchyBase, BSAlertAttributes, GlobalFeatures, BSAlertEvents, J>
		implements IBSAlert<J>
{


	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlert()
	{
		addAttribute(BSAlertAttributes.Role, "alert");
		addClass(BSComponentAlertOptions.Alert);

	}

	/**
	 * Neater view of this component
	 *
	 * @return
	 */
	public IBSAlert asMe()
	{
		return this;
	}

	/**
	 * Adds the link styling for an alert to any component
	 *
	 * @param <T>
	 * @param component
	 *
	 * @return
	 */
	@Override
	public <T extends ComponentHierarchyBase> T addLinkStyle(T component)
	{
		component.addClass(BSComponentAlertOptions.Alert_Link);
		return component;
	}

	/**
	 * Creates and adds dismiss button assigned to this alert
	 *
	 * @return
	 */
	@Override
	public BSAlertDismissButton createDismissButton()
	{
		BSAlertDismissButton news = new BSAlertDismissButton(this, true);
		add(news);
		return news;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	public J setDanger(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSComponentAlertOptions.Alert_Danger);
		}
		else

		{
			removeClass(BSComponentAlertOptions.Alert_Danger);
		}

		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	public J setInfo(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSComponentAlertOptions.Alert_Info);
		}
		else
		{
			removeClass(BSComponentAlertOptions.Alert_Info);
		}

		return (J) this;
	}

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	public J setLink(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSComponentAlertOptions.Alert_Link);
		}
		else
		{
			removeClass(BSComponentAlertOptions.Alert_Link);
		}

		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	public J setSuccess(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSComponentAlertOptions.Alert_Success);
		}
		else
		{
			removeClass(BSComponentAlertOptions.Alert_Success);
		}
		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	public J setWarning(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSComponentAlertOptions.Alert_Warning);
		}
		else
		{
			removeClass(BSComponentAlertOptions.Alert_Warning);
		}
		return (J) this;
	}

}
