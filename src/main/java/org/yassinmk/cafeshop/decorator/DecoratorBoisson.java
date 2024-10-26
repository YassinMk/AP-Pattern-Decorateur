package org.yassinmk.cafeshop.decorator;

import org.yassinmk.cafeshop.composant.Boisson;

public  abstract  class DecoratorBoisson extends Boisson {
    protected Boisson boisson;

    public  DecoratorBoisson(Boisson boisson){
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription(); // Call the base description
    }


}
