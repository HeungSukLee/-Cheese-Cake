    import java.io.*;
    import java.util.Scanner;
    
    class Main {
        public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
    
            for(int i=1;i<T+1;i++){
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                int result = A+B;
    
                System.out.println("Case #"+i+": "+A+" + "+B+" = "+result);
            }
    
        }
    }
