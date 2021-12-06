package com.tp.decorator;
/**
 *   @Author Grioui Ayoub
 */
public class DommageCollision extends AssuranceDecorator {

    public DommageCollision(Assurance a) {
        super(a);
    }

    @Override
    public int cost() {
        return super.cost() + 2500;
    }
}
