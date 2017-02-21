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
package za.co.mmagon.jwebswing.plugins.bootstrap.progressbar.bar;

import za.co.mmagon.jwebswing.base.html.Span;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 21 Feb 2017
 *
 */
public interface IBSProgressBarDisplay<J extends BSProgressBarDisplay>
{

    /**
     * Returns this label
     *
     * @return
     */
    String getLabel();

    /**
     * Gets the current max value
     *
     * @return
     */
    double getMax();

    /**
     * Returns this associated span
     *
     * @return
     */
    Span getSpan();

    /**
     * Returns a current theme, default is success
     *
     * @return
     */
    BSProgressBarThemes getTheme();

    /**
     * Returns the current percentage
     *
     * @return
     */
    double getValue();

    /**
     * Sets this label
     *
     * @param label
     *
     * @return
     */
    J setLabel(String label);

    /**
     * Sets the current max value
     *
     * @param max
     *
     * @return
     */
    J setMax(double max);

    /**
     * Returns the current min value
     *
     * @param min
     *
     * @return
     */
    J setMin(double min);

    /**
     * Sets the current theme
     *
     * @param theme
     *
     * @return
     */
    J setTheme(BSProgressBarThemes theme);

    /**
     * Sets the current percentage / width
     *
     * @param value
     *
     * @return
     */
    J setValue(double value);

}
