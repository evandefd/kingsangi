package calculator.list;

import calculator.enums.Operator;

import java.util.ArrayList;

public class CalculatorList extends ArrayList<Object> {
    @Override
    public boolean add(Object o) {
        if(o instanceof Number || o instanceof Operator) {
            return super.add(o);
        } else {
            throw new IllegalArgumentException("CalculatorList only can add a Number or Operator object.");
        }
    }
}
