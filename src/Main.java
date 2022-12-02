public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Car lada = new Car("Лада", "Гранта", 59.5599, "Бурый", "Хетчбэк", "автомат");
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 43.70, "Белый", null, "механика");
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 0, "Чёрный", "Хетчбэк", "автомат");
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 123.1234, null, null, null);
        System.out.println(kia);
        kia.startMoving();
        System.out.println();
        Bus paz3237 = new Bus("ПАЗ", "3237", 135.9, null);
        System.out.println(paz3237);
        Bus pazV = new Bus("ПАЗ", "Вектор", 90, "Серый");
        System.out.println(pazV);
        Bus neman = new Bus("Неман", "420211-10", 57.49, "Зеленый");
        System.out.println(neman);
        Bus anonim = new Bus(null, null, 0, "Чёрный");
        System.out.println(anonim);
        anonim.startMoving();
        anonim.finishMoving();
        System.out.println();
        Truck gazel = new Truck("Газель", "ГАЗ-3302", 120);
        System.out.println(gazel);
        Truck gazel2 = new Truck("Газель", "СемАР-3234", 140);
        System.out.println(gazel2);
        Truck gazel3 = new Truck("Газель", "Фермер", 120);
        System.out.println(gazel3);
        Truck gazel4 = new Truck("Газель", "Рута", 110);
        System.out.println(gazel4);
        gazel4.finishMoving();
//
//        neman.pitStop();
//        neman.maxSpeed();
//        neman.bestTime();
//        audi.pitStop();
//        gazel.maxSpeed();
//        kia.bestTime();
        System.out.println();
        System.out.println("Task 2.5.4");
        CategoryBDriver azazel = new CategoryBDriver("ТАА", true, 12, audi);
        System.out.println(azazel);
        azazel.stop();
        CategoryCDriver max = new CategoryCDriver("АМТ", true, 10, gazel4);
        System.out.println(max);
        CategoryDDriver dinislam = new CategoryDDriver("ГДА", true, 20, anonim);
        System.out.println(dinislam);
    }
}