public class MissingNumber {

    // Find the single missing number from the integer array.
    
    public static void main(String[] args) {
        
        int array[] = {1,3,4,5,6,8,9,7,2};

        int arraySum = 0;
        for (int i : array) {
            arraySum += i;
        }
        // formula : n*(n+1)/2
        int expectedSum =  (10*(10 + 1))/2;

        int diff = expectedSum - arraySum;

        System.out.println("The missing number from the array is " + diff);



    }
}
