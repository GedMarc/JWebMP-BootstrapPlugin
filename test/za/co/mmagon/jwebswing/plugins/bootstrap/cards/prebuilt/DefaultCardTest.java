package za.co.mmagon.jwebswing.plugins.bootstrap.cards.prebuilt;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.parts.BSCardImageTop;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.parts.BSCardLink;

public class DefaultCardTest extends BaseTestClass
{

	@Test
	public void testHeader()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setHeaderText("This is a header");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testFooter()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setFooterText("This is a footer");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardTitle()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardTitle("title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardSubTitle()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardSubTitle("title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardAndSubTitle()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardTitle("title");
		impl.setCardSubTitle("sub title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardImageTop()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardImageTop(new BSCardImageTop("imageUrl"));
		impl.setCardTitle("title");
		impl.setCardSubTitle("sub title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardLinks()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.getCardLinks().add(new BSCardLink("toAddress"));
		System.out.println(impl.toString(0));
	}

	@Test
	public void testToCardLinks()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardImageTop(new BSCardImageTop("imageUrl"));
		impl.setCardTitle("title");
		impl.setCardSubTitle("sub title");
		impl.getCardLinks().add(new BSCardLink("toAddress"));
		impl.setHeaderText("This is a header");
		impl.setFooterText("This is a footer");
		System.out.println(impl.toString(0));
	}

	public static class DefaultCardImpl extends DefaultCard<DefaultCardImpl>
	{

	}
}
