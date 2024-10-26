package org.yassinmk.cafeshop.decorator;

import org.yassinmk.cafeshop.composant.Boisson;

public class CremeChantilly extends DecoratorBoisson{
    public CremeChantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " à la crème chantilly";
    }

    @Override
    public double cout() {
        return 2.5 + boisson.cout();
    }
}
