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
package com.jwebmp.plugins.bootstrap.carousel.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.logger.LogFactory;
import com.jwebmp.plugins.bootstrap.alerts.BSAlertEvents;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Handles all events. Over-ride methods.
 *
 * @author Marc Magon
 */
public abstract class BSCarouselSlideEvent<J extends BSCarouselSlideEvent<J>>
		extends Event<J>
		implements GlobalEvents, BSAlertEvents
{

	/**
	 * Logger for the Component
	 */
	private static final Logger LOG = LogFactory.getInstance()
	                                            .getLogger("BSCarouselSlideEvent");
	private static final long serialVersionUID = 1L;
	private BSCarouselSlideEventDirective directive;

	/**
	 * Performs a click
	 *
	 * @param component
	 * 		The component this click is going to be acting on
	 */
	public BSCarouselSlideEvent(Component component)
	{
		super(EventTypes.undefined, component);
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		try
		{
			onSlide(call, response);
		}
		catch (Exception e)
		{
			LOG.log(Level.SEVERE, "Error In Firing Event", e);
		}
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getDirective());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSCarouselSlideEvent))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSCarouselSlideEvent<?> that = (BSCarouselSlideEvent<?>) o;
		return Objects.equals(getComponent(), that.getComponent());
	}

	/**
	 * Sets JQuery and Angular enabled, adds the directive to angular, and the attribute to the component
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{

			getComponent().addAttribute("ng-bs-carousel-slide-directive", STRING_ANGULAR_EVENT_START_SHORT + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
		}
		super.preConfigure();
	}

	/**
	 * Returns the angular directive associated with the right click event
	 *
	 * @return
	 */
	public BSCarouselSlideEventDirective getDirective()
	{
		if (directive == null)
		{
			directive = new BSCarouselSlideEventDirective();
		}
		return directive;
	}

	/**
	 * Sets the right click angular event
	 *
	 * @param directive
	 */
	public void setDirective(BSCarouselSlideEventDirective directive)
	{
		this.directive = directive;
	}

	/**
	 * Triggers on Click
	 * <p>
	 *
	 * @param call
	 * 		The physical AJAX call
	 * @param response
	 * 		The physical Ajax Receiver
	 */
	public abstract void onSlide(AjaxCall call, AjaxResponse response);
}
