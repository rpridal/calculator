package cz.rpridal;

import java.util.Arrays;
import java.util.stream.Stream;

public class Calculator {
    public static class Tuple{
        private Operation operation1;
        private Operation operation2;

        public Tuple(Operation operation1, Operation operation2) {
            this.operation1 = operation1;
            this.operation2 = operation2;
        }

        public Operation getOperation1() {
            return operation1;
        }

        public Operation getOperation2() {
            return operation2;
        }
    }
    public static Operation parse(String expression){
        if(expression.contains("+")) {
            Tuple operations = getOperations(expression, "+");
            return new AdditionOperation(operations.getOperation1(), operations.getOperation2());
        }
        else if(expression.contains("-")){
            Tuple operations = getOperations(expression, "-");
            return new AdditionOperation(operations.getOperation1(), new NegativeOperation(operations.getOperation2()));
        }
        else if(expression.contains("*")){
            Tuple operations = getOperations(expression, "*");
            return new MultiplicationOperation(operations.getOperation1(), operations.getOperation2());
        }
        else if(expression.contains("/")){
            Tuple operations = getOperations(expression, "/");
            return new DivisionOperation(operations.getOperation1(), operations.getOperation2());
        }
        else
        {
            return new StaticValueOperation(Integer.valueOf(expression));
        }
    }
    private static Tuple getOperations(String expression, String sign){
        int index = expression.lastIndexOf(sign);
        String subexpression1 = expression.substring(0, index);
        Operation operation1 = parse(subexpression1);
        String subexpression2 = expression.substring(index + 1);
        Operation operation2 = parse(subexpression2);
        return new Tuple(operation1, operation2);
    }

}
