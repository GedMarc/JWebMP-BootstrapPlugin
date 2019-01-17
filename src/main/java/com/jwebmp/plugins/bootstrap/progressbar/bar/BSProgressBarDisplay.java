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
package com.jwebmp.plugins.bootstrap.progressbar.bar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.options.BSColoursOptions;

import java.util.Objects;

/**
 * An implementation of the bootstrap bar
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
public class BSProgressBarDisplay<J extends BSProgressBarDisplay<J>>
		extends Div<IComponentHierarchyBase, BSProgressBarDisplayAttributes, BSProgressBarDisplayFeatures, BSProgressBarDisplayEvents, J>
		implements IBSProgressBarDisplay<J>
{


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

	}

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param min
	 * 		The minimum value
	 * @param max
	 * 		The maximum value
	 * @param value
	 * 		The actual percentage value
	 */
	public BSProgressBarDisplay(double min, double max, double value)
	{
		this(min, max, value, null);
	}

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param min
	 * 		The minimum value
	 * @param max
	 * 		The maximum value
	 * @param value
	 * 		The actual percentage value
	 * @param label
	 * 		The label to display
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

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param value
	 * 		The actual percentage value
	 */
	public BSProgressBarDisplay(double value)
	{
		this(0, 100, value);
	}

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param value
	 * 		The actual percentage value
	 * @param label
	 * 		The label to display
	 */
	public BSProgressBarDisplay(double value, String label)
	{
		this(0, 100, value, label);
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

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getSpan(), getTheme(), getMin(), getMax(), getValue(), getLabel());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSProgressBarDisplay))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSProgressBarDisplay<?> that = (BSProgressBarDisplay<?>) o;
		return Double.compare(that.getMin(), getMin()) == 0 && Double.compare(that.getMax(), getMax()) == 0 && Double.compare(that.getValue(), getValue()) == 0 && Objects.equals(
				getSpan(), that.getSpan()) && getTheme() == that.getTheme() && Objects.equals(getLabel(), that.getLabel());
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
		addAttribute(BSProgressBarDisplayAttributes.Aria_ValueMin, Double.toString(min));
		return (J) this;
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
		addAttribute(BSProgressBarDisplayAttributes.Aria_ValueMax, Double.toString(max));
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
		span.addClass(BSColoursOptions.Sr_Only);
		return span;
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
		addAttribute(BSProgressBarDisplayAttributes.Aria_Valuenow, Double.toString(value));
		addAttribute(GlobalAttributes.Style, "width:" + value + "%;");
		return (J) this;
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
		return (J) this;
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
}
