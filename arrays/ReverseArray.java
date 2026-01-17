package arrays;

public class ReverseArray {

    static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        reverse(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

