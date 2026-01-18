package arrays;

public class movezerostoend {
    static void zeroend(int[] arr){
        int[] arr1= new int[arr.length];
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr1[temp]=arr[i];
                temp++;
            }
        }
        for(int element:arr1){
            System.out.println(element+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1={7,0,6,2,0,3,0};
        zeroend(arr1);
    }
}
