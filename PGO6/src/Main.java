public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", "Passat", 2021, 5000, 250);
        Truck truck = new Truck("Scania", "R380", 2019, 10000, 150, 8);

        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " mil na galon");
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " mil na galon");
    }
}
