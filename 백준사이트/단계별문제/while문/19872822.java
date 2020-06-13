    import java.io.*;
    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            while(true){
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                if((A==0)&&(B==0)){
                    break;
                }
                int result = A+B;
                System.out.println(result);
            }
        }

        }
