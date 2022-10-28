public class ArrayIsUnique {

    public static void main(String[] args) {
        
        boolean result = isUnique(new int[] {20,10,30,50, 40,10});
        System.out.println(result);
    }

    public static boolean isUnique(int array[]) {

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if(currentElement == array[j]) return false;
            }
        }

        return true;
    }
}
