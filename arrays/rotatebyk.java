package arrays;

public class rotatebyk {
    static void rotate(int[] arr,int k){
        k=k%arr.length;
        int left=0;
        int right=arr.length-1;
            while(left<right){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right--;
            }
        left=0;
        right=k-1;
        while(left<right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
            }
        left=k;
        right=arr.length-1;
        while(left<right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }

        for(int element:arr){
            System.out.println(element+" ");
        }

    }
        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        rotate(arr,3);

        }
    }
    
