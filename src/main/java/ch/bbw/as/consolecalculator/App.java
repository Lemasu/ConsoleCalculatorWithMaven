package ch.bbw.as.consolecalculator;

/**
 * Console Calculator App
 * @author Alex Schaub
 * @version 0.2
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        valueA = 10;
        valueB = 20;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
        System.out.println(calculator.resultatSumme(valueA, valueB));
        System.out.println(calculator.resultatSummeOhnePunkt(valueA, valueB));
        System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.differenz(valueA, valueB));
        try {
            System.out.println("Quotient " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
        } catch (ArithmeticException e) {
            System.out.println("Eine Division durch 0 ist nicht erlaubt.");
        }
        System.out.println("Potenzwert " + 2 + "^" + 3 + " = " + calculator.potenzwert(2, 3));
    }
}
