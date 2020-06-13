import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if((score%4==0) && (score%100!=0)){
            System.out.println("1");
        }
        else if(score%400==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }


    }
}