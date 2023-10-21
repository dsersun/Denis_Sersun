package homework_nr_13;

public class Airplane {
    private String manufacturer;
    private String model;
    private int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws AirplaneExceptions{
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty.");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model cannot be null or empty.");
        }
        if (nrOfEngines == 0 || nrOfEngines % 2 != 0) {
            throw new InvalidNrOfEnginesException("Number of engines must be a non-zero even number.");
        }

        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfEngines = nrOfEngines;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }
}
