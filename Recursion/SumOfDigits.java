/**
 * SumOfDigits
 */
public class SumOfDigits {

    
    public static void main(String[] args) {

        SumOfDigits s = new SumOfDigits();
        int result = s.SumOfDigitsOfPositiveNumber(111);
        System.out.println(result);
    }

    public int SumOfDigitsOfPositiveNumber(int number) {

        if( number == 0 || number < 0){
            return 0;
        }

        return number % 10 + SumOfDigitsOfPositiveNumber(number / 10);
        
    }
}