import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList arrayList = new ArrayList();

        int input = Integer.parseInt(br.readLine());
        for(int i=0; i<input; i++){
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrayList);
        for(int i=0; i<input; i++){
            bw.write(String.valueOf(arrayList.get(i))+"\n");
        }


        bw.flush();
        bw.close();
    }
}
