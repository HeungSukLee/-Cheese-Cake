import java.io.*;

import java.util.*;
public class Gameoftwostacks{
    static int twoStacks(int x, int[] a, int[] b) {

        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        int sum =0;
        int cnt =0;

        for(int i=a.length-1;i>=0;i--){
            st1.push(a[i]);
        }
        for(int j=b.length-1;j>=0;j--){
            st2.push(b[j]);
        }

        while(x>sum){
            int n=0;
            int m=0;
            if(st1.isEmpty()&&!st2.isEmpty()){
                n=Integer.MAX_VALUE;
            }
            if(!st1.isEmpty()&&st2.isEmpty()){
                m=Integer.MAX_VALUE;
            }
            if(st1.isEmpty()&&st2.isEmpty()){
                break;
            }
            if(!st1.isEmpty()&&!st2.isEmpty()){
                n =st1.peek();
                m =st2.peek();
            }

            if(n>m){
                if(sum+m>=x) break;
                sum+=st2.pop();
                cnt++;
            }else{
                if(sum+n>=x) break;
                sum+=st1.pop();
                cnt++;
            }
        }
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());
            int m = Integer.parseInt(nmx[1].trim());
            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
