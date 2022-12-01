public class Bus extends Motor_Transport{
    private String color;
    @Override
    public void startMoving() {
        System.out.println(color + " автобус начинает движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println(color + " автобус заканчивает движение.");
    }

    public Bus(String brand, String model, double engineCapacity, String color) {
        super(brand, model, engineCapacity);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Красный";
        } else {
            this.color = color;
        }
    }
    @Override
    public String toString() {
        return "Bus{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", color ='" + color + '\'' +
                ", engineCapacity ='" + String.format("%.2f", getEngineCapacity()) +
                '}';
    }
}
