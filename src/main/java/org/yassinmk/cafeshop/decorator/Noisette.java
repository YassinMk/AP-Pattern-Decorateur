package org.yassinmk.cafeshop.decorator;

import org.yassinmk.cafeshop.composant.Boisson;

public class Noisette extends DecoratorBoisson{
    public Noisette(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " à la noisette";
    }


    @Override
    public double cout() {
        return 4+boisson.cout();
    }
}
