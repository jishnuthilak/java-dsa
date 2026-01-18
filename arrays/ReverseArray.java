package arrays;

public class ReverseArray {

    static void reverse(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;
            left++;
            right--;
            
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

