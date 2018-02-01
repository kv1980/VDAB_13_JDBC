package be.vdab.stereoketen;

class Versterker implements Apparaat{
    @Override
    public void start() {
        System.out.println("De versterker staat aan.");
    }
    @Override
    public void stop() {
        System.out.println("De versterker staat af.");
    }
}