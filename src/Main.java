import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PrintStream printf = System.out.printf("Hello and welcome!");
        // Fraction 1
        double numerateur1 = 1;
        double denominateur1 = 3;
        assert denominateur1 != 0 : "Le dénominateur ne peut pas être zéro.";
        // Fraction 2
        double numerateur2 = 5;
        double denominateur2 = 2;
        assert denominateur2 != 0 : "Le dénominateur ne peut pas être zéro.";

        Fraction fraction = new Fraction(numerateur1,denominateur1);

        System.out.printf(fraction.toString());




    }
}
