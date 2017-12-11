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

import com.fasterxml.jackson.annotation.JsonValue;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_SPACE;

/**
 * Vertical alignment
 * <p>
 * Change the alignment of elements with the vertical-alignment utilities.
 * <p>
 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
 * <p>
 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSVerticalAlignmentOptions implements IBSComponentOptions
{
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_BaseLine,
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Top,
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Middle,
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Bottom,
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Text_Top,
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Text_Bottom;

	BSVerticalAlignmentOptions()
	{
		//Nothing needed
	}

	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase().replaceAll("\\$", STRING_SPACE).replaceAll("_", "-");

	}
}
