package homework_nr_17.Account;

public enum AccountType {
    CARD("58"), // Cont de card
    DEPOSIT("79"), // Cont curent
    SAVINGS("63"); // Cont de economii ;


    private String AccountCode;

    AccountType (String accountCode) {
        AccountCode = accountCode;
    }

    public String getAccountCode () {
        return AccountCode;
    }
}
