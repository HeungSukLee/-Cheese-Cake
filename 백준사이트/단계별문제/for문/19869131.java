import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        for(int i =1; i<10;i++){
            System.out.println(result+" * "+i+" = " +result*i);
        }
    }
}