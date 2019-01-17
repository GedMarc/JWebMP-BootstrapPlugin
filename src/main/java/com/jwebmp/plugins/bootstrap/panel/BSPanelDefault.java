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

import com.jwebmp.core.base.html.Span;

import java.util.Objects;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * A default Bootstrap panel with a header row that has an icon and title
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 9, 2016
 */
public class BSPanelDefault<J extends BSPanelDefault<J>>
		extends BSPanel<J>
{


	/**
	 * The icon class
	 */
	private String icon;
	/**
	 * The title
	 */
	private Span title;

	/**
	 * Constructs a new default panel with an icon and a title
	 *
	 * @param icon
	 * @param title
	 */
	public BSPanelDefault(String icon, String title)
	{
		this();
		setIcon(icon);
		setTitle(new Span(STRING_SPACE + title));

	}

	/**
	 * Construct a default panel with header icon and title
	 */
	public BSPanelDefault()
	{
		super(BSPanelThemes.Default);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getPanelHeader().add(getIcon());
			if (getTitle() != null)
			{
				getPanelHeader().add(getTitle());
			}
		}
		super.preConfigure();
	}

	/**
	 * Gets the assigned icon class
	 *
	 * @return
	 */
	public String getIcon()
	{
		return icon;
	}

	/**
	 * Sets the assigned icon class
	 *
	 * @param icon
	 */
	public J setIcon(String icon)
	{
		this.icon = icon;
		return (J) this;
	}

	/**
	 * Gets the title
	 *
	 * @return
	 */
	public Span getTitle()
	{
		return title;
	}

	/**
	 * Sets the title
	 *
	 * @param title
	 */
	public J setTitle(Span title)
	{
		this.title = title;
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getIcon(), getTitle());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSPanelDefault))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSPanelDefault<?> that = (BSPanelDefault<?>) o;
		return Objects.equals(getIcon(), that.getIcon()) && Objects.equals(getTitle(), that.getTitle());
	}
}
