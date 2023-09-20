package homework_nr_6;

public class Date {
    private int date;
    private int month;
    private int year;


    public void displayDate () {
        if (getDate () == 0 || getMonth () == 0 || getYear () == 0) {
            System.out.println ("Invalid date! Please try again.");
        } else {
            System.out.println (
                    getDate () + "/" + getMonth () + "/" + getYear ()
            );
        }
    }

    public int getDate () {
        return date;
    }

    public void setDate (int date) {
        int y = getYear ();
        int maxDate = switch (getMonth ()) {
            case 2 -> (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) ? 29 : 28; // check by LeapYear
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 30;
        };

        if (date > 0 && date <= maxDate) {
            this.date = date;
        } else this.date = 0;
    }

    public int getMonth () {
        return month;
    }

    public void setMonth (int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else this.month = 0;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        if (year > 0 && year < 2100) {
            this.year = year;
        } else this.year = 0;
    }
}
