import java.io.*;
import java.util.Arrays;

public class MMMMAIN {

    static int[][] house;
    static int[][] check;
    static int[] arr;
    static int[] px = {-1, 0, 1, 0};
    static int[] py = {0, 1, 0, -1};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int ans = 0;
        house = new int[N][N];
        check = new int[N][N];
        arr = new int[N * N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                house[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (check[i][j] == 0 && house[i][j] == 1) {
                    int size = dfs(i, j);
                    arr[ans++] = size;
                }
            }
        }
        System.out.println(ans);
        Arrays.sort(arr, 0, ans);
        for (int i = 0; i < ans; i++) {
            System.out.println(arr[i]);
        }

    }

    static int dfs(int a, int b) {
        int cnt = 1;
        check[a][b] = 1;

        for (int i = 0; i < 4; i++) {
            int nx = a + px[i];
            int ny = b + py[i];

            if (0 <= nx && nx <= N - 1 && 0 <= ny && ny <= N - 1) {
                if (check[nx][ny] == 0 && house[nx][ny] == 1) {
                    cnt += dfs(nx, ny);
                }

            }
        }
        return cnt;
    }
}
