package arrays;

public class mergetwosortedarray {
    static void merge(int[] arr1,int[] arr2){
        int p1=0;
        int p2=0;
        int n1=arr1.length;
        int n2=arr2.length;
        int n3=0;
        int[] arr3= new int[n1+n2];
        while(p1<n1 && p2<n2){
            if(arr1[p1]<=arr2[p2]){
                arr3[n3]=arr1[p1];
                p1++;
                n3++;
            }
            else{
                arr3[n3]=arr2[p2];
                p2++;
                n3++;
            }
        }
        if(p1<n1){
            while(p1<n1){
                arr3[n3]=arr1[p1];
                p1++;
                n3++;
            }
        }
        else{
            while(p2<n2){
                arr3[n3]=arr2[p2];
                p2++;
                n3++;
            }
        }

        for(int element:arr3){
            System.out.println(element+" ");
        }


    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        merge(arr1,arr2);

    }
    
}
