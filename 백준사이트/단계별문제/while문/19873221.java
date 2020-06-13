    import java.io.*;
    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            int a=0;
            int b=0;
            int sum=N;
            int number=0;

            while (true) {
                b = sum % 10;
                a = sum / 10;
                sum = b * 10 + ((a + b) % 10);
                number++;
                if(sum==N)
                    break;
            }
            System.out.println(number);
        }

    }
