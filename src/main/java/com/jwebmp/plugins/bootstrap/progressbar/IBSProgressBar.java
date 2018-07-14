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
package com.jwebmp.plugins.bootstrap.progressbar;

import com.jwebmp.plugins.bootstrap.progressbar.bar.BSProgressBarDisplay;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 21 Feb 2017
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
	 * Sets the actual progress bar
	 *
	 * @param progressBar
	 */
	void setProgressBar(BSProgressBarDisplay progressBar);

	/**
	 * Returns if this progress bar should return as active
	 *
	 * @return
	 */
	boolean isActive();

	/**
	 * Sets if this component should return as active
	 *
	 * @param active
	 */
	void setActive(boolean active);

	/**
	 * If is animated
	 *
	 * @return
	 */
	boolean isAnimated();

	/**
	 * Sets if animated
	 *
	 * @param animated
	 */
	void setAnimated(boolean animated);

	/**
	 * Sets if this component is striped or not
	 *
	 * @return
	 */
	boolean isStriped();

	/**
	 * Sets if this components is striped or not
	 *
	 * @param striped
	 */
	void setStriped(boolean striped);

	/**
	 * Sets the given percentage
	 *
	 * @param percent
	 *
	 * @return
	 */
	J setPercentage(double percent);

}
