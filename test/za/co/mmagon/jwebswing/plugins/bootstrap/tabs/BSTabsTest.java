package za.co.mmagon.jwebswing.plugins.bootstrap.tabs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.ListItem;

public class BSTabsTest extends BaseTestClass
{
	@Test
	public void testBSTabs()
	{
		BSTabs tab = new BSTabs();
		System.out.println(tab.toString(true));
		
		//tab.asMe().
		
	}

	@Test
	public void testBSTabsContent()
	{
		BSTabs tabs = new BSTabs();
		BSTab tab = new BSTab(new ListItem(), new Div());
		BSTab tab1 = new BSTab(new ListItem(), new Div());
		BSTab tab2 = new BSTab(new ListItem(), new Div());

		tab.setActive(true);

		tabs.getTabs().add(tab);
		tabs.getTabs().add(tab1);
		tabs.getTabs().add(tab2);

		System.out.println(tabs.toString(true));

		//tab.asMe().

	}
}
