package CardRank;

import CardsWithPower.CardRank;

public class Main {
    public static void main(String[] args) {
        CardRank[] cardRanks = CardRank.values();

        System.out.println("Card Ranks:");
        for (CardRank ranks : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    ranks.ordinal(), ranks.name());
        }
    }
}
