package calculator.enums;

/**
 * <p>{@code Operator} enumeration allows a {@code Calculator} class to calculate using variable operators.</p>
 *
 * @author Seungmin Yang
 */
public enum Operator {
    ADD("+", '+'),
    SUB("-", '-'),
    MUL("×", '*'),
    DIV("÷", '/'),
    POW("^", '^'),
    SQRT("\u221A", 'r'),
    FACT("!", '!'),
    SIN("sin", 's'),
    COS("cos", 'c'),
    TAN("tan", 't'),
    ASIN("sin\u207b\u00b9", 'S'),
    ACOS("cos\u207b\u00b9", 'C'),
    ATAN("tan\u207b\u00b9", 'T'),
    LOG("log", 'l'),
    LN("ln", 'L'),
    PER("%", '%');

    private String display;
    private char delimiter;

    Operator(String display, char delimiter) {
        this.display = display;
        this.delimiter = delimiter;
    }

    public String getDisplayString() {
        return display;
    }

    public char getDelimiter() {
        return delimiter;
    }
}
