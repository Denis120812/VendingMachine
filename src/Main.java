public class Main {

    public static void main(String[] args) {
        HotDrink produkt1 = new HotDrink(50, "Coffee", 0.3, 75);
        HotDrink produkt2 = new HotDrink(27, "Tea", 0.5, 80);
        HotDrink produkt3 = new HotDrink(70, "Hot Chocolate", 0.5, 65);

        HotDrinkVendingMachine vMachine = new HotDrinkVendingMachine();
        vMachine.addProduct(produkt1);
        vMachine.addProduct(produkt2);
        vMachine.addProduct(produkt3);

        Product product1 = vMachine.getProduct("Coffee");
        Product product2 = vMachine.getProduct("Tea");
        Product product3 = vMachine.getProduct("Hot Chocolate");

        if (product1 != null) {
            System.out.println("Продукт: " + product1.getName() + ", цена: " + product1.getCost() +
                    ", объем: " + ((HotDrink) product1).getVolume() + ", температура: " + ((HotDrink) product1).getTemperature());
        } else {
            System.out.println("Продукт не найден");
        }

        if (product2 != null) {
            System.out.println("Продукт: " + product2.getName() + ", цена: " + product2.getCost() +
                    ", объем: " + ((HotDrink) product2).getVolume() + ", температура: " + ((HotDrink) product2).getTemperature());
        } else {
            System.out.println("Продукт не найден");
        }

        if (product3 != null) {
            System.out.println("Продукт: " + product3.getName() + ", цена: " + product3.getCost() +
                    ", объем: " + ((HotDrink) product3).getVolume() + ", температура: " + ((HotDrink) product3).getTemperature());
        } else {
            System.out.println("Продукт не найден");
        }


    }
}

