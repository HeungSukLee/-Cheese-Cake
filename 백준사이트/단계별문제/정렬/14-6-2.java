import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int arr[][]=new int[input][2];

        for (int i = 0; i < input; i++) {
            String xy[] = br.readLine().split(" ");
            arr[i][0]= Integer.parseInt(xy[0]);
            arr[i][1]= Integer.parseInt(xy[1]);
        }

        sort(arr);
        for (int i = 0; i < input; i++) {
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();
    }

    static void sort(int[][] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] < arr[i][0]) {
                    int tmp = arr[j][0];
                    arr[j][0]=arr[i][0];
                    arr[i][0]=tmp;
                }else if (arr[j][0] == arr[i][0]) {
                    if (arr[j][1] < arr[i][1]) {
                        int tmp = arr[j][1];
                        arr[j][1]=arr[i][1];
                        arr[i][1]=tmp;
                    }
                }
            }
        }
    }
}

