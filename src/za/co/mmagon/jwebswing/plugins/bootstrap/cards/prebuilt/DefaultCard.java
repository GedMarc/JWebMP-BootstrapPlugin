package za.co.mmagon.jwebswing.plugins.bootstrap.cards.prebuilt;

import za.co.mmagon.jwebswing.base.html.H1;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCard;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.parts.*;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSDefaultOptions;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * A default complete structured bootstrap card
 *
 * @param <J>
 */
public class DefaultCard<J extends DefaultCard<J>> extends BSCard<J>
{
	private BSCardHeader<?> containerHeader;

	private BSCardImageTop cardImageTop;
	private BSCardBody contentBlock;

	private List<BSCardLink> cardLinks;
	private BSCardFooter footerBlock;

	private transient Optional<String> headerText;
	private transient Optional<String> footerText;

	private transient Optional<String> cardImage;
	private transient Optional<BSCardImageOverlay> cardImageOverlay;
	private transient Optional<String> cardTitle;
	private transient Optional<String> cardSubTitle;
	private transient Optional<LocalDateTime> cardDate;

	public DefaultCard()
	{
		this(null);
	}

	public DefaultCard(String headerText)
	{
		this(headerText, null, null, null, null);
	}

	public DefaultCard(String headerText, String cardImage, String cardTitle, String cardSubTitle, LocalDateTime cardDate)
	{
		this.headerText = Optional.ofNullable(headerText);
		this.cardImage = Optional.ofNullable(cardImage);
		this.cardTitle = Optional.ofNullable(cardTitle);
		this.cardSubTitle = Optional.ofNullable(cardSubTitle);
		this.cardDate = Optional.ofNullable(cardDate);
	}

	public DefaultCard(String headerText, String cardImage)
	{
		this(headerText, cardImage, null, null, null);
	}

	/**
	 * Constructs a new card with the given parameters
	 *
	 * @param headerText
	 * @param cardImage
	 * @param cardTitle
	 */
	public DefaultCard(String headerText, String cardImage, String cardTitle)
	{
		this(headerText, cardImage, cardTitle, null, null);
	}

