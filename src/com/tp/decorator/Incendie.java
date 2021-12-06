package com.tp.decorator;
/**
 *   @Author Grioui Ayoub
 */
public class Incendie extends AssuranceDecorator{
    public Incendie(Assurance a) {
        super(a);
    }

    @Override
    public int cost() {
        return super.cost() + 1500;
    }
}
