package calculator.list;

import calculator.enums.Operator;

import java.util.ArrayList;
import java.util.LinkedList;

public class CalculatorList extends LinkedList<Object> {
    private static final long serialVersionUID = 3182418425156988317L;

    @Override
    public boolean add(Object o) {
        if(o instanceof Number || o instanceof Operator) {
            return super.add(o);
        } else {
            throw new IllegalArgumentException("CalculatorList only can add a Number or Operator object.");
        }
    }

    @Override
    public void push(Object o) {
        if(o instanceof Number || o instanceof Operator) {
            super.push(o);
        } else {
            throw new IllegalArgumentException("CalculatorList only can add a Number or Operator object.");
        }
    }
}
