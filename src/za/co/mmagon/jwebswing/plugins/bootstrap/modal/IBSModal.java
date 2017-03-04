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
package za.co.mmagon.jwebswing.plugins.bootstrap.modal;

import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Div;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 21 Feb 2017
 *
 */
public interface IBSModal<J extends BSModal>
{

    /**
     * Adds the dismiss button to the modal
     *
     * @param button
     */
    J addDismissButton(Button button);

    /**
     * Adds a button that will open up the modal
     *
     * @param button
     */
    J addOpenButton(Button button);

    /**
     * Gets the modal body
     *
     * @return
     */
    Div getModalBody();

    /**
     * Gets the modal content pane
     *
     * @return
     */
    Div getModalContent();

    Div getModalDialog();

    /**
     * Gets the modal footer
     *
     * @return
     */
    Div getModalFooter();

    /**
     * Sets the modal header pane
     *
     * @return
     */
    Div getModalHeader();

    /**
     * Includes a modal-backdrop element. Alternatively, specify static for a backdrop which doesn't close the modal on click.
     *
     * @param backdrop
     *
     * @return
     */
    J setBackdrop(boolean backdrop);

    BSModal setFade();

    /**
     * Puts the focus on the modal when initialized.
     *
     * @param focus
     *
     * @return
     */
    J setFocus(boolean focus);

    /**
     * Closes the modal when escape key is pressed
     *
     * @param keyboard
     *
     * @return
     */
    J setKeyboard(boolean keyboard);

    /**
     * Sets the modal body
     *
     * @param modalBody
     */
    J setModalBody(Div modalBody);

    /**
     * Sets the modal content pane
     *
     * @param modalContent
     */
    J setModalContent(Div modalContent);

    /**
     * Sets the overall dialog of the modal
     *
     * @param modalDialog
     */
    J setModalDialog(Div modalDialog);

    /**
     * Sets the size to render for the modal. By default medium. false sets small
     *
     * @param large
     */
    J setModalDialogSize(boolean large);

    /**
     * Sets the modal footer
     *
     * @param modalFooter
     */
    J setModalFooter(Div modalFooter);

    /**
     * Sets the modal header pane
     *
     * @param modalHeader
     */
    J setModalHeader(Div modalHeader);

    /**
     * Shows the modal when initialized.
     *
     * @param show
     *
     * @return
     */
    J setShow(boolean show);

}
