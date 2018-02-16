package be.vdab.stereoketen;

class CDspeler implements Apparaat{
    @Override
    public void start() {
        System.out.println("De CD-speler staat aan.");
    }
    @Override
    public void stop() {
        System.out.println("De CD-speler staat af.");
    }
}