package za.co.mmagon.jwebswing.plugins.bootstrap.cards.themed;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCard;

public class BSCardDangerTest extends BaseTestClass
{
	@Test
	public void testPrimary()
	{
		BSCard card = new BSCardPrimary();
		System.out.println(card.toString(0));
	}

	@Test
	public void testSecondary()
	{
		BSCard card = new BSCardSecondary();
		System.out.println(card.toString(0));
	}

	@Test
	public void testWarning()
	{
		BSCard card = new BSCardWarning();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDanger()
	{
		BSCard card = new BSCardDanger();
		System.out.println(card.toString(0));
	}

	@Test
	public void testInfo()
	{
		BSCard card = new BSCardInfo();
		System.out.println(card.toString(0));
	}

	@Test
	public void testLight()
	{
		BSCard card = new BSCardLight();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDark()
	{
		BSCard card = new BSCardDark();
		System.out.println(card.toString(0));
	}


	@Test
	public void testPrimaryOutline()
	{
		BSCard card = new BSCardPrimaryOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testSecondaryOutline()
	{
		BSCard card = new BSCardSecondaryOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testWarningOutline()
	{
		BSCard card = new BSCardWarningOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDangerOutline()
	{
		BSCard card = new BSCardDangerOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testInfoOutline()
	{
		BSCard card = new BSCardInfoOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testLightOutline()
	{
		BSCard card = new BSCardLightOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDarkOutline()
	{
		BSCard card = new BSCardDarkOutline();
		System.out.println(card.toString(0));
	}

}
