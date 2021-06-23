package ch.bbw.as.consolecalculator;

/**
 * Calculator
 *      - kann zwei Zahlen addieren
 *
 * @author Alex Schaub
 * @version 0.0.1
 */
public class Calculator {
    public int summe(int summand1, int summand2) {
        return summand1 + summand2;
    }

    protected String resultatSumme(int summand1, int summand2) {
        return "Die Summe ist: " + (summand1 + summand2) + ".";
    }

    String resultatSummeOhnePunkt(int summand1, int summand2) {
        return "Die Summe ist: " + (summand1 + summand2);
    }

    public int subtraktion(int value1, int value2) {
        return value1 - value2;
    }
}
