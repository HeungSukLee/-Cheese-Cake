import java.io.*;

public class Main {
    static int[][] matrix, check;

    static class Queue {
        public int x, y;

        Queue() {
        }
        Queue(int _x, int _y) {
            x = _x;
            y = _y;
        }
    }

    static Queue[] Q;
    static int[] px = {1, -1, 0, 0};
    static int[] py = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String NM[] = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            matrix = new int[N+1][M+1];
            check = new int[N+1][M+1];
            Q = new Queue[N*M+5];

            for (int i = 0; i < N * M + 5; i++) Q[i] = new Queue(0, 0);

            for (int i = 1; i <= N; i++) {
                String s = br.readLine();
                for (int j = 0; j < M; j++) {
                    matrix[i][j + 1] = Integer.parseInt(String.valueOf(s.charAt(j)));
                    check[i][j + 1] = -1;
                }
            }

            int front = 0, rear = -1;
            Q[++rear] = new Queue(1, 1);
            check[1][1] = 1;


            while (front <= rear) {

                Queue cur = Q[front++];
                int x = cur.x;
                int y = cur.y;
                for (int dir = 0; dir < 4; dir++) {
                    int nxt_x = x + px[dir];
                    int nxt_y = y + py[dir];
                    if (1 <= nxt_x && nxt_x <= N && 1 <= nxt_y && nxt_y <= M) {
                        if (matrix[nxt_x][nxt_y] == 1) {
                            if (check[nxt_x][nxt_y] == -1) {
                                check[nxt_x][nxt_y] = check[x][y] + 1;
                                Q[++rear] = new Queue(nxt_x, nxt_y);
                            }
                        }
                    }
                }
            }
            System.out.println(check[N][M]);
        }
    }
}

