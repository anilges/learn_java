public class ElonsToyCar {
    int driven = 0;
    int battery = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + driven + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) return "Battery empty";
        else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if (battery == 0) return;
        else {
            driven += 20;
            battery -= 1;
        }
    }
}
