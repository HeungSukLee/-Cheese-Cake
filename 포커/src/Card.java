class Card {
    private int rank;    //number 11
    private String suit; //H D C S

    public void setCard(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
