import java.util.*;

public class PokerApplication {
    public static void main(String[] args) {
        while (true) {
            Dealer dealer = new Dealer();
            Card cUser[] = new Card[5];
            Card cCom[] = new Card[5];
            User user = new User("흥석", cUser);
            Computer computer = new Computer("알파고", cCom); ////// 딜러, 흥석, 알파고생성

            System.out.println("===========================게임을 시작합니다================================");
            System.out.println("=========한장의 카드를 드리겠습니다.========");
            cUser[0] = dealer.deal();
            cCom[0] = dealer.deal();
            System.out.println("당신의 카드는 아래와 같습니다.");
            user.info();

            System.out.println("");
            System.out.println("1.GO 2.DIE");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 2) continue;


            System.out.println("=========두장의 카드를 드리겠습니다.========");
            for (int i = 0; i < 2; i++) {
                cUser[1 + i] = dealer.deal();
                cCom[1 + i] = dealer.deal();
            }
            System.out.println("당신의 카드는 아래와 같습니다.");
            user.info();

            System.out.println("");
            System.out.println("1.GO 2.DIE");
            answer = scanner.nextInt();
            if (answer == 2) continue;

            System.out.println("=========두장의 카드를 드리겠습니다.========");
            for (int i = 0; i < 2; i++) {
                cUser[3 + i] = dealer.deal();
                cCom[3 + i] = dealer.deal();
            }
            System.out.println("당신의 카드는 아래와 같습니다.");
            user.info();
            System.out.println("");

            int scoreUser[] = dealer.score(cUser);
            int scoreComputer[] = dealer.score(cCom);
            winnerPrint(scoreUser, scoreComputer);

            System.out.println("");
            System.out.println("");
            System.out.println("게임을 계속하겠어요?");
            System.out.println("1.YES 2.NO");
            answer = scanner.nextInt();

            if (answer == 1) {
                continue;
            } else {
                break;
            }

        }
    }

    static void winnerPrint(int[] scoreUser, int[] scoreComputer) { // [0]->점수, [1]->number

        if (scoreUser[0] == 1) System.out.printf("User 최종족보: %d탑", scoreUser[1]);
        if (scoreUser[0] == 2) System.out.printf("User 최종족보: %d원페어", scoreUser[1]);
        if (scoreUser[0] == 3) System.out.printf("User 최종족보: %d트리플", scoreUser[1]);
        if (scoreUser[0] == 4) System.out.printf("User 최종족보: 플러쉬");
        if (scoreUser[0] == 5) System.out.printf("User 최종족보: 포카드");

        if (scoreComputer[0] == 1) System.out.printf(" VS Computer 최종족보: %d탑", scoreComputer[1]);
        if (scoreComputer[0] == 2) System.out.printf(" VS Computer 최종족보: %d원페어", scoreComputer[1]);
        if (scoreComputer[0] == 3) System.out.printf(" VS Computer 최종족보: %d트리플", scoreComputer[1]);
        if (scoreComputer[0] == 4) System.out.printf(" VS Computer 최종족보: 플러쉬");
        if (scoreComputer[0] == 5) System.out.printf(" VS Computer 최종족보: 포카드");
        System.out.println("");


        if (scoreUser[1] == 0) // A인 경우 점수가 제일 높기 때문에
            scoreUser[1] = 14;
        if (scoreComputer[1] == 0)
            scoreComputer[1] = 14;

        if (scoreComputer[0] > scoreUser[0]) {
            System.out.println("컴퓨터가 이겼습니다.");
        } else if (scoreComputer[0] < scoreUser[0]) {
            System.out.println("사용자가 이겼습니다.");
        } else {
            if (scoreComputer[0] == 1 || scoreComputer[0] == 2 || scoreComputer[0] == 3) {
                if (scoreComputer[1] > scoreUser[1]) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if (scoreComputer[1] < scoreUser[1]) {
                    System.out.println("사용자가 이겼습니다.");
                } else {
                    System.out.println("비겼습니다.");
                }
            } else {
                System.out.println("비겼습니다.");
            }
        }
    }
}



