import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fraction fraction = new Fraction();
        System.out.printf(fraction.toString());
        Fraction fraction1 = new Fraction(1,2); //Constructeur 1 (numerateur et denominateur)
        Fraction fraction2 = new Fraction(3); // Constructeur 2 (numerateur)
        Fraction fraction3 = new Fraction(); // Constructeur 3 (sans arguments)
        // Assertions pour tester les constructeurs (avec toString)
        assert fraction1.toString().equals(fraction2.toString()):"erreur du constructeur";
        assert fraction2.toString().equals(fraction3.toString()):"erreur du constructeur";
        //Constantes
        final Fraction  fraction4 = new Fraction(0,1);
        final Fraction  fraction5 = new Fraction(1,1);
        System.out.printf("\n"+fraction1.getNumerateur()+"\n"); // utiliser le getter pour acceder au numerateur
        System.out.printf(""+fraction1.getDenominateur()); // utiliser le getter pour acceder au denominateur
        assert fraction5.doubleValue()== 1.0:"La valeur n'a pas été convertie correctement";
        assert fraction4.doubleValue()== 0.0:"La valeur n'a pas été convertie correctement";
        System.out.printf("\n"+fraction5.doubleValue()+"\n"); // utiliser la méthode doublevalue pour convertir de la valeur de la fraction
        System.out.printf("\n"+fraction4.doubleValue()+"\n"); // utiliser la méthode doublevalue pour convertir de la valeur de la fraction
        assert fraction5.add(fraction4)==1.0:"L'addition est incorrecte";
        System.out.printf("\n"+fraction5.add(fraction4)+"\n"); // utiliser la méthode add pour faire la somme entre l'ancienne et la nouvelle fraction

        assert fraction5.equals(fraction4):"Les fractions ne sont pas égales";
        System.out.printf("\n"+fraction5.equals(fraction4)+"\n");

        assert fraction5.comparer(fraction4)==0; // Zero quand la fraction actuelle est plus grande
        System.out.printf("\n"+fraction5.comparer(fraction4)+"\n");

        //VERIFICATION
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;




    }
}
