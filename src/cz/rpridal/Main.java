package cz.rpridal;

public class Main {

    public static void main(String[] args) {
        String expression = "2*2*2/2/2*2";
                         //   4 + 2 -2 + 4
        Operation rootOperation = Calculator.parse(expression);
        System.out.println(rootOperation.getValue());
    }
}
