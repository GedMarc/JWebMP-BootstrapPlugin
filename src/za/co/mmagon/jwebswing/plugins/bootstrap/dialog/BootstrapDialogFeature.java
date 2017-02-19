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
package za.co.mmagon.jwebswing.plugins.bootstrap.dialog;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentBase;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class BootstrapDialogFeature extends Feature<BootstrapDialogOptions, BootstrapDialogFeature> implements BootstrapDialogFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private final ComponentBase forComponent;

    private BootstrapDialogOptions options;

    /**
     * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
     * <p>
     * @param forComponent
     */
    public BootstrapDialogFeature(ComponentBase forComponent)
    {
        super("Blank");
        this.forComponent = forComponent;
        //addJavaScriptReference(BootstrapDialogReferencePool.BootstrapTetherReference.getJavaScriptReference());
        addJavaScriptReference(BootstrapDialogReferencePool.BootstrapDialogReference.getJavaScriptReference());
        addCssReference(BootstrapDialogReferencePool.BootstrapDialogReference.getCssReference());
        //addCssReference(BootstrapDialogReferencePool.BootstrapTetherReference.getCssReference());
    }

    /**
     * Returns all the tooltip options
     * <p>
     * @return
     */
    @Override
    public BootstrapDialogOptions getOptions()
    {
        if (options == null)
        {
            options = new BootstrapDialogOptions();
        }
        return options;
    }

    @Override
    public void assignFunctionsToComponent()
    {
        String requiredString = forComponent.getJQueryID() + "blank(";
        requiredString += getOptions().toString();
        requiredString += ");" + getNewLine();
        //addQuery(requiredString);
    }
}
