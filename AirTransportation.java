public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;

    public AirTransportation() {
        super();
        this.name = "";
        this.numberOfContainers = 0;
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