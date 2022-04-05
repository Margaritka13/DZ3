package Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        System.out.println("retLenArr");
        retLenArr(2, 3);
        int[] arr = {1, 0, 1, 0, 1, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
            System.out.println(arr[i] + " ");
        }

        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
            System.out.println("data[" + i + "] = " + data[i]);

        }
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) a[i] = a[i] * 2;
            System.out.println(i + " " + a[i] + "");
        }
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr2[i][j] = 1;
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void retLenArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
        //return arr;

    }

}
