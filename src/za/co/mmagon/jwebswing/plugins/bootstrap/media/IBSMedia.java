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
package za.co.mmagon.jwebswing.plugins.bootstrap.media;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.Link;

/**
 *
 * @author GedMarc
 * @since 21 Feb 2017
 *
 */
public interface IBSMedia
{

    /**
     * Returns the body portion of this media object
     *
     * @return
     */
    Div getMediaBody();

    /**
     * Returns the component displayed inside the link that is used for display
     *
     * @return
     */
    Component getMediaComponent();

    /**
     * Returns a new H4 header
     *
     * @return
     */
    HeaderText getMediaHeader();

    /**
     * Returns the associated media link, never null
     *
     * @return
     */
    Link getMediaLink();

    /**
     * Sets the media body and adds it to this object
     *
     * @param mediaBody
     *
     * @return
     */
    BSMedia setMediaBody(Div mediaBody);

    /**
     * Sets the component displayed to the left or right (set that in the link)
     *
     * @param mediaComponent
     *
     * @return
     */
    BSMedia setMediaComponent(Component mediaComponent);

    /**
     * Sets the header to the required object
     *
     * @param mediaHeader
     *
     * @return
     */
    BSMedia setMediaHeader(HeaderText mediaHeader);

    /**
     * Sets the media link, and moves the media object into the new link if necessary
     *
     * @param mediaLink
     * @param left
     *
     * @return
     */
    BSMedia setMediaLink(Link mediaLink, boolean left);

}
