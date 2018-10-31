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
package com.jwebmp.plugins.bootstrap.close;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.options.BSCloseIconOptions;

import java.util.Objects;

/**
 * Close icon
 * <p>
 * Use a generic close icon for dismissing content like modals and alerts. Be sure to include text for screen readers, as we’ve done with aria-label.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
@ComponentInformation(name = "Bootstrap Dismiss Buttons",
		description = "Use a generic close icon for dismissing content like modals and alerts. Be sure to include text for screen readers, as we’ve done with aria-label.",
		url = "https://v4-alpha.getbootstrap.com/utilities/close-icon/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSCloseIcon<J extends BSCloseIcon<J>>
		extends Button<IComponentHierarchyBase, NoAttributes, GlobalFeatures, GlobalEvents, J>
{


	/**
	 * The actual close icon
	 */
	private Span closeIcon;
	/**
	 * The actual text for the close icon
	 */
	private String closeIconText = "&times;";

	/**
	 * Constructs a new instance of the close icon
	 * <p>
	 */
	@SuppressWarnings("")
	public BSCloseIcon()
	{
		setAriaLabel("Close");
		addClass(BSCloseIconOptions.Close);
		addAttribute(GlobalAttributes.Type, "button");
		getCloseIcon();

	}

	/**
	 * Sets the label to be shown on screen readers
	 *
	 * @param label
	 *
	 * @return
	 */
	public BSCloseIcon setAriaLabel(String label)
	{
		addAttribute(GlobalAttributes.Aria_Label, label);
		return this;
	}

	/**
	 * The physical close icon span display
	 *
	 * @return
	 */
	public Span getCloseIcon()
	{
		if (closeIcon == null)
		{
			setCloseIcon(new Span(closeIconText));
		}
		return closeIcon;
	}

	/**
	 * The physical close icon span
	 *
	 * @param closeIcon
	 *
	 * @return
	 */
	public BSCloseIcon setCloseIcon(Span closeIcon)
	{
		if (this.closeIcon != null)
		{
			remove(this.closeIcon);
			this.closeIcon = null;
		}
		this.closeIcon = closeIcon;
		if (this.closeIcon != null)
		{
			add(this.closeIcon);
			this.closeIcon.addAttribute(GlobalAttributes.Aria_Hidden, "true");
		}
		return this;
	}

	/**
	 * Sets the close icon as a data dismissable
	 *
	 * @param dismiss
	 *
	 * @return
	 */
	public BSCloseIcon setDataDismiss(String dismiss)
	{
		addAttribute("data-dismiss", dismiss);
		return this;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getCloseIcon(), getCloseIconText());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSCloseIcon))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSCloseIcon<?> that = (BSCloseIcon<?>) o;
		return Objects.equals(getCloseIcon(), that.getCloseIcon()) && Objects.equals(getCloseIconText(), that.getCloseIconText());
	}

	/**
	 * Return the text used for the close icon
	 *
	 * @return
	 */
	public String getCloseIconText()
	{
		return closeIconText;
	}

	/**
	 * Sets the close icon text for the span
	 *
	 * @param closeIconText
	 */
	public void setCloseIconText(String closeIconText)
	{
		this.closeIconText = closeIconText;
		if (this.closeIconText != null)
		{
			getCloseIcon().setText(closeIconText);
		}
	}
}
