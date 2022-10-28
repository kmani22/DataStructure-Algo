public class PowerOfNumber {
    

    public static void main(String[] args) {

        PowerOfNumber p = new PowerOfNumber();
        int result = p.CalculatePowerOfNumber(2, 10);
        System.out.println(result);

    }

    public int CalculatePowerOfNumber(int number, int power) {

        if(power < 0){
            return -1;
        }

        if(power == 1 || power== 0){
            return number;
        }

        return number * CalculatePowerOfNumber(number, power -1);
        
    }
    
}
