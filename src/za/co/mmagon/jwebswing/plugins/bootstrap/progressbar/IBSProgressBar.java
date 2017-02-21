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
package za.co.mmagon.jwebswing.plugins.bootstrap.progressbar;

import za.co.mmagon.jwebswing.plugins.bootstrap.progressbar.bar.BSProgressBarDisplay;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 21 Feb 2017
 *
 */
public interface IBSProgressBar<J extends BSProgressBar>
{

    /**
     * Returns the actual progress bar
     *
     * @return
     */
    BSProgressBarDisplay getProgressBar();

    /**
     * Returns if this progress bar should return as active
     *
     * @return
     */
    boolean isActive();

    /**
     * If is animated
     *
     * @return
     */
    boolean isAnimated();

    /**
     * Sets if this component is striped or not
     *
     * @return
     */
    boolean isStriped();

    /**
     * Sets if this component should return as active
     *
     * @param active
     */
    void setActive(boolean active);

    /**
     * Sets if animated
     *
     * @param animated
     */
    void setAnimated(boolean animated);

    /**
     * Sets the given percentage
     *
     * @param percent
     *
     * @return
     */
    J setPercentage(double percent);

    /**
     * Sets the actual progress bar
     *
     * @param progressBar
     */
    void setProgressBar(BSProgressBarDisplay progressBar);

    /**
     * Sets if this components is striped or not
     *
     * @param striped
     */
    void setStriped(boolean striped);

}
