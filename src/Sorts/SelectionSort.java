package Sorts;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {12,38,6,9,2,1};

        for (int n:selectionsort(arr)){
          System.out.println(n);
        }
    }

    private static int[] selectionsort(int[] arr) {

        for(int i=0; i<arr.length-1; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
