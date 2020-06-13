    import java.io.*;
    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();

            for(int i=1;i<T+1;i++){
                String S="";

                for(int j = 1; j<T+1;j++) {

                    if(i+j>T){
                        S=S+"*";
                    }else{
                        S=S+" ";
                    }
                }
                System.out.printf(S);
                System.out.println("");
            }

        }
    }
