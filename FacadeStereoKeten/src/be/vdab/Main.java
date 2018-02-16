package be.vdab;

import be.vdab.stereoketen.Stereoketen;

public class Main {

    public static void main(String[] args) {
        Stereoketen keten = new Stereoketen();
        keten.start();
        keten.kiesCDSpeler();
        keten.kiesRadio();
        keten.stop();
        keten.start();
        keten.stop();
    }
}