import java.util.*;

class RandomEx2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];


        for (int i=0; i < number.length ; i++ ) {
//			System.out.print(number[i] = (int)(Math.random() * 10));
//                  0<=x<10 범위의 정수 x를 반환한다.
            System.out.print(number[i] = rand.nextInt(10)); // number[i]에 값을 입력하면서 출력 할 수 있다.
        }
        System.out.println();


        for (int i=0; i < number.length ; i++ ) {
            counter[number[i]]++; // 랜덤숫자를 count하는 배열열
       }

        for (int i=0; i < counter.length ; i++ ) {
            System.out.println( i +"의 개수 :"+ printGraph('#',counter[i]) + " " + counter[i]);// printGraph - >#표시
        }
    }

    public static String printGraph(char ch, int value) {

        char[] bar = new char[value];
        for(int i=0; i < bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar); //bar[0] = # , bar[1] = # , .....
        //String(bar) - > 합쳐진다.
    }
}