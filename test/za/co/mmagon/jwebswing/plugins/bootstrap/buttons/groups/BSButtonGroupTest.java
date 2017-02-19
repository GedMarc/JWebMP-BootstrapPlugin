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
package za.co.mmagon.jwebswing.plugins.bootstrap.buttons.groups;

import org.junit.Test;

/**
 *
 * @author GedMarc
 */
public class BSButtonGroupTest
{

    public BSButtonGroupTest()
    {
    }

    @Test
    public void testSetAriaLabel()
    {
        BSButtonGroup group = new BSButtonGroup();
        group.setAriaLabel("Aria Aria ");
        group.add(new BSButtonGroupLabel("Label", new BSButtonGroupCheckbox()));
        group.add(new BSButtonGroupLabel("Label 2", new BSButtonGroupCheckbox()));

        group.add(new BSButtonGroupLabel("asdfasdf", new BSButtonGroupRadioButton()));

        System.out.println(group.toString(true));
    }

    @Test
    public void testSetSize()
    {
        BSButtonGroup group = new BSButtonGroup();
        group.setSize(BSComponentButtonGroupSizeOptions.Btn_Group_Lg);
        group.add(new BSButtonGroupLabel("Label", new BSButtonGroupCheckbox()));
        group.add(new BSButtonGroupLabel("Label 2", new BSButtonGroupCheckbox()));

        group.add(new BSButtonGroupLabel("asdfasdf", new BSButtonGroupRadioButton()));

        System.out.println(group.toString(true));
    }

    @Test
    public void testStuff()
    {
        BSButtonGroup group = new BSButtonGroup();
        group.add(new BSButtonGroupLabel("Label", new BSButtonGroupCheckbox()));
        group.add(new BSButtonGroupLabel("Label 2", new BSButtonGroupCheckbox()));

        group.add(new BSButtonGroupLabel("asdfasdf", new BSButtonGroupRadioButton()));

        System.out.println(group.toString(true));
    }

    @Test
    public void testVertical()
    {
        BSButtonGroup group = new BSButtonGroupVertical();
        group.add(new BSButtonGroupLabel("Label", new BSButtonGroupCheckbox()));
        group.add(new BSButtonGroupLabel("Label 2", new BSButtonGroupCheckbox()));

        group.add(new BSButtonGroupLabel("asdfasdf", new BSButtonGroupRadioButton()));

        System.out.println(group.toString(true));
    }
}
