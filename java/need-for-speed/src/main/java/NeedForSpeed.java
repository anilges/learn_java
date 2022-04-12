class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    private int distance;
    private int battery;

    // TODO: define the constructor for the 'NeedForSpeed' class
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        battery = 100;
    }

    public boolean batteryDrained() {
        return (battery == 0);
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            distance += this.speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        var car = new NeedForSpeed(50, 4);
        return car;
    }
}

class RaceTrack {
    public int distance;

    // TODO: define the constructor for the 'RaceTrack' class
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        return ((100 / car.batteryDrain) * car.speed >= this.distance);
    }
}
