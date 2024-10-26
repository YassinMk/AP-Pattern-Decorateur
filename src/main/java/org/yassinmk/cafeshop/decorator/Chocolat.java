package org.yassinmk.cafeshop.decorator;

import org.yassinmk.cafeshop.composant.Boisson;

public class Chocolat extends  DecoratorBoisson{
    public Chocolat(Boisson boisson) {
        super(boisson);

    }

    @Override
    public String getDescription() {
        return super.getDescription() +" au chocolat";
    }

    @Override
    public double cout() {
        return 1+boisson.cout();
    }
}
