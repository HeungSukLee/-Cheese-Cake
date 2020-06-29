import java.util.Scanner;
import java.util.Stack;

public class LargestLec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] heights = new int[N + 1];
        for (int i = 0; i < N; i++) {
            heights[i] = in.nextInt();
        }

        long maxArea = 0;
        Stack<Integer> indices = new Stack<Integer>();

        for (int i = 0; i < heights.length; i++) {//0 1 2 3 4
            while (!indices.empty() && heights[i] <= heights[indices.peek()]) {
                int index = indices.pop();
                long area = (long) heights[index]
                        * (i - (indices.empty() ? 0 : (indices.peek() + 1)));
                maxArea = Math.max(maxArea, area);
            }
            indices.push(i);
        }
        System.out.println(maxArea);

        in.close();
    }
}