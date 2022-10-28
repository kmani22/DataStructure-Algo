public class FindANumberInArray {

    public static void main(String[] args) {
        
        int result = FindNumberInArray(new int[] {1,523, 53,46, 22,}, 22);
        System.out.println(result);

    }

    public static int FindNumberInArray(int array[], int target) {

        for (int i = 0; i < array.length; i++) {
            
            if(array[i] == target) return i;
        }

        return -1;
        
    }
}
