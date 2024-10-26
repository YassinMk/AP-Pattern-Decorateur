package org.yassinmk.cafeshop.decorator;

import org.yassinmk.cafeshop.composant.Boisson;

public class Cannelle extends DecoratorBoisson{
    public Cannelle(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " à la cannelle";
    }

    @Override
    public double cout() {
        return 2.5+boisson.cout();
    }
}
