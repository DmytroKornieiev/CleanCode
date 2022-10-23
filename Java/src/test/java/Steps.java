import Planes.ExperimentalPlane;
import Planes.MilitaryPlane;
import Planes.Plane;
import models.ClassificationLevel;
import models.MilitaryType;

import java.util.List;

public class Steps {

    static Airport airport = new Airport(Airport.planesForTest);

    public boolean isPlanesHaveTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if ((militaryPlane.getType() == MilitaryType.TRANSPORT)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNextPlaneMaxLoadCapacityHigherThanCurrent() {
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if (currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity()) {
                return false;
            }
        }
        return true;
    }

    public boolean isMilitaryPlanesHasBomber() {
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
            if ((militaryPlane.getType() == MilitaryType.BOMBER)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        for (ExperimentalPlane experimentalPlane : experimentalPlanes) {
            if (experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED) {
                return true;
            }
        }
        return false;
    }

}
