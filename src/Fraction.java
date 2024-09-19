public class Fraction {
    private double numerator;
    private double denominator;
    // Multiplication de fractions
    // Constructeur
    public Fraction(double numerateur, double denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");

        }
        else {
            this.numerator = numerateur;
            this.denominator = denominateur;

        }
    }

    public  double multiply (double numerateur2, double denominateur2){
        double fraction1 = this.numerator/this.denominator;
        double fraction2 = numerateur2/denominateur2;
        return fraction1*fraction2;
    }


    public double addition(double numerateur2, double denominateur2){
        double fraction1 = this.numerator/this.denominator;
        double fraction2 = numerateur2/denominateur2;
        return fraction1+fraction2;

    }

    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}
