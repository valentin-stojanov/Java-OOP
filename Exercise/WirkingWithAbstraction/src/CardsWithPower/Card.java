package CardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;
    private int cardPower;

    public Card(CardRank cardRank, CardSuit cardSuit){
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.setCardPower();
    }

    private void setCardPower(){
        this.cardPower = cardRank.getRankPower() + cardSuit.getSuitPower();
    }

    public int getCardPower(){
        return this.cardPower;
    }

    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d",
                this.cardRank.name(), this.cardSuit.name(), getCardPower());
    }

}
