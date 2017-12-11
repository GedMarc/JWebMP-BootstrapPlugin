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

import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.htmlbuilder.css.tables.TableBorderCollapse;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCard;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.parts.BSCardHeader;
import za.co.mmagon.jwebswing.plugins.bootstrap.collapse.BSCollapse;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSDefaultOptions;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A specific item for the Accordion, built as a card
 *
 * @author GedMarc
 * @since 20 Feb 2017
 */
public class BSAccordionItem<J extends BSAccordionItem<J>>
		extends BSCard<J> implements BSAccordionChildren
{

	private static final long serialVersionUID = 1L;

	private static final String TabPanelRoleName = "tabpanel";

	/**
	 * The accordion header
	 */
	private BSAccordionHeader accordionHeader;
	/**
	 * The accordion collapsing content
	 */
	private BSAccordionCollapsingContent accordionCollapsingContent;
	/**
	 * The card header
	 */
	private BSCardHeader cardHeader;
	/**
	 * If this item is rendered as active
	 */
	private boolean active;

	/**
	 * Construct a new accordion item
	 */
	public BSAccordionItem()
	{
		//Nothing Needed
	}

	/**
	 * Gets the accordion header
	 *
	 * @return
	 */
	@NotNull
	public BSAccordionHeader getAccordionHeader()
	{
		if (accordionHeader == null)
		{
			accordionHeader = new BSAccordionHeader();
		}
		return accordionHeader;
	}

	/**
	 * Sets the accordion header
	 *
	 * @param accordionHeader
	 */
	@SuppressWarnings({"unused", "unchecked"})
	public J setAccordionHeader(BSAccordionHeader accordionHeader)
	{
		this.accordionHeader = accordionHeader;
		return (J) this;
	}

	/**
	 * if this accordion item is active or not
	 *
	 * @param active
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		this.active = active;
		if (isActive())
		{
			getAccordionHeader().getAccordionHeaderLink().addAttribute(GlobalAttributes.Aria_Expanded, Boolean.TRUE.toString());

			getAccordionHeader().getAccordionHeaderLink().removeClass(BSDefaultOptions.Collapsed);
			getAccordionCollapsingContent().addClass(BSDefaultOptions.Show);
		}
		else
		{
			getAccordionHeader().getAccordionHeaderLink().addAttribute(GlobalAttributes.Aria_Expanded, Boolean.FALSE.toString());

			getAccordionCollapsingContent().removeClass(BSDefaultOptions.Show);
			getAccordionHeader().getAccordionHeaderLink().addClass(BSDefaultOptions.Collapsed);
		}
		return (J) this;
	}

	/**
	 * The collapsing content for the accordion item
	 *
	 * @return
	 */
	@NotNull
	public BSAccordionCollapsingContent getAccordionCollapsingContent()
	{
		if (accordionCollapsingContent == null)
		{
			accordionCollapsingContent = new BSAccordionCollapsingContent();
		}
		return accordionCollapsingContent;
	}

	/**
	 * Sets the accordion collapsing content
	 *
	 * @param accordionCollapsingContent
	 */
	@SuppressWarnings({"unused", "unchecked"})
	@NotNull
	public J setAccordionCollapsingContent(BSAccordionCollapsingContent accordionCollapsingContent)
	{
		this.accordionCollapsingContent = accordionCollapsingContent;
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized())
		{
			add(getCardHeader());
			add(getAccordionCollapsingContent());

			getAccordionCollapsingContent().addClass(TableBorderCollapse.Collapse.toString());

			getAccordionCollapsingContent().addAttribute(BSAccordionAttributes.Role, TabPanelRoleName);
			getAccordionCollapsingContent().addAttribute(GlobalAttributes.Aria_LabelledBy, getCardHeader().getID());

			BSCollapse.link(getAccordionHeader().getAccordionHeaderLink(), getAccordionCollapsingContent().getAccordionContent(), true);

		}
		super.init();
	}

	/**
	 * If this accordion item is active or not
	 *
	 * @return
	 */
	public boolean isActive()
	{
		return active;
	}

	@NotNull
	public BSCardHeader getCardHeader()
	{
		if (cardHeader == null)
		{
			setCardHeader(new BSCardHeader());
		}
		return cardHeader;
	}

	/**
	 * Sets the card header for this accordion item
	 *
	 * @param cardHeader
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCardHeader(BSCardHeader cardHeader)
	{
		this.cardHeader = cardHeader;
		this.cardHeader.addAttribute(BSAccordionAttributes.Role.toString(), "tab");
		cardHeader.add(getAccordionHeader());
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSAccordionItem))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSAccordionItem<?> that = (BSAccordionItem<?>) o;
		return Objects.equals(getAccordionHeader(), that.getAccordionHeader()) &&
				       Objects.equals(getAccordionCollapsingContent(), that.getAccordionCollapsingContent()) &&
				       Objects.equals(getCardHeader(), that.getCardHeader());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getAccordionHeader(), getAccordionCollapsingContent(), getCardHeader());
	}
}
