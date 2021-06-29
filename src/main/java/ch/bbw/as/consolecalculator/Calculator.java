package ch.bbw.as.consolecalculator;

/**
 * Calculator
 *      - kann zwei Zahlen addieren
 *      - kann zwei Zahlen subtrahieren
 *
 * @author Alex Schaub
 * @version 0.1
 */
public class Calculator {
    public int summe(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public int summeMitPrivate(int summand1, int summand2) {
        int summe = summePrivate(summand1, summand2);
        return summe;
    }

    private int summePrivate(int summand1, int summand2) {
        return summand1 + summand2;
    }

    protected String resultatSumme(int summand1, int summand2) {
        return "Die Summe ist: " + (summand1 + summand2) + ".";
    }

    String resultatSummeOhnePunkt(int summand1, int summand2) {
        return "Die Summe ist: " + (summand1 + summand2);
    }
    public int differenz(int minued, int subtrahend) {
        return minued - subtrahend;
    }

    public int division(int dividend, int divisor) {
        return dividend / divisor;
    }
}
