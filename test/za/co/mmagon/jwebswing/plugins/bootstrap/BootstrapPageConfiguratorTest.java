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

import org.junit.jupiter.api.Assertions;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

/**
 * @author GedMarc
 */
public class BootstrapPageConfiguratorTest extends BaseTestClass
{
	public BootstrapPageConfiguratorTest()
	{
	}
	
	@org.junit.jupiter.api.Test
	public void testPageConfiguration()
	{
		Page p = getInstance();
		BootstrapPageConfigurator bpc = new BootstrapPageConfigurator();
		BootstrapPageConfigurator.setBootstrap4(false);
		System.out.println(p.toString(true));
		Assertions.assertEquals("<!DOCTYPE html>\n" +
				                        "<html>\n" +
				                        "\t<head>\n" +
				                        "\t\t<meta charset=\"utf-16\">\n" +
				                        "\t\t<meta content=\"IE=Edge\" http-equiv=\"X-UA-Compatible\">\n" +
				                        "\t\t<meta content=\"width=device-width, initial-scale=1, maximum-scale=1,user-scalable=no\" name=\"viewport\">\n" +
				                        "\t\t<link href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
				                        "\t</head>\n" +
				                        "\t<body id=\"body\">\n" +
				                        "\t\t<!-- Priority [First] Values -->\n" +
				                        "\t\t<script src=\"bower_components/jquery-3/dist/jquery.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<!-- Priority [Second] Values -->\n" +
				                        "\t\t<script src=\"bower_components/jquery-migrate/jquery-migrate.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<!-- Priority [Third] Values -->\n" +
				                        "\t\t<script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<script src=\"bower_components/bootstrap-validator/dist/validator.js\" type=\"text/javascript\"></script>\n" +
				                        "\t</body>\n" +
				                        "</html>", p.toString(true));
	}
	
	@org.junit.jupiter.api.Test
	public void testPageConfigurationBS4()
	{
		Page p = getInstance();
		BootstrapPageConfigurator bpc = new BootstrapPageConfigurator();
		BootstrapPageConfigurator.setBootstrap4(true);
		bpc.configure(p);
		System.out.println(p.toString(true));
		Assertions.assertEquals("<!DOCTYPE html>\n" +
				                        "<html>\n" +
				                        "\t<head>\n" +
				                        "\t\t<meta charset=\"utf-16\">\n" +
				                        "\t\t<meta content=\"IE=Edge\" http-equiv=\"X-UA-Compatible\">\n" +
				                        "\t\t<meta content=\"width=device-width, initial-scale=1, shrink-to-fit=no, maximum-scale=1,user-scalable=no\" name=\"viewport\">\n" +
				                        "\t\t<link href=\"bower_components/bootstrap4/dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
				                        "\t</head>\n" +
				                        "\t<body id=\"body\">\n" +
				                        "\t\t<!-- Priority [First] Values -->\n" +
				                        "\t\t<script src=\"bower_components/jquery-3/dist/jquery.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<!-- Priority [Second] Values -->\n" +
				                        "\t\t<script src=\"bower_components/jquery-migrate/jquery-migrate.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<!-- Priority [Third] Values -->\n" +
				                        "\t\t<script src=\"bower_components/popper.js/dist/umd/popper.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<script src=\"bower_components/bootstrap4/dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<script src=\"bower_components/bootstrap-validator/dist/validator.js\" type=\"text/javascript\"></script>\n" +
				                        "\t</body>\n" +
				                        "</html>", p.toString(true));
	}
}
