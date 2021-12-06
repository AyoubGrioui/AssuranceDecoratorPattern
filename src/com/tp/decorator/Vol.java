package com.tp.decorator;
/**
 *   @Author Grioui Ayoub
 */
public class Vol extends AssuranceDecorator{
    public Vol(Assurance a) {
        super(a);
    }

    @Override
    public int cost(){
        return super.cost() + 5000;
    }

}
