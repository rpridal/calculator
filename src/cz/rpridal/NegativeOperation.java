package cz.rpridal;

public class NegativeOperation implements Operation {
    private final Operation operation;

    public NegativeOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public Integer getValue() {
        return -operation.getValue();
    }
}
