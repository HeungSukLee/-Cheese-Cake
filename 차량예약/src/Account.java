public class Account {//수정x
    private String accountNumber;///ID
    private String password;//PASSWORD
    private String name;//이름

    public Account(String accountNumber, String name, String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}