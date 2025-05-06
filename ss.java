import java.util.*;
public class SelectionSort{

    public static void selectionsort(int arr[]){

        for(int i=0;i<arr.length-1;i++){ //here we count number of turns
            int minPos= i; // here we assume minimum position as current position

            for(int j=i+1;j<arr.length;j++){ //using this loop we find mininmum from unsorted array

                if(arr[minPos] > arr[j] ){
                    minPos=j;
                }
            }
            // swap   using this swapping minimumPosition is swap with currentPosition
            int temp=arr[minPos];
            arr[minPos]=arr[i];        
            arr[i]= temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};

        selectionsort(arr);
        printarr(arr);
    }
     public static void printarr(int[] arr) {  // here we print array

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

}
