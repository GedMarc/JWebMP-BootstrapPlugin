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
