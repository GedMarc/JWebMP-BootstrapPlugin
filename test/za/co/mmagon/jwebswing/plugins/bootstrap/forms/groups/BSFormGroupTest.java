package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormLabel;

public class BSFormGroupTest extends BaseTestClass
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
