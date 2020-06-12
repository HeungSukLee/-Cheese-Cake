class Player {
    private String name;
    private Card[] cards;

    public Player(String s, Card[] c) {
        this.name = s;
        this.cards = c;
    }

    public Card[] getCard() {
        return cards;
    }
}
