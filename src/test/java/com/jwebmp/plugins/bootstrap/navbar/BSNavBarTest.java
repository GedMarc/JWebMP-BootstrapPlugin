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
package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.html.Image;
import com.jwebmp.plugins.bootstrap.forms.BSFormInline;
import com.jwebmp.plugins.bootstrap.navbar.brand.BSNavBarBrandImage;
import com.jwebmp.plugins.bootstrap.navbar.toggler.BSNavBarToggler;
import com.jwebmp.plugins.bootstrap.navbar.toggler.BSNavBarTogglerAlignments;
import com.jwebmp.plugins.bootstrap.navbar.toggler.BSNavBarTogglerSizes;
import com.jwebmp.plugins.bootstrap.navs.BSNavItemDropDown;
import com.jwebmp.plugins.bootstrap.navs.BSNavLinkItem;
import com.jwebmp.plugins.bootstrap.navs.BSNavs;
import org.junit.jupiter.api.Test;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author GedMarc
 */
public class BSNavBarTest
{

	public BSNavBarTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSNavBar nav = new BSNavBar(BSNavBarTogglerSizes.Navbar_Toggleable_MD, BSNavBarColourSchemes.Navbar_Light, BSNavBarColourSchemes.BG_Faded).setPositioning(
				BSNavBarPositioning.Fixed_Top);

		BSNavBarToggler toggle = new BSNavBarToggler(BSNavBarTogglerAlignments.Navbar_Toggler_Right);
		nav.add(toggle);
		nav.add(new BSNavBarBrandImage(new Image("image")));

		BSNavs navs = new BSNavs();
		navs.add(new BSNavItemDropDown());
		navs.add(new BSNavLinkItem(STRING_HASH));

		navs.add(new BSFormInline());

		nav.add(toggle.createCollapsingDiv(navs));

		System.out.println(nav.toString(true));
	}

}
