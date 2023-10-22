package homework_nr_13;

public class Main {
    public static void main(String[] args) throws AirplaneExceptions {
        try {
            System.out.println("Creating Airplane objects using the method createAirplaneLBYL");
            Airplane airplane1 = createAirplaneLBYL("Boeing", "747", 4);
            System.out.println("Airplane 1 created!");
            Airplane airplane2 = createAirplaneLBYL("", "737", 2);
            System.out.println("Airplane 2 created!");
        } catch (AirplaneExceptions e) {
            System.out.println("Error creating airplane: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Creating Airplane objects using the method createAirplaneEAFP");
            Airplane airplane3 = createAirplaneEAFP("Airbus", "A380", 4);
            System.out.println("Airplane 3 created!");
            Airplane airplane4 = createAirplaneEAFP("Embraer", null, 3); // Invalid model
            System.out.println("Airplane 4 created!");
        } catch (AirplaneExceptions e) {
            System.out.println("Error creating airplane: " + e.getMessage());
        }
}


    // Method for creating an Airplane object using LBYL
    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws AirplaneExceptions {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty.");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model cannot be null or empty.");
        }
        if (nrOfEngines == 0 || nrOfEngines % 2 != 0) {
            throw new InvalidNrOfEnginesException("Number of engines must be a non-zero even number.");
        }
        return new Airplane(manufacturer, model, nrOfEngines);
    }


    // Method for creating an Airplane object using EAFP
    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) throws AirplaneExceptions {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (AirplaneExceptions e) {
            throw e;
        }
    }
}
