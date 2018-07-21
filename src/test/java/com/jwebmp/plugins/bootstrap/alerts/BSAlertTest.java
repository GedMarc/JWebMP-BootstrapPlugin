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
package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.events.click.ClickAdapter;
import com.jwebmp.plugins.bootstrap.alerts.events.BSAlertCloseEvent;
import com.jwebmp.plugins.bootstrap.alerts.events.BSAlertClosedEvent;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSAlertTest

{

	public BSAlertTest()
	{
	}

	@Test
	public void testAlert()
	{
		BSAlert al = new BSAlert();
		System.out.println(al.toString(true));
	}

	@Test
	public void testCreateDismissButton()
	{
		BSAlert al = new BSAlert();
		ComponentHierarchyBase o = al.createDismissButton();
		System.out.println(o.toString(true));

		System.out.println(al.toString(true));
	}

	@Test
	public void testSetDanger()
	{
		BSAlert al = new BSAlert();
		al.setDanger(true);
		System.out.println(al.toString(true));
	}

	@Test
	public void testSetInfo()
	{
		BSAlert al = new BSAlert();
		al.setInfo(true);
		System.out.println(al.toString(true));
	}

	@Test
	public void testSetLink()
	{
		BSAlert al = new BSAlert();
		al.setLink(true);
		System.out.println(al.toString(true));
	}

	@Test
	public void testSetSuccess()
	{
		BSAlert al = new BSAlert();
		al.setSuccess(true);
		System.out.println(al.toString(true));
	}

	@Test
	public void testSetWarning()
	{
		BSAlert al = new BSAlert();
		al.setWarning(true);
		System.out.println(al.toString(true));
	}

	@Test
	public void testAsMe()
	{
		BSAlert al = new BSAlert();
		al.asMe()
		  .setWarning(true);
		System.out.println(al.toString(true));
	}

	@Test
	public void testEvents()
	{
		BSAlert al = new BSAlert();
		al.addEvent(new BSAlertCloseEvent(al)
		{
			@Override
			public void onClose(AjaxCall call, AjaxResponse response)
			{
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		});
		al.setID("id");
		al.addEvent(new BSAlertClosedEvent(al)
		{
			@Override
			public void onClosed(AjaxCall call, AjaxResponse response)
			{
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		});

		al.addEvent(new ClickAdapter(al)
		{
			@Override
			public void onClick(AjaxCall call, AjaxResponse response)
			{
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		});

		System.out.println(al.toString(true));
	}

	@Test
	public void testInPage()
	{
		Page p = new Page();
		p.getBody()
		 .add(new BSAlert());
		System.out.println(p.toString(true));
	}
}
