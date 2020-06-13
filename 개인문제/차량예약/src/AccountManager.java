import java.util.HashMap;
import java.util.Scanner;

public class AccountManager {//로그인 로그아웃 함수
    private Scanner scanner;
    private HashMap<String, Account> accountHash; // Account ->id,이름,비밀번호

    public AccountManager() {
        this.scanner = new Scanner(System.in);
        this.accountHash = new HashMap<String, Account>();
    }

    public void signUp() { //회원가입함수
        String id; String name; String password;
        int acountNumber = 0;

        System.out.print("ID:");
        id = scanner.nextLine();
        System.out.print("이름:");
        name = scanner.nextLine();
        System.out.print("Password:");
        password = scanner.nextLine();

        if (accountHash.containsKey(id)) {
            System.out.println("아이디가 이미 존재합니다. 다시입력해주세요");
        } else {
            accountHash.put(id, new Account(Integer.toString(++acountNumber), name, password));
        }
    }


    public Account login() {//로그인함수
        while (true) {
            String id, password;
            System.out.print("ID:");
            id = scanner.nextLine();

            if (!this.accountHash.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            } else {
                while (true) {
                    System.out.print("비밀번호:");
                    password = scanner.nextLine();

                    if (!(this.accountHash.get(id).getPassword()).equals(password)) {
                        System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                        continue;
                    } else {
                        return this.accountHash.get(id);
                    }
                }
            }
        }
    }
}

