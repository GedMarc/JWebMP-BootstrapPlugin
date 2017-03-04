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
package za.co.mmagon.jwebswing.plugins.bootstrap.breadcrumbs;

import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Breadcrumb
 * <p>
 * Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and content.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Breadcrumbs", description = "Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and content.",
        url = "https://v4-alpha.getbootstrap.com/components/breadcrumb/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSBreadcrumbs extends List<BSBreadcrumbsChildren, BSBreadcrumbsAttributes, BSBreadcrumbsEvents, BSBreadcrumbs>
{

    private static final long serialVersionUID = 1L;

    /**
     * Breadcrumbs
     * <p>
     * Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and content.
     */
    @SuppressWarnings("")
    public BSBreadcrumbs()
    {
        addClass(BSComponentBreadcrumbOptions.Breadcrumb);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            getChildren().forEach(next ->
            {
                next.removeClass(BSComponentBreadcrumbOptions.Active);
            });
            getChildren().get(getChildren().size() - 1).addClass(BSComponentBreadcrumbOptions.Active);
        }
        super.preConfigure();
    }

    /**
     * Convenience method for quick access
     *
     * @param crumb
     *
     * @return
     */
    public BSBreadcrumbs add(BSBreadcrumb crumb)
    {
        return super.add(crumb);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + (this.getID().hashCode());
        return hash;
    }
}
