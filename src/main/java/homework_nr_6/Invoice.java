package homework_nr_6;
// import for acces current date/time info in printInvoice() method

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Invoice {
    private String modelOfGoods;
    private String descriptionOfGoods;
    private int quantityOfGoods;
    private double unitPrice;

    public Invoice (String modelOfGoods, String descriptionOfGoods, int quantityOfGoods, double unitPrice) {
        this.modelOfGoods = modelOfGoods;
        this.descriptionOfGoods = descriptionOfGoods;
        this.quantityOfGoods = quantityOfGoods;
        this.unitPrice = unitPrice;
    }

    public double getAmount () {
        if (getQuantityOfGoods () < 0) {
            setQuantityOfGoods (0);
        }
        if (getUnitPrice () < 0) {
            setUnitPrice (0.0);
        }

        return getUnitPrice () * getQuantityOfGoods ();
    }

    public String getModelOfGoods () {
        return modelOfGoods;
    }

    public void setModelOfGoods (String modelOfGoods) {
        this.modelOfGoods = modelOfGoods;
    }

    public String getDescriptionOfGoods () {
        return descriptionOfGoods;
    }

    public void setDescriptionOfGoods (String descriptionOfGoods) {
        this.descriptionOfGoods = descriptionOfGoods;
    }

    public int getQuantityOfGoods () {
        return quantityOfGoods;
    }

    public void setQuantityOfGoods (int quantityOfGoods) {
        this.quantityOfGoods = quantityOfGoods;
    }

    public double getUnitPrice () {
        return unitPrice;
    }

    public void setUnitPrice (double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // this method print information regarding purchases info on the terminal.
    public void printInvoice () {
        LocalDateTime currentDateTime = LocalDateTime.now ();
        DateTimeFormatter format = DateTimeFormatter.ofPattern ("MM/dd/YYYY HH:mm a", Locale.US);
        String data = currentDateTime.format (format);
        // sett color
        String reset = "\u001B[0m"; // Reset to default color
        String red = "\u001B[31m";
        String green = "\u001B[32m";

        System.out.println (
                "+-------------------------------------------------------------------+\n" +
                        "| Your purchase for: " + data + " is\n" +
                        "| Product name: " + getModelOfGoods () + "\n" +
                        "| Description: " + getDescriptionOfGoods () + "\n" +
                        "| Unit price: $" + getUnitPrice () + "\n" +
                        "+-------------------------------------------------------------------+\n" +
                        "| Amount to be paid: " + green + "$" + getAmount ());
        System.out.println (red + "Congratulations on a successful purchases!" + reset + "\n" +
                "+-------------------------------------------------------------------+\n");
    }
}
