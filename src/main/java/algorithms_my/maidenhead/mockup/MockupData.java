package algorithms_my.maidenhead.mockup;

public class MockupData {

    // Signal Hill, Cape Town - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=JF96eb
    Location getGridLocationA() {
        double longitude = 18.388544;
        double latitude = -33.934562;

        Location location = new Location(longitude,latitude);

        return location;
    }

    String getGridLocationA_Result() {
        return "JF96eb";
    }

    // My QTH - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=JO45sv
    Location getGridLocationB() {
        double longitude = 9.563663;
        double latitude = 55.887282;

        Location location = new Location(longitude,latitude);

        return location;
    }

    String getGridLocationB_Result() {
        return "JO45sv";
    }

    // VIA, center of E - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=JO45sv
    Location getGridLocationC() {
        double longitude = 9.8860909;
        double latitude = 55.8719648;

        Location location = new Location(longitude,latitude);

        return location;
    }

    String getGridLocationC_Result() {
        return "JO45wu";
    }

    // Qasigiannguit - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=GP48jt
    Location getGridLocationD() {
        double longitude = -51.1967887;
        double latitude = 68.8197614;

        Location location = new Location(longitude,latitude);

        return location;
    }

    String getGridLocationD_Result() {
        return "GP48jt";
    }

}
