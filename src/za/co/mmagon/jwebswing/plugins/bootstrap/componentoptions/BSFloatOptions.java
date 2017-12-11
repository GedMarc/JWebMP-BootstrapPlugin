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
package za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions;

import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;

/**
 * Responsive floats
 * <p>
 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
 * issues. These use the same viewport width breakpoints as the grid system.
 * <p>
 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSFloatOptions implements IBSComponentOptions
{
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_xs_Left,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_sm_Left,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_md_Left,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_lg_Left,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_xl_Left,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_xs_Right,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_sm_Right,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_md_Right,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_lg_Right,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_xl_Right,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_xs_None,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_sm_None,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_md_None,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_lg_None,
	/**
	 * Responsive floats
	 * <p>
	 * These utility classes float an element to the left or right, or disable floating, based on the current viewport size using the CSS float property. !important is included to avoid specificity
	 * issues. These use the same viewport width breakpoints as the grid system.
	 * <p>
	 * Two similar non-responsive Sass mixins (float-left and float-right) are also available.
	 */
	Float_xl_None,;

	@Override
	public String toString()
	{
		return name().toLowerCase().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
