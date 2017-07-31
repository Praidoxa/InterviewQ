package Sorts;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {64,25,12,22,11,1};
        for (int n:insertionSort(arr))
        System.out.println(n);
    }

    private static int [] insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++){
          int j=i-1;
          int key=arr[i];
            while ( j>=0 && arr[j]>arr[j+1]){
                arr[j+1] = arr[j];
                arr[j]=key;
                j-=1;
            }
        }
        return arr;
    }
}
