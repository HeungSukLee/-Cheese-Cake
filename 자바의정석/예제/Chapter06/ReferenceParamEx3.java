class ReferenceParamEx3 {
    //참조형을 매개변수로 넘겨서
    //배열을 정렬하는 example
    public static void main(String[] args)
    {
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum="+sumArr(arr)); // 배열의 총합을 출력
    }

    static void printArr(int[] arr) {  // 배열의 모든 요소를 출력
        System.out.print("[");

        for(int i : arr)  // 향상된 for문 // 이때 arr의 원소를 int i에 받아와서 출력하는 뜻!@!@
            System.out.print(i+",");

        System.out.println("]");
    }

    static int sumArr(int[] arr) {  // 배열의 모든 요소의 합을 반환
        int sum = 0;
        for(int i=0;i<arr.length;i++)
            sum += arr[i];
        return sum;
    }

    static void sortArr(int[] arr) {  // 배열의 정렬.
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-1-i;j++)
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
    } // sortArr(int[] arr)
}