import org.testng.Assert;
import org.testng.annotations.Test;
import Planes.PassengerPlane;

public class AirportTest {
    private static Steps steps = new Steps();
    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void testIsPlanesHaveTransportMilitaryPlanes() {
        Assert.assertTrue(steps.isPlanesHaveTransportMilitaryPlanes());
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Assert.assertEquals(planeWithMaxPassengerCapacity, Steps.airport.getPassengerPlaneWithMaxPassengersCapacity());
    }

    @Test
    public void testIsNextPlaneMaxLoadCapacityHigherThanCurrent() {
        Steps.airport.sortByMaxLoadCapacity();
        Assert.assertTrue(steps.isNextPlaneMaxLoadCapacityHigherThanCurrent());
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Assert.assertTrue(steps.isMilitaryPlanesHasBomber());
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {
        Assert.assertFalse(steps.isExperimentalPlanesHasClassificationLevelHigherThanUnclassified());
    }
}
