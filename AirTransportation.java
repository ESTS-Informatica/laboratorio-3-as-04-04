public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(4.0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getNumberOfContainers() {
        return this.numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        if (numberOfContainers >= 0) {
            this.numberOfContainers = numberOfContainers;
        }
    }

    @Override
    public String getTransportType() {
        return "Transporte Aéreo";
    }
}