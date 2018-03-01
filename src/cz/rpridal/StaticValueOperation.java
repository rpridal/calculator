package cz.rpridal;

public class StaticValueOperation implements Operation {
    private final Integer value;

    public StaticValueOperation(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
