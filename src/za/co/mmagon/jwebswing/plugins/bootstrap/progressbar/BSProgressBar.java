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
package za.co.mmagon.jwebswing.plugins.bootstrap.progressbar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.progressbar.bar.BSProgressBarDisplay;

/**
 * Progress
 * <p>
 * Use our custom progress component for displaying simple or complex progress bars.
 * We don’t use the HTML5 progress element, ensuring you can stack progress bars, animate them, and place text
 * labels over them.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Progress Bars", description = "Use our custom progress component for displaying simple or complex progress bars.",
        url = "https://v4-alpha.getbootstrap.com/components/progress/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSProgressBar<J extends BSProgressBar>
        extends Div<BSProgressBarChildren, BSProgressBarAttributes, BSProgressBarFeatures, BSProgressBarEvents, J> implements IBSProgressBar<J>
{

    private static final long serialVersionUID = 1L;
    private BSProgressBarFeature feature;

    /**
     * Whether or not the progress bar is striped
     */
    private boolean striped;
    /**
     * Whether or not this progress bar should display as active
     */
    private boolean active;
    /**
     * if animated
     */
    private boolean animated;

    /**
     * The actual progress bar
     */
    private BSProgressBarDisplay progressBar;

    /**
     * Use our custom progress component for displaying simple or complex progress bars.
     */
    public BSProgressBar()
    {
        this(false);
    }

    /**
     * Creates a new instance of a progress bar
     *
     * @param striped If the progress bar is striped or not
     */
    public BSProgressBar(boolean striped)
    {
        this(striped, false);
    }

    /**
     * Creates a new instance of a progress bar
     *
     * @param striped If the progress bar is striped or not
     * @param active  if the progress bar is active or not
     */
    public BSProgressBar(boolean striped, boolean active)
    {
        this(striped, active, null);
    }

    /**
     * Creates a new instance of a progress bar
     *
     * @param striped     If the progress bar is striped or not
     * @param active      if the progress bar is active or not
     * @param progressBar The actual progress bar
     */
    public BSProgressBar(boolean striped, boolean active, BSProgressBarDisplay progressBar)
    {
        addClass(BSComponentProgressBarOptions.Progress);
        setStriped(striped);
        setActive(active);
        setProgressBar(null);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Returns a new progress bar
     *
     * @return
     */
    public IBSProgressBar asMe()
    {
        return this;
    }

    public final BSProgressBarFeature getFeature()
    {
        if (feature == null)
        {
            feature = new BSProgressBarFeature(this);
        }
        return feature;
    }

    @Override
    public BSProgressBarOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * Sets if this component is striped or not
     *
     * @return
     */
    @Override
    public boolean isStriped()
    {
        return striped;
    }

    /**
     * Sets if this components is striped or not
     *
     * @param striped
     */
    @Override
    public final void setStriped(boolean striped)
    {
        this.striped = striped;
        if (striped)
        {
            getProgressBar().addClass(BSComponentProgressBarOptions.Progress_Bar_Striped);
        }
        else
        {
            getProgressBar().removeClass(BSComponentProgressBarOptions.Progress_Bar_Striped);
        }
    }

    /**
     * Sets the given percentage
     *
     * @param percent
     *
     * @return
     */
    @Override
    public J setPercentage(double percent)
    {
        getProgressBar().setValue(percent);
        return (J) this;
    }

    /**
     * Returns if this progress bar should return as active
     *
     * @return
     */
    @Override
    public boolean isActive()
    {
        return active;
    }

    /**
     * Sets if this component should return as active
     *
     * @param active
     */
    @Override
    public final void setActive(boolean active)
    {
        this.active = active;
        if (active)
        {
            getProgressBar().addClass("active");
        }
        else
        {
            getProgressBar().removeClass("active");
        }
    }

    /**
     * Returns the actual progress bar
     *
     * @return
     */
    @Override
    public BSProgressBarDisplay getProgressBar()
    {
        if (progressBar == null)
        {
            progressBar = new BSProgressBarDisplay();
            setProgressBar(progressBar);
        }
        return progressBar;
    }

    /**
     * Sets the actual progress bar
     *
     * @param progressBar
     */
    @Override
    public final void setProgressBar(BSProgressBarDisplay progressBar)
    {
        getChildren().remove(this.progressBar);
        this.progressBar = progressBar;
        if (progressBar != null)
        {
            getChildren().add(progressBar);
        }
    }

    /**
     * If is animated
     *
     * @return
     */
    @Override
    public boolean isAnimated()
    {
        return animated;
    }

    /**
     * Sets if animated
     *
     * @param animated
     */
    @Override
    public void setAnimated(boolean animated)
    {
        this.animated = animated;
        if (animated)
        {
            getProgressBar().addClass(BSComponentProgressBarOptions.Progress_Bar_Animated);
        }
        else
        {
            getProgressBar().removeClass(BSComponentProgressBarOptions.Progress_Bar_Animated);
        }
    }

}
