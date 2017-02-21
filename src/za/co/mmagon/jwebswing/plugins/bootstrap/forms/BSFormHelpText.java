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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms;

import za.co.mmagon.jwebswing.base.html.SmallText;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroupChildren;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 20 Feb 2017
 *
 */
public class BSFormHelpText<J extends BSFormHelpText> extends SmallText<J>
        implements BSFormGroupChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * A new block style help text for a bootstrap form
     *
     * @param text
     */
    public BSFormHelpText(String text)
    {
        super(text);
        addClass(BSComponentDefaultOptions.Text_Muted);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * A blank help text entry for the form
     */
    public BSFormHelpText()
    {
        this(null);
    }

    /**
     * Sets this help text as inline
     *
     * @param inline
     *
     * @return
     */
    public J setInline(boolean inline)
    {
        if (inline)
        {
            addClass(BSComponentFormGroupOptions.Form_Text);
        }
        else
        {
            removeClass(BSComponentFormGroupOptions.Form_Text);
        }
        return (J) this;
    }
}
