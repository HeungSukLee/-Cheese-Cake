
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        int array[] = new int[20000];
        for(int i=0;i<20000;i++){
            array[i]=0;
        }

        for(int i=0;i<10000;i++){

            array[D(i)]++;
        }

        for(int i=0;i<10000;i++){
            if(array[i]==0){
                System.out.println(i);
            }
        }

    }

    static int D(int num) {

        int a = num;
        int b = num;
        int sum = num;

        while (b >=1) {
            a = b % 10;
            sum += a;
            b = b / 10;
        }
        return sum;
    }
}
