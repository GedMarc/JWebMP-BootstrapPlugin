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
package za.co.mmagon.jwebswing.plugins.bootstrap;

import org.junit.Assert;
import org.junit.Test;
import za.co.mmagon.jwebswing.Page;

/**
 *
 * @author GedMarc
 */
public class BootstrapPageConfiguratorTest
{

    public BootstrapPageConfiguratorTest()
    {
    }

    @Test
    public void testPageConfiguration()
    {
        Page p = new Page();
        p.getBody().getProperties().put(BootstrapPageConfigurator.BootstrapEnabledString, "true");
        System.out.println(p.toString(true));
        Assert.assertEquals("<!DOCTYPE html>\n"
                + "<html>\n"
                + "	<head>\n"
                + "		<meta charset=\"utf-16\">\n"
                + "		<meta content=\"IE=Edge\" http-equiv=\"X-UA-Compatible\">\n"
                + "		<meta content=\"width=device-width, initial-scale=1\" name=\"viewport\">\n"
                + "		<link href=\"bower_components/bootstrap/dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n"
                + "		<link href=\"bower_components/bootstrap3-dialog/dist/css/bootstrap-dialog.css\" rel=\"stylesheet\" type=\"text/css\">\n"
                + "	</head>\n"
                + "	<body id=\"body\">\n"
                + "		<script src=\"bower_components/jquery-3/dist/jquery.js\" type=\"text/javascript\"></script>\n"
                + "		<script src=\"bower_components/jquery-migrate/jquery-migrate.js\" type=\"text/javascript\"></script>\n"
                + "		<!-- Priority [Third] Values -->\n"
                + "		<script src=\"bower_components/bootstrap/dist/js/bootstrap.js\" type=\"text/javascript\"></script>\n"
                + "		<!-- Priority [Fourth] Values -->\n"
                + "		<script src=\"bower_components/bootstrap3-dialog/dist/js/bootstrap-dialog.js\" type=\"text/javascript\"></script>\n"
                + "	</body>\n"
                + "</html>", p.toString(true));
    }

}
