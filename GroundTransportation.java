public class GroundTransportation extends Transport {
    private String licensePlate;

    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
        setFees(3.0);
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if (licensePlate != null) {
            this.licensePlate = licensePlate;
        }
    }

    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
}