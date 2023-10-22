package homework_nr_12;

public class Main {
    public static void main(String[] args) {
        Months[] months = Months.values();
        for (Months m : months) {
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("Is GASOLINE a liquid fuel? " + FuelTypes.GASOLINE.isLiquidFuel());
        System.out.println("Is LPG a liquid fuel? " + FuelTypes.LPG.isLiquidFuel());
        System.out.println("******* List of fuel **********");
        FuelTypes[] fuel = FuelTypes.values();
        for (FuelTypes f : fuel) {
            System.out.println(f + " : " + (f.isLiquidFuel() ? "liquid fuel!": "non-liquid fuel!"));
        }

        System.out.println("----------------------------------------------------------");
        int number1 = 51;
        int number2 = -52;
        int number3 = 0;

        verify(number2);
        verify(number1);
        verify(number3);
    }

    public static void verify(int number){
        for (CheckInteger check : CheckInteger.values()) {
            boolean result = check.test(number);
            String description = check.getDescription();
            System.out.println(number + " is " + description + ": " + result);
        }
        System.out.println("<------------------------->");
    }
}
