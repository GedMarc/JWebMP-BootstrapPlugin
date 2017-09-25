package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups;

import org.junit.jupiter.api.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormLabel;

class BSFormGroupTest extends BaseTestClass
{
	@Test
	void getLabel()
	{
		BSFormGroup group = new BSFormGroup();
		group.setLabel(new BSFormLabel("This is a label"));
		
		System.out.println(group.toString(0));
	}
	
	@Test
	void getHelpText()
	{
	}
	
	@Test
	void setInputComponent()
	{
	}
	
	@Test
	void setInputComponent1()
	{
	}
	
	@Test
	void setAsRow()
	{
	}
	
	@Test
	void setInline()
	{
	}
	
	@Test
	void setAngularValidation()
	{
	}
	
	@Test
	void setRequiredMessage()
	{
	}
	
	@Test
	void setPatternMessage()
	{
	}
	
	@Test
	void setMinMessage()
	{
	}
	
	@Test
	void setMaxMessage()
	{
	}
	
	@Test
	void setMinLengthMessage()
	{
	}
	
	@Test
	void setMaxLengthMessage()
	{
	}
	
	@Test
	void setShowControlFeedback()
	{
	}
	
}
