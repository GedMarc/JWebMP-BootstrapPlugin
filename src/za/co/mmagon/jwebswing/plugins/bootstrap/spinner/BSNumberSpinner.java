package za.co.mmagon.jwebswing.plugins.bootstrap.spinner;

import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSFormNumberInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSComponentInputGroupOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BSNumberSpinner<J extends BSNumberSpinner<J>> extends BSFormNumberInput<J>
{
	private List<Span> before = new ArrayList<>();
	private List<Span> after = new ArrayList<>();
	
	/**
	 * Constructs a number spinner
	 */
	public BSNumberSpinner()
	{
		addClass("number-spinner");
		
		Span lower = new Span();
		lower.addClass("input_group_btn");
		Button lowerButton = new Button();
		lowerButton.addClass("btn btn-default");
		Span lowerIcon = new Span();
		lowerIcon.addClass("fa fa-angle-down");
		
		lower.add(lowerButton);
		lowerButton.add(lowerIcon);
		lowerButton.addAttribute("data-dir", "dwn");
		before.add(lower);
		
		Span upper = new Span();
		upper.addClass("input_group_btn");
		Button upperButton = new Button();
		upperButton.addClass("btn btn-default");
		upperButton.addAttribute("data-dir", "up");
		Span upperIcon = new Span();
		upperIcon.addClass("fa fa-angle-up");
		
		upper.add(upperButton);
		upperButton.add(upperIcon);
		after.add(upper);
		
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			for (Span addon : getBefore())
			{
				addon.addClass(BSComponentInputGroupOptions.Input_Group_Addon);
				getParent().add(addon);
			}
			for (Span addon : getBefore())
			{
				addon.addClass(BSComponentInputGroupOptions.Input_Group_Addon);
				getParent().add(addon);
			}
		}
		super.init();
	}
	
	/**
	 * Returns this before list
	 *
	 * @return
	 */
	public List<Span> getBefore()
	{
		return before;
	}
	
	/**
	 * Sets the before list of spans
	 * @param before
	 * @return
	 */
	public J setBefore(List<Span> before)
	{
		this.before = before;
		return (J) this;
	}
	
	/**
	 * Returns the after span list
	 * @return
	 */
	public List<Span> getAfter()
	{
		return after;
	}
	
	/**
	 * Sets the after list
	 * @param after
	 * @return
	 */
	public J setAfter(List<Span> after)
	{
		this.after = after;
		return (J) this;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSNumberSpinner))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSNumberSpinner<?> that = (BSNumberSpinner<?>) o;
		return Objects.equals(getBefore(), that.getBefore()) &&
				Objects.equals(getAfter(), that.getAfter());
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getBefore(), getAfter());
	}
}
