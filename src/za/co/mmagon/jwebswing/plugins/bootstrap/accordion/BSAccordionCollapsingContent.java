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
package za.co.mmagon.jwebswing.plugins.bootstrap.accordion;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCardChildren;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author GedMarc
 * @since 20 Feb 2017
 */
public class BSAccordionCollapsingContent<J extends BSAccordionCollapsingContent<J>> extends DivSimple<J>
		implements BSCardChildren
{

	private static final long serialVersionUID = 1L;
	/**
	 * The physical accordion content
	 */
	private BSAccordionContent accordionContent;

	/**
	 * The actual content
	 *
	 * @return
	 */
	public BSAccordionContent getAccordionContent()
	{
		if (this.accordionContent == null)
		{
			this.accordionContent = new BSAccordionContent();
		}
		return accordionContent;
	}

	/**
	 * The actual content
	 *
	 * @param accordionContent
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAccordionContent(BSAccordionContent accordionContent)
	{
		this.accordionContent = accordionContent;
		return (J) this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			add(getAccordionContent());
		}
		super.init();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSAccordionCollapsingContent))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSAccordionCollapsingContent that = (BSAccordionCollapsingContent) o;
		return Objects.equals(getAccordionContent(), that.getAccordionContent());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getAccordionContent());
	}
}
