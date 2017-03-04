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
package za.co.mmagon.jwebswing.plugins.bootstrap.panel;

import za.co.mmagon.jwebswing.base.html.Span;

/**
 * A default Bootstrap panel with a header row that has an icon and title
 *
 * @author GedMarc
 * @since Oct 9, 2016
 * @version 1.0
 *
 */
public class BSPanelDefault extends BSPanel
{

    private static final long serialVersionUID = 1L;
    /**
     * The icon class
     */
    private String icon;
    /**
     * The title
     */
    private Span title;

    /**
     * Construct a default panel with header icon and title
     */
    public BSPanelDefault()
    {
        super(BSPanelThemes.Default);
    }

    public BSPanelDefault(String icon, String title)
    {
        this();
        setIcon(icon);
        setTitle(new Span(" " + title));

    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            getPanelHeader().add(getIcon());
            getPanelHeader().add(getTitle());
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
    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    //@TODO Glyphicons
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
    public void setTitle(Span title)
    {
        this.title = title;
    }
}
