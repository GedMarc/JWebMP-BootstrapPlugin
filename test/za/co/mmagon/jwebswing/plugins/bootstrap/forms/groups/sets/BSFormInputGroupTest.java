package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSFormTextInput;

public class BSFormInputGroupTest extends BaseTestClass
{
	@Test
	public void getInputGroupAddons()
	{
		BSFormInputGroup inputGroup = new BSFormInputGroup(new BSFormTextInput());
		inputGroup.getInputGroupAddons().add(new Span("@"));
		
		System.out.println(inputGroup.toString(0));
	}
	
}
