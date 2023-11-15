package homework_nr_17.Account;

import lombok.Data;

import java.util.Random;

@Data
public class IBAN {
    // Account Number Generator
    private String CountryCode;
    private CurrencyList currencyCode;
    private String BankCode;
    private Account accountType;

    public IBAN (String countryCode,String bankCode) {
        this.CountryCode = countryCode;
        this.BankCode = bankCode;
    }



    private static String generate() {
        Random random = new Random();
        // Generate a random 16-digit account number
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            int digit = random.nextInt(10);
            accountNumber.append(digit);
        }
        return accountNumber.toString();
    }

    public String GenerateIban(String currency_code, String account_code){
        return (CountryCode + account_code + getBankCode () + generate () + currency_code);
    }
}
