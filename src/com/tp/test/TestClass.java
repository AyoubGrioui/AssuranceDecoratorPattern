package com.tp.test;

import com.tp.decorator.Assurance;
import com.tp.decorator.*;

import java.util.logging.Logger;
/**
 *   @Author Grioui Ayoub
 */
public class TestClass {

    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        Assurance assurance = new ResponsbiliteCivile();
        log.info("cost = " + assurance.cost());
        assurance = new DommageCollision(assurance);
        log.info("cost = " + assurance.cost());
        assurance = new Vol(assurance);
        log.info("cost = " + assurance.cost());
        assurance = new Incendie(assurance);
        log.info("cost = " + assurance.cost());
        assurance = new Inondation(assurance);
        log.info("cost = " + assurance.cost());

    }
}
