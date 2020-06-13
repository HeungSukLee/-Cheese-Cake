    import java.io.*;
    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();

            for(int i=1;i<T+1;i++){
                for(int j = 1; j<i+1;j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }
    }
