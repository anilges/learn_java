class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int speed = 10;
    private int distance;
    private int victories;

    public void drive() {
        distance += speed;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.victories = numberofVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        return this.getNumberOfVictories() - other.getNumberOfVictories();
    }
}
