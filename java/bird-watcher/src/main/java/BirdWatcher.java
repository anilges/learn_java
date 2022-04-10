import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) return 0;
        else {
            return birdsPerDay[birdsPerDay.length-1];
        }
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        int[] sorted = birdsPerDay;
        Arrays.sort(sorted);
        if (sorted[0] == 0) return true;
        else return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int num = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            num += birdsPerDay[i];
        }
        return num;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int bPD : birdsPerDay) {
            if (bPD >= 5) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
