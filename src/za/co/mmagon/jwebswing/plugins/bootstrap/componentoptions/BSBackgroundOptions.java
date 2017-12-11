package za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_UNDERSCORE;

/**
 * Colour settings for bootstrap 4 beta and up
 */
public enum BSBackgroundOptions implements IBSComponentOptions
{
	Bg_Primary,
	Bg_Secondary,
	Bg_Success,
	Bg_Warning,
	Bg_Danger,
	Bg_Info,
	Bg_Light,
	Bg_Dark,
	Bg_Transparent,


	Border_Primary,
	Border_Secondary,
	Border_Success,
	Border_Warning,
	Border_Danger,
	Border_Info,
	Border_Light,
	Border_Dark,;

	@Override
	public String toString()
	{
		return name().toLowerCase().replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
