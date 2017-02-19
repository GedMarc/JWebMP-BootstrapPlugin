/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap.alerts;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.events.click.ClickAdapter;
import za.co.mmagon.jwebswing.plugins.bootstrap.alerts.events.BSAlertCloseEvent;
import za.co.mmagon.jwebswing.plugins.bootstrap.alerts.events.BSAlertClosedEvent;

/**
 *
 * @author GedMarc
 */
public class BSAlertTest extends BaseTestClass
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
        al.asMe().setWarning(true);
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
            public void onClose(AjaxCall call, AjaxResponse response)
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
        Page p = getInstance();
        p.getBody().add(new BSAlert());
        System.out.println(p.toString(true));
    }
}
