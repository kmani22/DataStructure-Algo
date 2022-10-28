public class MaxProductOfTwoIntegers {
    

    public static void main(String[] args) {
        
        int result = MaxProduct(new int[] {20,10,30,50,40,60});
        System.out.println(result);
    }

    public static int MaxProduct(int array[]) {

        int maximumProduct = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                maximumProduct = Integer.max(maximumProduct, array[i] * array[j]);
            }
        }
        return maximumProduct;


        
    }
}
