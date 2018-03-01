package cz.rpridal;

public class MultiplicationOperation implements Operation {
    private final Operation operation1;
    private final Operation operation2;

    public MultiplicationOperation(Operation operation1, Operation operation2) {
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    @Override
    public Integer getValue() {
        return operation1.getValue() * operation2.getValue();
    }
}
