package org.yassinmk.cafeshop.composant;

public class Ristretto extends Boisson {
    public Ristretto() {
        description = "Ristreto";
    }
    @Override
    public double cout() {
        return 3.5;
    }
}
