import java.util.HashMap;
import java.util.Scanner;
public class VehicleReservationProgram {//수정x

    private static Scanner scanner = new Scanner(System.in);
    public static void printMenu() {
        System.out.println("차량-----------예약관리프로그램입니다.------------- ");
        System.out.println("1. 회원가입| 2. 로그인| 3. 차량예약 관리| 4. 로그아웃| 5. 종료");
        System.out.println(" ------------------------------------------------------- ");
    }

    public static void main(String[] args) {
        VehicleManager vihiclemanager = new VehicleManager();
        AccountManager accountmanager = new AccountManager();
        HashMap<String, Account> accountHash;

        Account current_account = null;
        while (true) {
            printMenu();
            System.out.print("선택>> ");
            int selectNo = scanner.nextInt();//1.회원가입  2.로그인  3.차량예약관리  4.로그아웃  5.종료

            if (selectNo == 1) {
                accountmanager.signUp();
            } else if (selectNo == 2) {
                current_account = accountmanager.login();
            } else if (selectNo == 3) {
                if (current_account == null) {
                    System.out.println("등록된차량이 없습니다.");
                } else {
                    vihiclemanager.run(current_account);
                }
            } else if (selectNo == 4) {
                current_account = null;
                System.out.println("로그아웃합니다.");
            } else if (selectNo == 5) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
