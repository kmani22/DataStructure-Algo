public class GCD {
    
    public static void main(String[] args) {

        GCD g = new GCD();
        int result = g.calcuateGCD(8, 12);
        System.out.println(result);
        
    }

    public int calcuateGCD(int a , int b) {
        
        if(b<0 || a<0){
            return -1;
        }

        if (b == 0){
            return a;
        }

        return calcuateGCD(b, a%b);
        
    }
}
