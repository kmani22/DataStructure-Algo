public class ComplexityQues2 {
    
    public static void main(String[] args) {

        ComplexityQues2 cq = new ComplexityQues2();
        int[] array = {1,3,4,5};
        cq.pairsOfArray(array);
        
    }

    public void pairsOfArray(int[] array) {

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array.length; j++){
                System.out.println(array[i] + " " + array[j]);
            }

        }
        
    }
}
