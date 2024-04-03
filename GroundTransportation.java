public class GroundTransportation extends Transport {
    private String licensePlate;

    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
        setFees(0.03);
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if (licensePlate != null) {
            this.licensePlate = licensePlate;
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
    
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
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
        sb.append(String.format("%15s: %s\n", "Matrícula", getLicensePlate()));
        return sb.toString();
    }
}