public class Truck extends Motor_Transport implements Competing{
    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик заканчивает движение.");
    }
    @Override
    public String toString() {
        return "Truk{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", engineCapacity ='" + String.format("%.2f", getEngineCapacity()) +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(("Грузовик " + this.getBrand() + " " +  this.getModel() + " делает пит-стоп (техническую оставку)."));
    }

    @Override
    public void maxSpeed() {
        System.out.println(("Грузовик " + this.getBrand() + " " +  this.getModel() + " достигает максимальной скорости."));
    }

    @Override
    public void bestTime() {
        System.out.println(("У грузовика " + this.getBrand() + " " +  this.getModel() + " лучшее время."));
    }
}
