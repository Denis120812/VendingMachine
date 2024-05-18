public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater (int cost, String name, double volume){
        super(cost,name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
