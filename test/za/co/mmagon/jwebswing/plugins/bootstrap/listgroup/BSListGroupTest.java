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
package za.co.mmagon.jwebswing.plugins.bootstrap.listgroup;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_HASH;

/**
 * @author GedMarc
 */
public class BSListGroupTest extends BaseTestClass
{
	
	public BSListGroupTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		BSListGroup group = new BSListGroup();
		group.add(new BSListGroupListItem("List Item").setActive());
		
		System.out.println(group.toString(true));

		group.add(new BSListGroupLinkItem(STRING_HASH, "link item"));
		System.out.println(group.toString(true));
		
		group.add((BSListGroupButtonItem) new BSListGroupButtonItem().setText("button"));
		System.out.println(group.toString(true));
		
		group.add(((BSListGroupButtonItem) new BSListGroupButtonItem().setText("button")).setSuccess());
		group.add(((BSListGroupButtonItem) new BSListGroupButtonItem().setText("button")).setDanger());
		group.add(((BSListGroupButtonItem) new BSListGroupButtonItem().setText("button")).setWarning());
		group.add(((BSListGroupButtonItem) new BSListGroupButtonItem().setText("button")).setInfo());
		System.out.println(group.toString(true));

		group.add(((BSListGroupLinkItem) new BSListGroupLinkItem(StaticStrings.STRING_HASH, "").setText("button")).setSuccess());
		group.add(((BSListGroupLinkItem) new BSListGroupLinkItem(StaticStrings.STRING_HASH, "").setText("button")).setDanger());
		group.add(((BSListGroupLinkItem) new BSListGroupLinkItem(StaticStrings.STRING_HASH, "").setText("button")).setWarning());
		group.add(((BSListGroupLinkItem) new BSListGroupLinkItem(StaticStrings.STRING_HASH, "").setText("button")).setInfo());
		System.out.println(group.toString(true));
		
	}

}
