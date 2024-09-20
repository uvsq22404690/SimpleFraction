public class Fraction extends java.lang.Number{
    private int numerateur;
    private int denominateur;
    // Multiplication de fractions
    // Constructeur
    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");

        }
        else {
            this.numerateur = numerateur;
            this.denominateur = denominateur;

        }
    }
    
    public Fraction(int numerateur) {
        this.numerateur=numerateur;
        this.denominateur= 1;
        
    }

    public Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }
    public double doubleValue() {
        return (double) this.numerateur / this.denominateur;
    }

    public int getDenominateur() {
        return this.denominateur;
    }
    public int getNumerateur(){
        return this.numerateur;
    }


    public double add(Fraction fraction){
        double fraction_courrente = this.doubleValue();
        double fraction_parametre = fraction.doubleValue();
        return fraction_courrente+fraction_parametre;
    }

    public int comparer(Fraction fraction) {

        int produit1 = this.numerateur * fraction.denominateur;
        int produit2 = fraction.numerateur * this.denominateur;
        if (produit1 > produit2) {
            return 0;  // Cette fraction est plus grande
        } else if (produit1 < produit2) {
            return 1; // Cette fraction est plus petite
        } else {
            return 2;  // Les fractions sont égales
        }
    }



    @Override
    public String toString() {
        return "Je suis une fraction.";
    }

    public boolean equals(Fraction fraction ) {
        return this.doubleValue()== fraction.doubleValue();
    }
    public int intValue(){
        return this.numerateur / this.denominateur;
    }
    public long longValue(){
        return (long) this.numerateur / this.denominateur;
    }
    public float floatValue(){
        return (float) this.numerateur / this.denominateur;
    }
}

