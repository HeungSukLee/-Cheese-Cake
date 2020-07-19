import java.io.*;
public class Practice {
    static int[] arr = new int[10000];
    static int start = 0;
    static int end = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            if (a.contains("push")) {
                String[] str = a.split(" ");
                push(Integer.parseInt(str[1]));
            } else if (a.contains("pop")) {
                System.out.println(pop());
            } else if (a.contains("size")) {
                System.out.println(size());
            } else if (a.contains("empty")) {
                System.out.println(empty());
            } else if (a.contains("front")) {
                System.out.println(front());
            } else if (a.contains("back")) {
                System.out.println(back());
            }
        }
    }

    static void push(int num) {
        arr[end] = num;
        end++;
    }

    static int pop() {
        if (start== end) return -1;
        else{
            int num = arr[start];
            start++;
            return num;
        }
    }
    static int size() {
        return end - start;
    }

    static int empty() {
        if (start == end) return 1;
        else return 0;
    }

    static int front() {
        if (start == end) {
            return -1;
        } else return arr[start];
    }

    static int back() {
        if (start == end) return -1;
        else return arr[end - 1];
    }
}
