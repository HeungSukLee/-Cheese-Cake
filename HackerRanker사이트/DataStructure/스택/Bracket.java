import java.io.*;
import java.util.*;
public class Bracket {

    static String isBalanced(String s) {

        String result ="";
        Stack<String> st1= new Stack<String>();
        Stack<String> st2= new Stack<String>();


        if(s.length()%2!=0){
            result = "NO";
        }else{
            for(int i=0; i<s.length()/2;i++){
                st1.push(s.substring(i,i));
            }
            for(int i=s.length()-1; i>=s.length()/2;i--){
                st2.push(s.substring(i,i));
            }

            for(int i=0; i<s.length()/2;i++){
                if(st1.pop().equals("(")){
                    if(!(st2.pop().equals(")"))){
                        result="NO";
                        break;
                    }
                }
                if(st1.pop().equals("{")){
                    if(!(st2.pop().equals("}"))){
                        result="NO";
                        break;
                    }
                }
                if(st1.pop().equals("[")){
                    if(!(st2.pop().equals("]"))){
                        result="NO";
                        break;
                    }
                }
                result="YES";
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
