public class DecimalToBinary {
    

    public static void main(String[] args) {

        DecimalToBinary d = new DecimalToBinary();
        d.PrintDecimalToBinary(10);
        
    }

    public void PrintDecimalToBinary(int number) {

        if(number <0 )  return;

        if(number == 0){
            return;
        }
        PrintDecimalToBinary(number /2);
        System.out.println(number % 2);
        
    }
}
