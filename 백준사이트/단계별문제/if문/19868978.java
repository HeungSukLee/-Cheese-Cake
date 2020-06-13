import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M-45<0){
            if(H==0){
                H=23;
                M=15+M;
            }
            else{
                H=H-1;
                M=15+M;
            }
        }
        else if((M-45)>=0){
            M=M-45;
            H=H;
        }

        System.out.print(H + " ");
        System.out.print(M);
    }
}