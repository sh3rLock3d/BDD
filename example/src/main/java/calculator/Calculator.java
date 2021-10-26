package calculator;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public double press(int a, String opt){
        if(opt.equals("rvs")){
            return 1/(double)a;
        } else {
            return Math.sqrt(a);
        }
    }
}