	/**
	 * Constructs a new default card with the given parameters
	 *
	 * @param headerText
	 * @param cardImage
	 * @param cardTitle
	 * @param cardSubTitle
	 */
	public DefaultCard(String headerText, String cardImage, String cardTitle, String cardSubTitle)
	{
		this(headerText, cardImage, cardTitle, cardSubTitle, null);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized())
		{
			buildHeader();
			buildCardTitle();
			buildCardLinks();
			if (contentBlock != null)
			{
				add(contentBlock);
			}
			buildFooter();
		}
		super.init();
	}

	private void buildHeader()
	{
		if (cardImageTop != null)
		{
			add(cardImageTop);
		}

		if (headerText.isPresent() && containerHeader == null)
		{
			containerHeader = new BSCardHeader<>();
		}

		if (containerHeader != null)
		{
			if (headerText.isPresent())
			{
				H1 heading = new H1(headerText.get());
				containerHeader.add(heading);
			}
			add(containerHeader);
		}
	}

	@SuppressWarnings("unchecked")
	private void buildCardTitle()
	{
		if (cardImage.isPresent())
		{
			cardImageTop = new BSCardImageTop(cardImage.get());
			add(cardImageTop);
		}

		if (cardImageOverlay != null && cardImageOverlay.isPresent())
		{
			add(cardImageOverlay.get());
		}

		if (cardTitle.isPresent() || cardSubTitle.isPresent())
		{
			if (contentBlock == null)
			{
				contentBlock = new BSCardBody();
			}
			if (cardTitle.isPresent())
			{
				BSCardTitle innerTitle = new BSCardTitle();
				innerTitle.setText(cardTitle.get());
				contentBlock.add(innerTitle);
			}

			if (cardSubTitle.isPresent())
			{
				BSCardSubtitle innerSubTitle = new BSCardSubtitle();
				innerSubTitle.setText(cardSubTitle.get());
				contentBlock.add(innerSubTitle);
			}
		}

	}

	@SuppressWarnings("unchecked")
	private void buildCardLinks()
	{
		if (!getCardLinks().isEmpty())
		{
			if (contentBlock == null)
			{
				contentBlock = new BSCardBody();
			}
			for (BSCardLink link : getCardLinks())
			{
				contentBlock.add(link);
			}
		}
	}

	private void buildFooter()
	{
		if (cardDate.isPresent() || getFooterText() != null)
		{
			if (footerBlock == null)
			{
				footerBlock = new BSCardFooter();
			}
			if (footerText != null && footerText.isPresent())
			{
				footerBlock.add(footerText.get());
				add(footerBlock);
				footerBlock.addClass(BSDefaultOptions.Text_Muted);
				footerBlock.addClass("text-xs-center");
			}
			cardDate.ifPresent(localDateTime -> footerBlock.add("Date : " + localDateTime.toLocalDate()));
		}
	}

	/**
	 * Returns the card links associated with this card
	 *
	 * @return
	 */
	@NotNull
	public List<BSCardLink> getCardLinks()
	{
		if (cardLinks == null)
		{
			cardLinks = new ArrayList<>();
		}
		return cardLinks;
	}

	/**
	 * Sets the card links associated with this card
	 *
	 * @param cardLinks
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCardLinks(List<BSCardLink> cardLinks)
	{
		this.cardLinks = cardLinks;
		return (J) this;
	}

	/**
	 * Returns the footer text to be set at the bottom
	 *
	 * @return
	 */
	@Nullable
	public String getFooterText()
	{
		if (footerText == null)
		{
			return null;
		}
		return footerText.orElse(null);
	}

	/**
	 * Sets the text to be placed at the footer
	 *
	 * @param footerText
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFooterText(String footerText)
	{
		this.footerText = Optional.ofNullable(footerText);
		return (J) this;
	}

	/**
	 * returns the content block
	 */
	@Nullable
	public BSCardBody getCardBody()
	{
		return null;
	}

	/**
	 * Gets the container header associated with this card
	 *
	 * @return
	 */
	public BSCardHeader<?> getContainerHeader()
	{
		if (containerHeader == null)
		{
			containerHeader = new BSCardHeader<>();
		}
		return containerHeader;
	}

	/**
	 * Sets the container header associated with this component
	 *
	 * @param containerHeader
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setContainerHeader(BSCardHeader containerHeader)
	{
		this.containerHeader = containerHeader;
		return (J) this;
	}

	/**
	 * Gets the card image top associated with this component
	 *
	 * @return
	 */
	public BSCardImageTop getCardImageTop()
	{
		return cardImageTop;
	}

	/**
	 * Sets the card image top associated with this component
	 *
	 * @param cardImageTop
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCardImageTop(BSCardImageTop cardImageTop)
	{
		this.cardImageTop = cardImageTop;
		return (J) this;
	}

	/**
	 * Sets the content block associated with the card
	 *
	 * @param contentBlock
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setContentBlock(BSCardBody contentBlock)
	{
		this.contentBlock = contentBlock;
		return (J) this;
	}

	/**
	 * Gets the footer block to be applied
	 *
	 * @return
	 */
	@Nullable
	public BSCardFooter getFooterBlock()
	{
		return footerBlock;
	}

	/**
	 * Sets the footer block to be applied
	 *
	 * @param footerBlock
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFooterBlock(BSCardFooter footerBlock)
	{
		this.footerBlock = footerBlock;
		return (J) this;
	}

	/**
	 * Returns the header text
	 *
	 * @return
	 */
	public String getHeaderText()
	{
		return headerText.orElse(null);
	}

	/**
	 * Sets the header text
	 *
	 * @param headerText
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeaderText(String headerText)
	{
		this.headerText = Optional.ofNullable(headerText);
		return (J) this;
	}

	/**
	 * Gets the cards image
	 *
	 * @return
	 */
	public Optional<String> getCardImage()
	{
		return cardImage;
	}

	/**
	 * Sets the cards image
	 *
	 * @param cardImage
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCardImage(String cardImage)
	{
		this.cardImage = Optional.ofNullable(cardImage);
		return (J) this;
	}

	public Optional<BSCardImageOverlay> getCardImageOverlay()
	{
		return cardImageOverlay;
	}

	/**
	 * Returns the card image overlay
	 *
	 * @param cardImageOverlay
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setCardImageOverlay(BSCardImageOverlay cardImageOverlay)
	{
		this.cardImageOverlay = Optional.ofNullable(cardImageOverlay);
		return (J) this;
	}

	/**
	 * Gets the cards inner title
	 *
	 * @return
	 */
	public Optional<String> getCardTitle()
	{
		return cardTitle;
	}

	/**
	 * Sets the cards inner title or sub title
	 *
	 * @param cardTitle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCardTitle(String cardTitle)
	{
		this.cardTitle = Optional.ofNullable(cardTitle);
		return (J) this;
	}

	/**
	 * Returns the cards subtitle
	 *
	 * @return
	 */
	public Optional<String> getCardSubTitle()
	{
		return cardSubTitle;
	}

	/**
	 * Sets the card sub title
	 *
	 * @param cardSubTitle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCardSubTitle(String cardSubTitle)
	{
		this.cardSubTitle = Optional.ofNullable(cardSubTitle);
		return (J) this;
	}

	/**
	 * Returns the associated card date
	 *
	 * @return
	 */
	public Optional<LocalDateTime> getCardDate()
	{
		return cardDate;
	}

	/**
	 * Sets the associated card date
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setCardDate(LocalDateTime cardDate)
	{
		this.cardDate = Optional.ofNullable(cardDate);
		return (J) this;
	}
}
