package homework_nr_17.Account;

public enum CurrencyList {
    MDL("498"),
    USD("840"),
    EUR("978"),
    GBP("826");

    private String CurrencyCode;

    CurrencyList (String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getCurrencyCode () {
        return CurrencyCode.toString ();
    }
}
