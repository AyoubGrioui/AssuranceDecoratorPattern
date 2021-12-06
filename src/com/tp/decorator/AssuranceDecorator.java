package com.tp.decorator;
/**
 *   @Author Grioui Ayoub
 */
public abstract class AssuranceDecorator  implements Assurance{
    protected Assurance assurance;

    public AssuranceDecorator(Assurance a) {
        this.assurance =a;
    }

    public int cost(){
        return assurance.cost();
    }
}
