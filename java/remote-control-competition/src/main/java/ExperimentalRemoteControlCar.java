public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int speed = 20;
    private int distance;

    public void drive() {
        distance += speed;
    }

    public int getDistanceTravelled() {
        return distance;
    }
}
