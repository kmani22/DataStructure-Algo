import java.util.Arrays;

/**
 * TwoSumOrPairSum
 */
public class TwoSumOrPairSum {

    
    public static void main(String[] args) {

       int result[] = PairSum(new int[] {2,7,13,15}, 21);
       System.out.println(Arrays.toString(result)); 
        
    }

    public static int[] PairSum(int array[], int targetValue) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == targetValue){
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("No Pairs Found !!");
        
    }
}