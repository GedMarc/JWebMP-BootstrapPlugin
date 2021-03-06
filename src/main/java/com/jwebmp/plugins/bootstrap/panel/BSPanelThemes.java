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

/**
 * @author GedMarc
 * @version 1.0
 * @since Oct 6, 2016
 */
public enum BSPanelThemes
{
	Info("panel-info"),
	Warning("panel-warning"),
	Danger("panel-danger"),
	Success("panel-success"),
	Primary("panel-primary"),
	Secondary("panel-secondary"),
	Tertiary("panel-tertiary"),
	Default("panel-default"),

	Green("panel-green"),
	Yellow("panel-yellow"),
	Red("panel-red");

	private String classText;

	BSPanelThemes(String classText)
	{
		this.classText = classText;
	}

	@Override
	public String toString()
	{
		return getClassText().toLowerCase();
	}

	/**
	 * Returns the class text
	 *
	 * @return
	 */
	public String getClassText()
	{
		return classText;
	}

	/**
	 * Sets the class text
	 *
	 * @param classText
	 */
	public void setClassText(String classText)
	{
		this.classText = classText;
	}

}
