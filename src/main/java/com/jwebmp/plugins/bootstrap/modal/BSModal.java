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
package com.jwebmp.plugins.bootstrap.modal;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.navbar.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap.options.BSCloseIconOptions;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;

/**
 * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user notification to completely custom content and
 * feature a handful of
 * helpful subcomponents, sizes, and more.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 9 Nov 2016
 */
@ComponentInformation(name = "Bootstrap Modals",
		description = "Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user notification to completely custom content and feature a handful of helpful subcomponents, sizes, and more.",
		url = "https://v4-alpha.getbootstrap.com/components/modal/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSModal<J extends BSModal<J>>
		extends Div<BSModalChildren, BSModalAttributes, BSModalFeatures, BSModalEvents, J>
		implements BSNavBarChildren<BSModalChildren, J>, IBSModal<J>
{


	private BSModalFeature feature;
	/**
	 * The modal dialog
	 */
	private BSModalDiv modalDialog;
	/**
	 * The modal content
	 */
	private BSModalDiv modalContent;
	/**
	 * The header for the modal
	 */
	private BSModalDiv modalHeader;
	/**
	 * The body for the modal
	 */
	private BSModalDiv modalBody;
	/**
	 * The footer for the div
	 */
	private BSModalDiv modalFooter;

	/**
	 * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user notification to completely custom content and
	 * feature a handful of
	 * helpful subcomponents, sizes, and more.
	 */
	public BSModal()
	{
		addFeature(getFeature());
		addClass(BSComponentModalOptions.Modal);
		addAttribute(BSModalAttributes.Role, "dialog");
		addAttribute(BSModalAttributes.TabIndex, "-1");
		addAttribute(GlobalAttributes.Aria_Hidden, "true");

	}

	public final BSModalFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BSModalFeature(this);
		}
		return feature;
	}

	/**
	 * Adds the dismiss button to the modal
	 *
	 * @param button
	 *
	 * @return
	 */
	@Override
	public J addDismissButton(Button button)
	{
		button.addClass(BSCloseIconOptions.Close);
		button.addAttribute(ButtonAttributes.Data_Dismiss, "modal");
		getModalHeader().add(button);
		return (J) this;
	}

	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 *
	 * @return
	 */
	@Override
	public J addOpenButton(Button button)
	{
		button.addAttribute(ButtonAttributes.Data_Toggle, "modal");
		button.addAttribute(ButtonAttributes.Data_Target, getID(true));
		return (J) this;
	}

	/**
	 * Gets the modal body
	 *
	 * @return
	 */
	@Override
	public BSModalDiv getModalBody()
	{
		if (modalBody == null)
		{
			setModalBody(new BSModalDiv());
		}
		return modalBody;
	}

	/**
	 * Gets the modal content pane
	 *
	 * @return
	 */
	@Override
	public BSModalDiv getModalContent()
	{
		if (modalContent == null)
		{
			setModalContent(new BSModalDiv());
		}
		return modalContent;
	}

	@Override
	public BSModalDiv getModalDialog()
	{
		if (modalDialog == null)
		{
			setModalDialog(new BSModalDiv());
		}
		return modalDialog;
	}

	/**
	 * Sets the overall dialog of the modal
	 *
	 * @param modalDialog
	 *
	 * @return
	 */
	@Override
	public J setModalDialog(BSModalDiv modalDialog)
	{
		remove(this.modalDialog);
		this.modalDialog = modalDialog;
		if (this.modalDialog != null)
		{
			add(modalDialog);
			modalDialog.addClass(BSComponentModalOptions.Modal_Dialog);
			modalDialog.addAttribute(BSModalAttributes.Role, "document");
		}
		return (J) this;
	}

	/**
	 * Sets the size to render for the modal. By default medium. false sets small
	 *
	 * @param large
	 *
	 * @return
	 */
	@Override
	public J setModalDialogSize(boolean large)
	{
		if (large)
		{
			getModalDialog().removeClass(BSComponentModalOptions.Modal_Sm);
			getModalDialog().addClass(BSComponentModalOptions.Modal_Lg);
		}
		else
		{
			getModalDialog().addClass(BSComponentModalOptions.Modal_Sm);
			getModalDialog().removeClass(BSComponentModalOptions.Modal_Lg);
		}
		return (J) this;
	}

	/**
	 * Gets the modal footer
	 *
	 * @return
	 */
	@Override
	public BSModalDiv getModalFooter()
	{
		if (modalFooter == null)
		{
			setModalFooter(new BSModalDiv());
		}
		return modalFooter;
	}

	/**
	 * Sets the modal header pane
	 *
	 * @return
	 */
	@Override
	public BSModalDiv getModalHeader()
	{
		if (modalHeader == null)
		{
			setModalHeader(new BSModalDiv());
		}
		return modalHeader;
	}

	/**
	 * Includes a modal-backdrop element. Alternatively, specify static for a backdrop which doesn't close the modal on click.
	 *
	 * @param backdrop
	 *
	 * @return
	 */
	@Override
	public J setBackdrop(boolean backdrop)
	{
		addAttribute(BSModalAttributes.Data_Backdrop, backdrop);
		return (J) this;
	}

	@Override
	public BSModal setFade()
	{
		addClass(BSDefaultOptions.Fade);
		return this;
	}

	/**
	 * Puts the focus on the modal when initialized.
	 *
	 * @param focus
	 *
	 * @return
	 */
	@Override
	public J setFocus(boolean focus)
	{
		addAttribute(BSModalAttributes.Data_Focus, focus);
		return (J) this;
	}

	/**
	 * Closes the modal when escape key is pressed
	 *
	 * @param keyboard
	 *
	 * @return
	 */
	@Override
	public J setKeyboard(boolean keyboard)
	{
		addAttribute(BSModalAttributes.Data_Keyboard, keyboard);
		return (J) this;
	}

	/**
	 * Sets the modal header pane
	 *
	 * @param modalHeader
	 *
	 * @return
	 */
	@Override
	public J setModalHeader(BSModalDiv modalHeader)
	{
		getModalContent().remove(modalHeader);
		this.modalHeader = modalHeader;
		if (this.modalHeader != null)
		{
			getModalContent().add(this.modalHeader);
			this.modalHeader.addClass(BSComponentModalOptions.Modal_Header);
		}
		return (J) this;
	}

	/**
	 * Shows the modal when initialized.
	 *
	 * @param show
	 *
	 * @return
	 */
	@Override
	public J setShow(boolean show)
	{
		addAttribute(BSModalAttributes.Data_Show, show);
		return (J) this;
	}

	/**
	 * Sets the modal footer
	 *
	 * @param modalFooter
	 *
	 * @return
	 */
	@Override
	public J setModalFooter(BSModalDiv modalFooter)
	{
		getModalContent().remove(this.modalFooter);
		this.modalFooter = modalFooter;
		if (this.modalFooter != null)
		{
			getModalContent().add(this.modalFooter);
			this.modalFooter.addClass(BSComponentModalOptions.Modal_Footer);
		}
		return (J) this;
	}

	/**
	 * Sets the modal content pane
	 *
	 * @param modalContent
	 *
	 * @return
	 */
	@Override
	public J setModalContent(BSModalDiv modalContent)
	{
		getModalDialog().remove(this.modalContent);
		this.modalContent = modalContent;
		if (this.modalContent != null)
		{
			this.modalContent.addClass(BSComponentModalOptions.Modal_Content);
			getModalDialog().add(this.modalContent);
		}
		return (J) this;
	}

	/**
	 * Sets the modal body
	 *
	 * @param modalBody
	 *
	 * @return
	 */
	@Override
	public J setModalBody(BSModalDiv modalBody)
	{
		getModalContent().remove(this.modalBody);
		this.modalBody = modalBody;
		if (this.modalBody != null)
		{
			this.modalBody.addClass(BSComponentModalOptions.Modal_Body);
			getModalContent().add(this.modalBody);
		}
		return (J) this;
	}

	/**
	 * Returns this modal with only its methods
	 *
	 * @return
	 */
	public IBSModal asMe()
	{
		return this;
	}

	@Override
	public BSModalOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
