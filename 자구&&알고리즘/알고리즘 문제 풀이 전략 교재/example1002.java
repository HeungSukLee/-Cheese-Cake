import java.util.Scanner;

public class example1002 {
    public static void main(String[] args) {

        int answer = (int) (Math.random() * 10);
        int counter = 1;
        System.out.println("0에서 9까지의 숫자를 입력하세요.");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            if (answer > N)
                System.out.println(N + "보다 큽니다.");
            if (answer < N)
                System.out.println(N + "보다 작습니다.");
            if (answer == N) {
                System.out.println(counter + "번만에 정답을 맞추었습니다.");
                break;
            }
            counter++;
        }
    }
}
