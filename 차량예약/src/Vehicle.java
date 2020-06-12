public class Vehicle {//수정x

    private String number;
    private String type;

    public Vehicle(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}