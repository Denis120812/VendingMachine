public class HotDrink extends BottleOfWater{
    private int temperature;

    public HotDrink(int cost, String name, double volume, int temperature){
        super(cost, name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

