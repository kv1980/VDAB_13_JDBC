package be.vdab;
public class MetBBQ extends ExtraService{
    public MetBBQ(Arrangement eenArrangement) {
        super(eenArrangement);
    }
    @Override
    public String getTaak() {
        return eenArrangement.getTaak()+"- plaats een BBQ bij de bungalow\n";
    }
}