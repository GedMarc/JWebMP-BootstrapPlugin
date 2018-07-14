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
package com.jwebmp.plugins.bootstrap.buttons.toolbars;

import com.jwebmp.plugins.bootstrap.buttons.BSButtonSuccess;
import com.jwebmp.plugins.bootstrap.buttons.groups.BSButtonGroup;
import com.jwebmp.plugins.bootstrap.buttons.groups.BSButtonGroupLabel;
import com.jwebmp.plugins.bootstrap.buttons.groups.BSButtonGroupRadioButton;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSButtonToolbarTest

{

	public BSButtonToolbarTest()
	{
	}

	@Test
	public void testToolbar()
	{
		BSButtonToolbar bbt = new BSButtonToolbar();
		bbt.setID("toolbar");
		System.out.println(bbt.toString(true));

		BSButtonGroup group = new BSButtonGroup();
		group.setID("group");
		bbt.add(group);
		System.out.println(bbt.toString(true));

		BSButtonSuccess bbs = new BSButtonSuccess();
		BSButtonGroupLabel lbl;
		group.add(lbl = new BSButtonGroupLabel<>("stuff", new BSButtonGroupRadioButton()).setID("label"));
		BSButtonGroupRadioButton.class.cast(lbl.getInput())
		                              .setID("label");
		bbs.setID("button");

		System.out.println(bbt.toString(true));
	}
}
