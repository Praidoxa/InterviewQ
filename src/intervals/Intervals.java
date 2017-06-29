package intervals;

public class Intervals {
    static int[] a={1,12,42,70,36,-4,43,15};
    static int[] b={5,15,44,72,36,2,69,24};

    public static void main(String[] args) {
        System.out.println(Interval(a, b));
    }




    private static int Interval(int[] A, int[] B){
        int count = 0;
        for(int i=0; i<A.length;i++){
            for(int k=i+1; k<A.length; k++ ){
                if((A[i]>=A[k] && A[i]<=B[k]) || (A[i]<=A[k] && A[k]>=B[i]) ){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
