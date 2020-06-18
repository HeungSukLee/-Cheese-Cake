import java.io.*;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String time = br.readLine();
        String[] arr = time.split(":");

        if (time.contains("AM")) {
            if (arr[0].equals("12")) {
                arr[0] = "00";
            }
            arr[2] = arr[2].replace("AM", "");
        }

        if (time.contains("PM")) {
            if (arr[0].equals("12")) {
            } else {
                arr[0] = Integer.parseInt(arr[0]) + 12 + "";
            }
            arr[2] = arr[2].replace("PM", "");
        }

        time = String.join(":", arr);
        System.out.print(time);
    }
}
