
public class factorial {

    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println(f.fact(4));
        

    }

    public int fact(int number) {
        if(number < 0)
            return - 1;
        
        if (number == 0 || number == 1)
            return 1;
        
        return number * fact(number -1);
        
    }
    
}