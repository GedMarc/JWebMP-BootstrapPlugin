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
package com.jwebmp.plugins.bootstrap;

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.base.html.interfaces.GlobalChildren;
import com.jwebmp.base.html.interfaces.GlobalFeatures;
import com.jwebmp.base.html.interfaces.events.GlobalEvents;

import java.io.Serializable;

/**
 * Any child is allowed on this element
 *
 * @param <A>
 * 		Any attribute definition
 *
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSAnyChild<A extends Enum & AttributeDefinitions>
		extends Div<GlobalChildren, A, GlobalFeatures, GlobalEvents, BSAnyChild<A>>
		implements Serializable
{

	private static final long serialVersionUID = 1L;

}
