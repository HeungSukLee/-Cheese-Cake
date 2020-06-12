class User extends Player {
    User(String s,Card[] c) {
        super(s,c);
    }

    public void info() {
        Card[] card;
        card = getCard();
        for (int i = 0; i < card.length; i++) {
            if (card[i] == null) break;
            System.out.printf("%d번쨰 카드의 숫자: %d ,suit : %s\n", i + 1, card[i].getRank()+1, card[i].getSuit());
        }
    }
}
