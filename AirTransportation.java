public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(0.04);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getFees(){
        return fees;
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
    
    @Override
    public double getPriceWithFees(){
        double priceWithFees = 0.0;
        priceWithFees = price - (price * fees);
        return priceWithFees;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", getName()));
        sb.append(String.format("%15s: %d\n", "Número de Containers", getNumberOfContainers()));
        return sb.toString();
    }
}