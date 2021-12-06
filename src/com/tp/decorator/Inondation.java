package com.tp.decorator;
/*
 *   @Author Grioui Ayoub
 */
public class Inondation extends AssuranceDecorator {

    public Inondation(Assurance a) {
        super(a);
    }

    @Override
    public int cost() {
        return super.cost() + 2000;
    }
}
