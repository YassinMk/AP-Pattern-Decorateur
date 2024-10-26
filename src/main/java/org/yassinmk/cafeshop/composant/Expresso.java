package org.yassinmk.cafeshop.composant;

import org.yassinmk.cafeshop.composant.Boisson;

public class Expresso extends Boisson {

    public Expresso () {
        description = "Expresso";
    }
    @Override
    public double cout() {
        return 5;
    }
}
