package eiland;

public enum InwonerFactory {
    INSTANCE;

    public Inwoner maakInwoner(String bestandsregel) {
        char soortInwoner = bestandsregel.charAt(0);
        String naamInwoner = bestandsregel.substring(bestandsregel.indexOf(",") + 1);
        switch (soortInwoner) {
            case 'V':
                return new Vogel(naamInwoner);
            case 'Z':
                return new Zoogdier(naamInwoner);
            default:
                throw new IllegalArgumentException();
        }
    }
}
