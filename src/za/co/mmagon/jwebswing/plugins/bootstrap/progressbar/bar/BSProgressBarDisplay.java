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
package za.co.mmagon.jwebswing.plugins.bootstrap.progressbar.bar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentColoursOptions;

/**
 * An implementation of the bootstrap bar
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 29 Aug 2015
 * @version 1.0
 */
public class BSProgressBarDisplay<J extends BSProgressBarDisplay>
        extends Div<GlobalChildren, BSProgressBarDisplayAttributes, BSProgressBarDisplayFeatures, BSProgressBarDisplayEvents, J> implements IBSProgressBarDisplay<J>
{

    private static final long serialVersionUID = 1L;
    private BSProgressBarDisplayFeature feature;

    private Span span;
    private BSProgressBarThemes theme;

    /**
     * The min value to apply
     */
    private double min;
    /**
     * The max value to apply
     */
    private double max;
    /**
     * The value to apply
     */
    private double value;
    /**
     * The label of the bar
     */
    private String label;

    /**
     * Constructs an empty progress bar display
     */
    public BSProgressBarDisplay()
    {

        this(0, 100, 0);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Construct a new progress bar display with the given values
     *
     * @param value The actual percentage value
     */
    public BSProgressBarDisplay(double value)
    {
        this(0, 100, value);
    }

    /**
     * Construct a new progress bar display with the given values
     *
     * @param min   The minimum value
     * @param max   The maximum value
     * @param value The actual percentage value
     */
    public BSProgressBarDisplay(double min, double max, double value)
    {
        this(min, max, value, null);
    }

    /**
     * Construct a new progress bar display with the given values
     *
     * @param value The actual percentage value
     * @param label The label to display
     */
    public BSProgressBarDisplay(double value, String label)
    {
        this(0, 100, value, label);
    }

    /**
     * Construct a new progress bar display with the given values
     *
     * @param min   The minimum value
     * @param max   The maximum value
     * @param value The actual percentage value
     * @param label The label to display
     */
    public BSProgressBarDisplay(double min, double max, double value, String label)
    {
        setMin(min);
        setMax(max);
        setValue(value);
        setLabel(label);
        addClass("progress-bar");
        addAttribute(BSProgressBarDisplayAttributes.Role, "progressbar");
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            addClass(getTheme().getClassText());
        }
        super.preConfigure();
    }

    /**
     * Returns the current min value
     *
     * @return
     */
    public double getMin()
    {
        return min;
    }

    /**
     * Returns the current min value
     *
     * @param min
     *
     * @return
     */
    @Override
    public final J setMin(double min)
    {
        this.min = min;
        addAttribute(BSProgressBarDisplayAttributes.Aria_ValueMin, min + "");
        return (J) this;
    }

    /**
     * Gets the current max value
     *
     * @return
     */
    @Override
    public double getMax()
    {
        return max;
    }

    /**
     * Sets the current max value
     *
     * @param max
     *
     * @return
     */
    @Override
    public final J setMax(double max)
    {
        this.max = max;
        addAttribute(BSProgressBarDisplayAttributes.Aria_ValueMax, max + "");
        return (J) this;
    }

    /**
     * Returns the current percentage
     *
     * @return
     */
    @Override
    public double getValue()
    {
        return value;
    }

    /**
     * Sets the current percentage / width
     *
     * @param value
     *
     * @return
     */
    @Override
    public final J setValue(double value)
    {
        this.value = value;
        addAttribute(BSProgressBarDisplayAttributes.Aria_Valuenow, value + "");
        addAttribute(GlobalAttributes.Style, "width:" + value + "%;");
        return (J) this;
    }

    /**
     * Returns this associated span
     *
     * @return
     */
    @Override
    public Span getSpan()
    {
        if (span == null)
        {
            span = new Span();
            add(span);
        }
        span.addClass(BSComponentColoursOptions.Sr_Only);
        return span;
    }

    /**
     * Returns this label
     *
     * @return
     */
    @Override
    public String getLabel()
    {
        return label;
    }

    /**
     * Sets this label
     *
     * @param label
     *
     * @return
     */
    @Override
    public final J setLabel(String label)
    {
        this.label = label;
        getSpan().setText(label);
        return (J) this;
    }

    public final BSProgressBarDisplayFeature getFeature()
    {
        if (feature == null)
        {
            feature = new BSProgressBarDisplayFeature(this);
        }
        return feature;
    }

    @Override
    public BSProgressBarDisplayOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * Returns a current theme, default is success
     *
     * @return
     */
    @Override
    public BSProgressBarThemes getTheme()
    {
        if (theme == null)
        {
            setTheme(BSProgressBarThemes.Success);
        }
        return theme;
    }

    /**
     * Sets the current theme
     *
     * @param theme
     *
     * @return
     */
    @Override
    public J setTheme(BSProgressBarThemes theme)
    {
        if (this.theme != null)
        {
            removeClass(theme.getClassText());
        }
        this.theme = theme;
        if (theme != null)
        {
            addClass(theme.getClassText());
        }
        else
        {

        }
        return (J) this;
    }

}
