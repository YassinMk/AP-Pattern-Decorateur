package org.yassinmk.cafeshop.decorator;

import org.yassinmk.cafeshop.composant.Boisson;

public class Caramel extends DecoratorBoisson{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" au caramel";
    }


    @Override
    public double cout() {
        return 2+boisson.cout();
    }
}
