import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> rankings = new ArrayList<ProductionRemoteControlCar>();
        rankings.add(prc1);
        rankings.add(prc2);

        Collections.sort(rankings);

        return rankings;
    }
}
