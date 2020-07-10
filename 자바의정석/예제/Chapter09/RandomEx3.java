import java.util.*;
class RandomEx3 {
    public static void main(String[] args) {
        for(int i=0; i < 10;i++)
            System.out.print(getRand(5, 10)+","); //5~10사이의 수 랜덤으로 얻기.
        System.out.println();

        int[] result = fillRand(new int[10], new int[]{ 2, 3, 7, 5});

        System.out.println(Arrays.toString(result));
    }

    public static int[] fillRand(int[] arr, int from, int to) {
        for(int i=0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        }

        return arr;
    }

    public static int[] fillRand(int[] arr, int[] data) { // 입력한 배열의 원소를 랜덤으로 얻는 배열을 생성하는 함수
        for(int i=0; i < arr.length; i++) {
            arr[i] = data[getRand(0, data.length-1)]; // 예를들어 데이터의 원소가 4개면 0~3 사이의 숫자중 랜덤하게 뽑는 함수 생성.
                                                        // data[0] , data[3] , data[1] .... 이렇게 입력한 배열에서 랜덤한 수가 뽑힌다.
        }

        return arr;
    }

    public static int getRand(int from, int to) { // from에서 to사이의수를 랜덤으로 얻는 함수.
        return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
    }
}