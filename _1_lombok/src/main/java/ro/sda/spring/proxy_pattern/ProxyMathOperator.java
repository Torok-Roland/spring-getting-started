package ro.sda.spring.proxy_pattern;

public class ProxyMathOperator extends MathOperator{
    MathOperator operator = new MathOperator();
    @Override
    public int add(int a, int b) {
        System.out.println("Before");
        try{
           return operator.add(a,b);
        } catch(RuntimeException e){
            System.out.println("After throwing");
        } finally {
            System.out.println("After");
        }
        return 0;
    }

}
