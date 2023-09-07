package asdf;

public class Main {
    public static double midElement(double a, double b,double c) throws Exception{
        if(a==b || b==c || c==a){
            throw new Exception("Element are not distinct");
        }
        double x = Math.max(Math.max(a,b), c);
        double y = Math.min(Math.max(a,b), c);
        return a+b+c-x-y;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(midElement(67.5,200.0, 100.7));
    }
    
}
