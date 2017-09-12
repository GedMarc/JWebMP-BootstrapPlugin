package za.co.mmagon.jwebswing.plugins.bootstrap.spinner;

import za.co.mmagon.jwebswing.Feature;

public class BSNumberSpinnerGlobalFeature extends Feature
{
	public BSNumberSpinnerGlobalFeature()
	{
		super("ActivateNumberSpinnerBS");
	}
	
	@Override
	protected void assignFunctionsToComponent()
	{
		/*addQuery("$(document).on('click', '.number-spinner button', function () {    \n" +
				         "\tvar btn = $(this),\n" +
				         "\t\toldValue = btn.closest('.number-spinner').find('input').val().trim(),\n" +
				         "\t\tnewVal = 0;\n" +
				         "\t\n" +
				         "\tif (btn.attr('data-dir') == 'up') {\n" +
				         "\t\tnewVal = parseInt(oldValue) + 1;\n" +
				         "\t} else {\n" +
				         "\t\tif (oldValue > 1) {\n" +
				         "\t\t\tnewVal = parseInt(oldValue) - 1;\n" +
				         "\t\t} else {\n" +
				         "\t\t\tnewVal = 1;\n" +
				         "\t\t}\n" +
				         "\t}\n" +
				         "\tbtn.closest('.number-spinner').find('input').val(newVal);\n" +
				         "});");
		*/
		super.assignFunctionsToComponent();
	}
}
