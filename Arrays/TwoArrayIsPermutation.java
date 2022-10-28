public class TwoArrayIsPermutation {
    

    public static void main(String[] args) {

        boolean result = isPermutation(new int[] {1,3,5,4,6},new int[] {1,3,2,4,6,5});
        System.out.println(result);
        
    }

    public static boolean isPermutation(int arr1[], int arr2[]) {

        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 0;
        int mult2 = 0;

        for (int i : arr1) {
            sum1 += i;
            mult1 *= i;
        }

        for (int i : arr2) {
            sum2 += i;
            mult2 *=i;            
        }

        return sum1==sum2 && mult1==mult2;
        
    }
}
