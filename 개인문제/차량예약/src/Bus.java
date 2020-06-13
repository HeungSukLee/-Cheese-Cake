public class Bus extends Vehicle {//수정x

    private String[][] seat;

    public Bus(String number, String type) {
        super(number, type);
        this.seat = new String[5][4];
    }

    public void setSeat(int x, int y, String pname) {
        this.seat[x][y] = pname;
    }

    public String getSeat(int x, int y) {
        return seat[x][y];
    }
}