package algorithms_my.maidenhead;

import algorithms_my.maidenhead.mockup.Location;

public interface GridAlgorithmInterface {

    /**
     * Get grid location in maidenhead-grid-square-locator-format
     * @param location
     * @return
     */
    String getGridLocation(Location location);

}
