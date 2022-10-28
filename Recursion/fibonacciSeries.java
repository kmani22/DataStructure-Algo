

public class fibonacciSeries {

    public static void main(String[] args) {
        fibonacciSeries f = new fibonacciSeries();
        int result = f.fibonacci(4);
        System.out.println(result);

    }

    public int fibonacci(int number) {

        if(number < 0)
            return -1;

        if(number== 0 || number == 1){
            return number;
        }

        return fibonacci(number - 1)  + fibonacci(number - 2);
        
    }
    
}
