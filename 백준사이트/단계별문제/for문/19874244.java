import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int T = Integer.parseInt(br.readLine());
//            List<Integer> list = new ArrayList<>();
            for(int i =0; i<T;i++) {
                String numberStr=br.readLine();
                String[] num = numberStr.split(" ");
                int A = Integer.parseInt(num[0]);
                int B = Integer.parseInt(num[1]);
                int result = A+B;
                bw.write(String.valueOf(result)+ "\n");
            }
            bw.flush();
            bw.close();
        }catch(IOException E){
        }
    }
}