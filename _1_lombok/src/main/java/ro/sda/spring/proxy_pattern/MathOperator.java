package ro.sda.spring.proxy_pattern;

public class MathOperator {
    public int add(int a, int b) {

        if ((a + b) % 2 == 0) {
            throw new RuntimeException("Exception occurred");
        }
        return a + b;
    }

}
