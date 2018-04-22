package com.jwebmp.plugins.bootstrap.forms.groups;

import com.jwebmp.plugins.bootstrap.forms.BSFormLabel;
import org.junit.jupiter.api.Test;

public class BSFormGroupTest

{
	@Test
	public void getLabel()
	{
		BSFormGroup group = new BSFormGroup();
		group.setLabel(new BSFormLabel("This is a label"));

		System.out.println(group.toString(0));
	}

	@Test
	public void getHelpText()
	{
	}

	@Test
	public void setInputComponent()
	{
	}

	@Test
	public void setInputComponent1()
	{
	}

	@Test
	public void setAsRow()
	{
	}

	@Test
	public void setInline()
	{
	}

	@Test
	public void setAngularValidation()
	{
	}

	@Test
	public void setRequiredMessage()
	{
	}

	@Test
	public void setPatternMessage()
	{
	}

	@Test
	public void setMinMessage()
	{
	}

	@Test
	public void setMaxMessage()
	{
	}

	@Test
	public void setMinLengthMessage()
	{
	}

	@Test
	public void setMaxLengthMessage()
	{
	}

	@Test
	public void setShowControlFeedback()
	{
	}

}
