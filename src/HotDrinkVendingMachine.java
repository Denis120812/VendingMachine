import java.util.List;
import java.util.ArrayList;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> hotDrinkList;  // Поле объявлено как private

    public HotDrinkVendingMachine() {
        this.hotDrinkList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        hotDrinkList.add(product);
    }

    @Override
    public void initProducts(List<Product> drink) {  // Исправлено имя метода
        this.hotDrinkList = drink;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinkList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : hotDrinkList) {
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
