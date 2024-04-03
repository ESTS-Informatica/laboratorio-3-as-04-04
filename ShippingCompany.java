import java.util.ArrayList;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name) {
        this.name = name;
        this.inService = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transport> getInService() {
        return inService;
    }

    private Transport getTransportation(String id) {
        for (Transport transport : this) {
            if (transport.getId().equals(id)) {
                return transport;
            }
        }
        return null;
    }

    public void makeTransportation(String id, String origin, String destination, double price) {
        Transport transport = getTransportation(id);
        if (transport != null && transport.isAvailable()) {
            transport.setOrigin(origin);
            transport.setDestination(destination);
            transport.setPrice(price);
            transport.setAvailable(false);
            inService.add(transport);
            remove(transport);
        }
    }

    public void finalizeTransportation(String id) {
        Transport transport = null;
        for (Transport t : inService) {
            if (t.getId().equals(id)) {
                transport = t;
                break;
            }
        }
        if (transport != null) {
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            add(transport);
            inService.remove(transport);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company Name: ").append(name).append("\n");
        sb.append("Transport in Service:\n");
        for (Transport transport : inService) {
            sb.append(transport.toString()).append("\n");
        }
        sb.append("Transport in Company:\n");
        for (Transport transport : this) {
            sb.append(transport.toString()).append("\n");
        }
        return sb.toString();
    }
}
