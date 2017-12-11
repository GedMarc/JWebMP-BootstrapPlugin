/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.TextArea;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSForm;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormInline;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormLabel;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSFormSelectInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;
import za.co.mmagon.logger.LogFactory;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * An implementation of
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
public class BSFormGroup<J extends BSFormGroup<J>>
		extends Div<GlobalChildren, BSFormGroupAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSFormChildren, IBSFormGroup<J>
{

	private static final Logger log = LogFactory.getLog("BSFormGroup");
	private static final String BootstrapValidationIconClass = "glyphicon form-control-feedback form-control-feedback-lg";

	private static final long serialVersionUID = 1L;

	/**
	 * The label
	 */
	private BSFormLabel label;
	/**
	 * The label help text
	 */
	private String helpText;
	/**
	 * The input component for the form group
	 */
	private Component inputComponent;
	/**
	 * If this group is shown as a row
	 */
	private boolean asRow;
	/**
	 * If this group is shown as inline
	 */
	private boolean inline;
	/**
	 * If angular validation is enabled
	 */
	private boolean angularValidation;
	/**
	 * The actual required message
	 */
	private String requiredMessage;
	/**
	 * The actual pattern message
	 */
	private String patternMessage;
	/**
	 * The minimum error message
	 */
	private String minMessage;
	/**
	 * The maximum error message
	 */
	private String maxMessage;
	/**
	 * The minimum length for a text field
	 */
	private String minLengthMessage;
	/**
	 * The maximum length for a message
	 */
	private String maxLengthMessage;
	/**
	 * The general global error for a message
	 */
	private String errorMessage;
	/**
	 * The front icon string for the final input group
	 */
	private String frontIcon;
	/**
	 * Shows a ticket, warning or cross from bootstrap 4
	 */
	private Boolean showControlFeedback;
	/**
	 * The help block displayed when errors are found
	 */
	private Div helpBlockWithErrors;

	/**
	 * Constructs a new BS Form Group
	 */
	public BSFormGroup()
	{
		//Nothing Needed
	}

	/**
	 * Constructs a new instance
	 *
	 * @param label
	 * @param inputComponent
	 * @param helpText
	 */
	public BSFormGroup(BSFormLabel label, Input inputComponent, String helpText)
	{
		this.label = label;
		this.inputComponent = inputComponent;
		this.helpText = helpText;
	}

	/**
	 * Constructs a new instance
	 *
	 * @param label
	 * @param inputComponent
	 * @param helpText
	 */
	public BSFormGroup(BSFormLabel label, BSInput inputComponent, String helpText)
	{
		this.label = label;
		this.inputComponent = inputComponent;
		this.helpText = helpText;
	}

	/**
	 * Constructs a new instance
	 *
	 * @param label
	 * @param inputComponent
	 * @param helpText
	 */
	public BSFormGroup(BSFormLabel label, BSFormSelectInput inputComponent, String helpText)
	{
		this.label = label;
		this.inputComponent = inputComponent;
		this.helpText = helpText;

	}

	/**
	 * Constructs a new instance
	 *
	 * @param label
	 * @param inputComponent
	 * @param helpText
	 */
	public BSFormGroup(BSFormLabel label, TextArea inputComponent, String helpText)
	{
		this.label = label;
		this.inputComponent = inputComponent;
		this.helpText = helpText;
	}

	/**
	 * Constructs a new instance
	 *
	 * @param label
	 * @param inputComponent
	 * @param helpText
	 */
	public BSFormGroup(BSFormLabel label, BSFormInputGroup inputComponent, String helpText)
	{
		this.label = label;
		this.inputComponent = inputComponent;
		this.helpText = helpText;
	}

	/**
	 * A neater representation
	 *
	 * @return
	 */
	public IBSFormGroup asMe()
	{
		return this;
	}

	/**
	 * Returns a label. There must always be a label
	 *
	 * @return
	 */
	@Override
	public BSFormLabel getLabel()
	{
		return label;
	}

	/**
	 * Sets the label to the given label
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	public J setLabel(BSFormLabel label)
	{
		this.label = label;
		return (J) this;
	}

	/**
	 * Return the help text
	 *
	 * @return
	 */
	@Override
	public String getHelpText()
	{
		return helpText;
	}

	/**
	 * Sets the help text
	 *
	 * @param helpText
	 *
	 * @return
	 */
	@Override
	public J setHelpText(String helpText)
	{
		this.helpText = helpText;
		return (J) this;
	}

	/**
	 * Returns the input component
	 *
	 * @return
	 */
	@Override
	public Component getInputComponent()
	{
		return inputComponent;
	}

	/**
	 * Sets the input component to any input type
	 *
	 * @param inputComponent
	 *
	 * @return
	 */
	public J setInputComponent(Input inputComponent)
	{
		this.inputComponent = inputComponent;
		return (J) this;
	}

	/**
	 * Sets the input component
	 *
	 * @param inputComponent
	 *
	 * @return
	 */
	@Override
	public J setInputComponent(BSInput inputComponent)
	{
		this.inputComponent = inputComponent;
		return (J) this;
	}

	/**
	 * Sets the input component
	 *
	 * @param inputComponent
	 *
	 * @return
	 */
	@Override
	public J setInputComponent(BSFormSelectInput inputComponent)
	{
		this.inputComponent = inputComponent;
		return (J) this;
	}

	/**
	 * Adds and configures the row
	 */
	private void configureAsRow()
	{
		if (isAsRow())
		{
			addClass(BSDefaultOptions.Row);
			if (getLabel() != null)
			{
				getLabel().addClass("col-2");
			}
			if (getInputComponent() != null)
			{
				getInputComponent().addClass("col-10");
			}
		}
	}

	/**
	 * Adds all the necessary items
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			configureAsRow();
			configureLabel();
			configureInputComponent();
			configureAngularValidation();

			if (BootstrapPageConfigurator.isBootstrap4())
			{
				addClass(BSComponentFormGroupOptions.Form_Group);
				addStyle("margin-bottom:0px");
			}
		}
		super.preConfigure();
	}

	/**
	 * Adds and configures the label
	 */
	private void configureLabel()
	{

		if (getLabel() != null && getLabel().getParent() == null)
		{
			getLabel().setForInputComponent(getInputComponent());
			add(getLabel());
		}
	}

	/**
	 * Configures the input component
	 */
	private void configureInputComponent()
	{
		if (!(getInputComponent() != null && getInputComponent() instanceof BSFormInputGroup))
		{
			BSFormInputGroup inputGroup = new BSFormInputGroup((Input) getInputComponent());
			if (getFrontIcon() != null)
			{
				Span newSpan = new Span<>().setText(getFrontIcon());
				if (BootstrapPageConfigurator.isBootstrap4())
				{
					newSpan.addClass(BootstrapValidationIconClass);
				}
				inputGroup.getInputGroupAddons().add(newSpan);
			}

			Span iconFeedback = new Span();
			if (BootstrapPageConfigurator.isBootstrap4())
			{
				iconFeedback.addClass(BootstrapValidationIconClass);
			}
			iconFeedback.addAttribute(GlobalAttributes.Aria_Hidden, "true");

			inputGroup.getInputGroupAddonsRight().add(iconFeedback);
			add(inputGroup);
		}
		else
		{
			BSFormInputGroup ig = (BSFormInputGroup) getInputComponent();
			Span iconFeedback = new Span();
			if (BootstrapPageConfigurator.isBootstrap4())
			{
				iconFeedback.addClass(BootstrapValidationIconClass);
			}
			iconFeedback.addAttribute(GlobalAttributes.Aria_Hidden, "true");
			ig.getInputGroupAddonsRight().add(iconFeedback);
			add(ig);
		}

	}

	/**
	 * Adds and configures the validation techniques
	 */
	private void configureAngularValidation()
	{
		if (isAngularValidation())
		{
			addClass("has-feedback");
			AngularPageConfigurator.setRequired(this, true);
			BSForm referencedForm = findParent(BSForm.class);
			if (referencedForm == null)
			{
				log.log(Level.SEVERE, "Unable to map angular, hierarchy doesn't seem to be built right. Expecting a BSForm as a parent somewhere");
				referencedForm = new BSForm();
				referencedForm.setID("InvalidForm");
			}
			referencedForm.addAttribute("data-toggle", "validator");
			addFeature(new Feature("BootstrapValidatorFeature")
			{
				@Override
				protected void assignFunctionsToComponent()
				{
					addQuery("$('[data-toggle=validator]').validator();");
				}
			});

			if (BSFormInline.class.isAssignableFrom(referencedForm.getClass()))
			{
				setInline(true);
			}

			referencedForm.addAttribute("novalidate", "");
			referencedForm.setTag("ng-form");

			configureAngularIcon();
		}
	}

	/**
	 * Configures the data attributes for the widget
	 */
	private void configureDataAttributes()
	{
		if (getShowControlFeedback() != null && getShowControlFeedback())
		{
			if (getRequiredMessage() != null)
			{
				getInputComponent().addAttribute("data-required-error", getRequiredMessage());
			}
			if (getPatternMessage() != null)
			{
				getInputComponent().addAttribute("data-pattern-error", getPatternMessage());
			}
			if (getMinMessage() != null)
			{
				getInputComponent().addAttribute("data-minlength-error", getMinLengthMessage());
			}
			if (getMaxMessage() != null)
			{
				getInputComponent().addAttribute("data-maxlength-error", getMaxLengthMessage());
			}
			if (getErrorMessage() != null)
			{
				getInputComponent().addAttribute("data-error", getErrorMessage());
			}
			if (getHelpText() != null)
			{
				getHelpBlockWithErrors().setText(getHelpText());
			}
			add(getHelpBlockWithErrors());
		}
	}

	/**
	 * Adds the angular icon for components
	 */
	private void configureAngularIcon()
	{
		if (getInputComponent() != null)
		{
			if (BootstrapPageConfigurator.isBootstrap4())
			{
				Span iconFeedback = new Span();
				if (!BootstrapPageConfigurator.isBootstrap4())
				{
					iconFeedback.addClass(BootstrapValidationIconClass);
				}
				iconFeedback.addStyle("background:transparent !important;");
				iconFeedback.addAttribute("aria-hidden", "true");
				iconFeedback.addStyle("top:0;");
				iconFeedback.addStyle("margin-top:0;");
				add(iconFeedback);
			}
			configureDataAttributes();
		}
	}

	/**
	 * If this form group must render as a row
	 *
	 * @return
	 */
	@Override
	public boolean isAsRow()
	{
		return asRow;
	}

	/**
	 * If this group must render as a row
	 *
	 * @param asRow
	 *
	 * @return
	 */
	@Override
	public J setAsRow(boolean asRow)
	{
		this.asRow = asRow;
		return (J) this;
	}

	/**
	 * If this group must render as inline
	 *
	 * @return
	 */
	@Override
	public boolean isInline()
	{
		return inline;
	}

	/**
	 * If this group must render as inline
	 *
	 * @param inline
	 *
	 * @return
	 */
	@Override
	public BSFormGroup setInline(boolean inline)
	{
		this.inline = inline;
		return this;
	}

	/**
	 * Sets if this form group has validation attached
	 *
	 * @return
	 */
	@Override
	public boolean isAngularValidation()
	{
		return angularValidation;
	}

	/**
	 * Sets if this form group has validation attached
	 *
	 * @param angularValidation
	 *
	 * @return
	 */
	@Override
	public BSFormGroup setAngularValidation(boolean angularValidation)
	{
		this.angularValidation = angularValidation;
		return this;
	}

	/**
	 * Returns the component to be shown when there is a required error
	 *
	 * @return
	 */
	@Override
	public String getRequiredMessage()
	{
		return requiredMessage;
	}

	/**
	 * Sets the component to be shown when there is a required error
	 *
	 * @param requiredMessage
	 *
	 * @return
	 */
	@Override
	public J setRequiredMessage(String requiredMessage)
	{
		setAngularValidation(true);
		this.requiredMessage = requiredMessage;
		return (J) this;
	}

	/**
	 * Sets the component to be shown when there is a pattern error
	 *
	 * @return
	 */
	@Override
	public String getPatternMessage()
	{
		return patternMessage;
	}

	/**
	 * Sets the component to display when there is a pattern message
	 *
	 * @param patternMessage
	 *
	 * @return
	 */
	@Override
	public J setPatternMessage(String patternMessage)
	{
		setAngularValidation(true);
		this.patternMessage = patternMessage;
		return (J) this;
	}

	/**
	 * Returns the minimum reached message component
	 *
	 * @return
	 */
	@Override
	public String getMinMessage()
	{
		return minMessage;
	}

	/**
	 * Sets the minimum reached message
	 *
	 * @param minMessage
	 *
	 * @return
	 */
	@Override
	public J setMinMessage(String minMessage)
	{
		setAngularValidation(true);
		this.minMessage = minMessage;
		return (J) this;
	}

	/**
	 * Sets the maximum reached message error
	 *
	 * @return
	 */
	@Override
	public String getMaxMessage()
	{
		return maxMessage;
	}

	/**
	 * Sets the maximum reached message error
	 *
	 * @param maxMessage
	 *
	 * @return
	 */
	@Override
	public J setMaxMessage(String maxMessage)
	{
		setAngularValidation(true);
		this.maxMessage = maxMessage;
		return (J) this;
	}

	/**
	 * Returns the minimum length message
	 *
	 * @return
	 */
	@Override
	public String getMinLengthMessage()
	{
		return minLengthMessage;
	}

	/**
	 * Sets the minimum length message
	 *
	 * @param minLengthMessage
	 *
	 * @return
	 */
	@Override
	public J setMinLengthMessage(String minLengthMessage)
	{
		setAngularValidation(true);
		this.minLengthMessage = minLengthMessage;
		return (J) this;
	}

	/**
	 * The max length message
	 *
	 * @return
	 */
	@Override
	public String getMaxLengthMessage()
	{
		return maxLengthMessage;
	}

	/**
	 * The max length message
	 *
	 * @param maxLengthMessage
	 *
	 * @return
	 */
	@Override
	public J setMaxLengthMessage(String maxLengthMessage)
	{
		setAngularValidation(true);
		this.maxLengthMessage = maxLengthMessage;
		return (J) this;
	}

	/**
	 * Shows a ticket, warning or cross from bootstrap 4
	 *
	 * @return
	 */
	@Override
	public Boolean getShowControlFeedback()
	{
		return showControlFeedback;
	}

	/**
	 * Shows a ticket, warning or cross from bootstrap 4
	 *
	 * @param showControlFeedback
	 *
	 * @return
	 */
	@Override
	public J setShowControlFeedback(Boolean showControlFeedback)
	{
		setAngularValidation(true);
		this.showControlFeedback = showControlFeedback;
		return (J) this;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 79 * hash + (this.getID().hashCode());
		return hash;
	}

	/**
	 * Returns the help block with erros, never null
	 *
	 * @return
	 */
	@NotNull
	public Div getHelpBlockWithErrors()
	{
		if (helpBlockWithErrors == null)
		{
			setHelpBlockWithErrors(new Div());
		}
		return helpBlockWithErrors;
	}

	/**
	 * sets the help block with errors
	 *
	 * @param helpBlockWithErrors
	 *
	 * @return
	 */
	public J setHelpBlockWithErrors(@NotNull Div helpBlockWithErrors)
	{
		this.helpBlockWithErrors = helpBlockWithErrors;
		this.helpBlockWithErrors.addClass("help-block with-errors col-form-label");
		return (J) this;
	}

	/**
	 * The general global error for a message
	 *
	 * @return
	 */
	@Nullable
	public String getErrorMessage()
	{
		return errorMessage;
	}

	/**
	 * The general global error for a message
	 *
	 * @param errorMessage
	 *
	 * @return
	 */
	public J setErrorMessage(@Nullable String errorMessage)
	{
		this.errorMessage = errorMessage;
		return (J) this;
	}

	/**
	 * Sets the instance of this
	 *
	 * @return
	 */
	public String getFrontIcon()
	{
		return frontIcon;
	}

	/**
	 * Returns an instance of this
	 *
	 * @param frontIcon
	 *
	 * @return
	 */
	public J setFrontIcon(String frontIcon)
	{
		this.frontIcon = frontIcon;
		return (J) this;
	}
}
