package be.vdab.stereoketen;

class Equalizer implements Apparaat{
    @Override
    public void start() {
        System.out.println("De equalizer staat aan.");
    }
    @Override
    public void stop() {
        System.out.println("De equalizer staat af.");
    }
}