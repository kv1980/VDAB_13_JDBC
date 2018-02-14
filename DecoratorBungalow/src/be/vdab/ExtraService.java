package be.vdab;
public abstract class ExtraService implements Arrangement {
    protected final Arrangement eenArrangement;
    public ExtraService(Arrangement eenArrangement) {
        this.eenArrangement = eenArrangement;
    }
}