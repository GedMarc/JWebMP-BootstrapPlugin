package za.co.mmagon.jwebswing.plugins.bootstrap.spinner;

import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSFormTextInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSComponentInputGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;

import java.util.ArrayList;
import java.util.List;

public class BSNumberSpinner<J extends BSNumberSpinner<J>> extends BSFormInputGroup<J>
{
	private List<Span> before = new ArrayList<>();
	private List<Span> after = new ArrayList<>();
	
	private BSFormTextInput input;
	
	public BSNumberSpinner(BSComponentInputGroupOptions... size)
	{
		super(new BSFormTextInput(), size);
		input = (BSFormTextInput) getInput();
		
		addClass("number-spinner");
		
		Span lower = new Span();
		lower.addClass("input_group_btn");
		Button lowerButton = new Button();
		lowerButton.addClass("btn btn-default");
		Span lowerIcon = new Span();
		lowerIcon.addClass("fa fa-angle-down");
		
		lower.add(lowerButton);
		lowerButton.add(lowerIcon);
		lowerButton.addAttribute("data-dir","dwn");
		before.add(lower);
		
		Span upper = new Span();
		upper.addClass("input_group_btn");
		Button upperButton = new Button();
		upperButton.addClass("btn btn-default");
		upperButton.addAttribute("data-dir","up");
		Span upperIcon = new Span();
		upperIcon.addClass("fa fa-angle-up");
		
		upper.add(upperButton);
		upperButton.add(upperIcon);
		after.add(upper);
		
	}
	
	@Override
	public void init()
	{
		if(!isInitialized())
		{
			getInputGroupAddons().addAll(before);
			getInputGroupAddonsRight().addAll(after);
		}
		super.init();
	}
	
	/**
	 * Returns this before list
	 * @return
	 */
	public List<Span> getBefore()
	{
		return before;
	}
	
	public J setBefore(List<Span> before)
	{
		this.before = before;
		return (J)this;
	}
	
	public List<Span> getAfter()
	{
		return after;
	}
	
	public J setAfter(List<Span> after)
	{
		this.after = after;
		return (J)this;
	}
	
	@Override
	public BSFormTextInput getInput()
	{
		return input;
	}
	
	public J setInput(BSFormTextInput input)
	{
		this.input = input;
		super.setInput(input);
		return (J) this;
	}
}
