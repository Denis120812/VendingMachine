public class Main {

    public static void main(String[] args) {
        VendingMachine vMachine = new VendingMachineBottleOfWater();
        BottleOfWater product1 = new BottleOfWater(100, "Water", 0.5);
        BottleOfWater product2 = new BottleOfWater(130, "Tea", 0.7);
        BottleOfWater product3 = new BottleOfWater(180, "Cola", 0.5);

        vMachine.addProduct(product1);
        vMachine.addProduct(product2);
        vMachine.addProduct(product3);
        System.out.println(vMachine.getProduct("Tea").getName());



        }
    }

