import java.io.*;
public class HEAP {
    static int arr[] = new int[100002];
    static int P = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            if (T == 0) {
                if (P != 0) {
                    System.out.println(pop());
                    delete();
                } else {
                    System.out.println(0);
                }
            }
            if (T != 0) {
                insert(T);
            }
        }
    }

    static int pop() { // pop은 맨 위에있는 갚을 반환한다.
        return arr[1];
    }

    static void delete() {
        arr[1] = arr[P];
        P = P - 1;
        int W = 1;
        int Wo;
        int num;

        while (2 * W <= P) {
            num = arr[2 * W];
            Wo = 2 * W;
            if (W * 2 + 1 <= P) {
                if (Math.abs(arr[2 * W]) > Math.abs(arr[2 * W + 1])) {
                    num = arr[2 * W + 1];
                    Wo = 2 * W + 1;
                }else if (Math.abs(arr[2 * W]) == Math.abs(arr[2 * W + 1])) {
                    if (arr[2 * W] < arr[2 * W + 1]) {
                        num = arr[2 * W];
                        Wo = 2 * W;
                    } else {
                        num = arr[2 * W + 1];
                        Wo = 2 * W + 1;
                    }
                }else{
                    num = arr[2 * W];
                    Wo = 2 * W;
                }
            }

            if (Math.abs(arr[W]) >= Math.abs(arr[Wo])) {
                int tmp=0;
                tmp = arr[W];
                arr[W] = arr[Wo];
                arr[Wo] = tmp;
            }else {
                break;
            }
            W = Wo;
        }
    }

    static void insert(int T) {
        P = P + 1;
        arr[P] = T;
        int W = P;

        while (W > 1) {
            if (Math.abs(arr[W / 2]) > Math.abs(arr[W])) {
                int tmp = arr[W / 2];
                arr[W / 2] = arr[W];
                arr[W] = tmp;
                W = W / 2;
            } else if (Math.abs(arr[W / 2]) == Math.abs(arr[W])) {
                if (arr[W / 2] > arr[W]) {
                    int tmp = arr[W / 2];
                    arr[W / 2] = arr[W];
                    arr[W] = tmp;
                    W = W / 2;
                } else{
                    break;
                }
            }else {
                break;
            }
        }
    }
}
