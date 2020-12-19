package models;

public class Card {
	// Attributes
	private int cardId;
	private String cardName;
	private String description;
	private boolean storable;

	//Constructor
	public Card(int cardId, String cardName, String description, boolean storable) {
		this.cardId = cardId;
		this.cardName = cardName;
		this.description = description;
		this.storable = storable;
	}
	
	//Methods

	public int getCardId() {
		return this.cardId;
	}

	public String getDescription() { return this.description; }

	public boolean isStorable() {
		return this.storable;
	}

	public String getCardName() { return  this.cardName; }

	@Override
	public String toString() {
		return "Card{" +
				"cardId=" + cardId +
				", cardName='" + cardName + '\'' +
				", description='" + description + '\'' +
				", storable=" + storable +
				'}';
	}
}
