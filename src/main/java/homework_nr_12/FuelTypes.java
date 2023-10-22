package homework_nr_12;

enum FuelTypes {
    GASOLINE(true),
    DIESEL(true),
    LPG(false),
    CNG(false);

    private final boolean isLiquidFuel;
    FuelTypes(boolean isLiquidFuel) {
        this.isLiquidFuel = isLiquidFuel;
    }

    public boolean isLiquidFuel(){
        return isLiquidFuel;
    }
}
