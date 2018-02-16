package be.vdab.stereoketen;

class Radio implements Apparaat{
    @Override
    public void start() {
        System.out.println("De radio staat aan.");
    }
    @Override
    public void stop() {
        System.out.println("De radio staat af.");
    }
}