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
package za.co.mmagon.jwebswing.plugins.bootstrap.buttons;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;

/**
 *
 * @author GedMarc
 */
public class BSButtonTest extends BaseTestClass
{

    public BSButtonTest()
    {
    }

    @Test
    public void testPreConfigure()
    {
        BSButton button = new BSButton();
        button.setTag("a");

        System.out.println(button.toString(true));

        button = new BSButton();
        button.setTag("a");
        button.setDisabled(true);

        System.out.println(button.toString(true));
    }

    @Test
    public void testSetSize()
    {
        BSButton button = new BSButton();
        button.setSize(BSComponentButtonSizeOptions.Btn_Lg).setDangerOutline(true);

        System.out.println(button.toString(true));
    }

    @Test
    public void testSetPressed()
    {
        BSButton button = new BSButton();
        button.setPressed(true);

        System.out.println(button.toString(true));
        button.setPressed(false);

        System.out.println(button.toString(true));
    }

    @Test
    public void testSetDisabled()
    {
        BSButton button = new BSButton();
        button.setDisabled(true);

        System.out.println(button.toString(true));
        button.setDisabled(false);

        System.out.println(button.toString(true));
    }

    @Test
    public void testSetPrimary()
    {
        BSButton button = new BSButton();
        button.setPrimary(true);

        System.out.println(button.toString(true));
        button.setPrimary(false);

        System.out.println(button.toString(true));
    }

    @Test
    public void testSetSecondary()
    {
        BSButton button = new BSButton();
        button.setSecondary(true);

        System.out.println(button.toString(true));
        button.setSecondary(false);

        System.out.println(button.toString(true));
    }

}
