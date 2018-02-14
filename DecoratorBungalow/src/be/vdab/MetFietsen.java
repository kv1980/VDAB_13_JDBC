package be.vdab;
public class MetFietsen extends ExtraService{
    public MetFietsen(Arrangement eenArrangement) {
        super(eenArrangement);
    }
    @Override
    public String getTaak() {
        return eenArrangement.getTaak()+"- plaats fietsen bij de bungalow\n";
    }
}