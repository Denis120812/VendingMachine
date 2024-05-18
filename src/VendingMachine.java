import java.util.List;

public interface VendingMachine {
    void addProduct(Product product);
    void initProducts(List<Product> listProd);
    Product getProduct(String name);
    Product getProduct(String name, double volume, int temperature);
}
