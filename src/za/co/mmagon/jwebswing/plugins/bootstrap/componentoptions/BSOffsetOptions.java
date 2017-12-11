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
 * A list of all the column width settings from bootstrap
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 10, 2016
 */
public enum BSOffsetOptions implements IBSComponentOptions
{
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_1,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_2,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_3,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_4,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_5,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_6,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_7,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_8,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_9,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_10,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_11,
	/**
	 * From size XS the size should be 1
	 */
	col_xs_offset_12,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_1,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_2,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_3,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_4,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_5,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_6,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_7,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_8,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_9,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_10,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_11,
	/**
	 * From size SM (small) the size should be 1
	 */
	col_sm_offset_12,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_1,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_2,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_3,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_4,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_5,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_6,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_7,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_8,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_9,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_10,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_11,
	/**
	 * From size MD (medium) the size should be 1
	 */
	col_md_offset_12,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_1,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_2,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_3,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_4,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_5,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_6,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_7,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_8,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_9,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_10,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_11,
	/**
	 * For large LG only the size should be 1
	 */
	col_lg_offset_12,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_1,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_2,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_3,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_4,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_5,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_6,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_7,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_8,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_9,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_10,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_11,
	/**
	 * For large LG only the size should be 1
	 */
	col_xl_offset_12,;

	BSOffsetOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
