package org.yassinmk.cafeshop.decorator;

import org.yassinmk.cafeshop.composant.Boisson;

public class Vanille extends  DecoratorBoisson{

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " à la vanille";
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }
}
