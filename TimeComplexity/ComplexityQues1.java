/**
 * ComplexityQues1
 */
public class ComplexityQues1 {

    public static void main(String[] args) {
        
        int[] a = {1,5,3,2};
        ComplexityQues1 cq = new ComplexityQues1();
        cq.SumAndProductOfArray(a);
        
    }

    public void SumAndProductOfArray(int[] array) {

        int sum = 0;
        int product = 1;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
            product *=array[i];
        }

        System.out.println(sum);
        System.out.println(product);
        
    }
    /**
     * Time complexity for the SumAndProductOfArray is O(n)
     */
}