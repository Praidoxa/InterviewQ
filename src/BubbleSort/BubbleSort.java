package BubbleSort;

public class BubbleSort {
    static int[] arr = {14,2, 3, 1, 8, 5, 7, 9};

    public static void main(String[] args) {

        bubbleSort(arr);
        System.out.print(binorySearch(arr,11));

//        for (int i=0;i<arr.length;i++){
//        System.out.println(arr[i]);
//        }

    }

    private static boolean binorySearch(int[] arr, int i) {

        int minIndex=0;
        int maxIndex=arr.length-1;
        while (maxIndex>=minIndex){
            int midIndex = (maxIndex + minIndex)/2;
            if (arr[midIndex] == i){
                return true;
            }
            else  if(arr[midIndex]<i){
                minIndex = midIndex+1;
            }else{
                maxIndex=midIndex-1;
            }
        }
        return false;
    }


    private static void bubbleSort(int[] arr) {
        boolean flag = true;

        while (flag) {
            flag=false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag =true;
                }
            }
        }
    }
}
