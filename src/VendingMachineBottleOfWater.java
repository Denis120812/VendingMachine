import java.util.List;
import java.util.ArrayList;

public class VendingMachineBottleOfWater implements VendingMachine {
    private List<BottleOfWater> listDrink;

    public VendingMachineBottleOfWater() {
        listDrink = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof BottleOfWater) {
            listDrink.add((BottleOfWater) product);
        }
    }

    @Override
    public void initProducts(List<Product> listDrink) {
        this.listDrink = new ArrayList<>();
        for (Product product : listDrink) {
            if (product instanceof BottleOfWater) {
                this.listDrink.add((BottleOfWater) product);
            }
        }
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWater product : listDrink) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume, int temperature) {
        for (BottleOfWater product : listDrink) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }
}
