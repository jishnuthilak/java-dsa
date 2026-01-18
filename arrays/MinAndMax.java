package arrays;
public class MinAndMax {

    static void MinMax(int[] arr){
        int min=0;
        int max=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        System.out.println(arr[max]);
        System.out.println(arr[min]);
    }
    public static void main(String[] args) {
        int[] arr1={7,1,6,2,5,3,4};
        MinMax(arr1);
    }
}