class Dealer {
    private String[] suits = {"S", "H", "D", "C"};
    private int numcard;

    public Dealer() {
        numcard = 13;
    }

    public Card deal() {                                         ////// 카드를 나누어 주는 함수
        Card card = new Card();
        int rank = (int) (Math.random() * 13);
        int numSuit = (int) (Math.random() * 4);
        String suit = suits[numSuit];
        card.setCard(suit, rank);
        return card;
    }

    public int[] score(Card[] cards) { /////  5장 카드의 족보를 계산 하는 함수
        int count = 0;
        int[] numCnt = new int[13];

        for (int i = 0; i < cards.length; i++) {
            numCnt[cards[i].getRank()]++;//number가 같은 카드의 숫자를 센다.
        }

        // StringUtils.equals(a, b);
        // gradle, maven -- build
        for (int i = 0; i < cards.length - 1; i++) {
            if (cards[i].getSuit() != cards[i + 1].getSuit())//플러쉬족보
                break;
            count++;
        }

        int max = 0, num = 0, tmp = 0;
        for (int i = 0; i < numCnt.length; i++) {
            if (numCnt[i] >= max) {
                max = numCnt[i];
                num = i;
            }
        }
        if (max == numCnt[0]) //A인경우
            num = 0;

        if (max == 4) tmp = 5;
        if (max == 3) tmp = 3;
        if (max == 2) tmp = 2;
        if (max == 1) tmp = 1;
        if (count == 4)
            tmp = 4;

        int score[] = {tmp, num};
        return score;
    }
}
