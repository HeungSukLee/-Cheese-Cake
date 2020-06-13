public class Taxi extends Vehicle {//수정x

    private String seat;

    public Taxi(String number, String type) {
        super(number, type);
        this.seat = new String();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}