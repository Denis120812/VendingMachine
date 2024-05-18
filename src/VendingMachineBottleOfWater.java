import java.util.List;
import java.util.ArrayList;

public class VendingMachineBottleOfWater implements VendingMachine {

    private List<BottleOfWater>listDrink;
    public VendingMachineBottleOfWater(){
        listDrink = new ArrayList<>();
    }

    @Override
    public void addProduct(BottleOfWater product){
        listDrink.add(product);
    }
    @Override
    public void initProd(List<BottleOfWater>listProd){
        this.listDrink = listProd;
    }
    @Override
    public BottleOfWater getProduct(String name){
        for (BottleOfWater product : listDrink)
            if (product.getName().equals(name))
                return product;
        return null;
    }

}
