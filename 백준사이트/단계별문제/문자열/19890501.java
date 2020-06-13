
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {


        try{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String S = bf.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = {"c=","c-","dz=","d-","lj","nj","s=","z=" };
        int num =0;

        for(int i = 0; i<array.length;i++) {
            S=S.replaceAll(array[i],"+");
        }
        num = S.length();

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        }catch(IOException E){
        }
    }
}
