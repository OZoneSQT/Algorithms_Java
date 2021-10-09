package algorithms_my.maidenhead;

import algorithms_my.maidenhead.mockup.Location;

public class Main {
    private static GridAlgorithmInterface gridAlgorithmInterface = new GridAlgorithm();

    public static void main(String[] args) {
        getLocation_A();
        getLocation_B();
        getLocation_C();
        getLocation_D();
    }

    private static void getLocation_A() {
        // Signal Hill, Cape Town - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=JF96eb
        double longitude = 18.388544;
        double latitude = -33.934562;
        String expectedResult = "JF96eb";

        Location location = new Location(longitude, latitude);
        String result = gridAlgorithmInterface.getGridLocation(location);
        System.out.println("Lon: " + longitude + " Lat: " + latitude + " Is calculated to grid id: " + result +
                " Equal to the expected " + expectedResult + " = " + result.equals(expectedResult));
    }

    private static void getLocation_B() {
        // My QTH - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=JO45sv
        double longitude = 9.563663;
        double latitude = 55.887282;
        String expectedResult = "JO45sv";

        Location location = new Location(longitude, latitude);
        String result = gridAlgorithmInterface.getGridLocation(location);
        System.out.println("Lon: " + longitude + " Lat: " + latitude + " Is calculated to grid id: " + result +
                " Equal to the expected " + expectedResult + " = " + result.equals(expectedResult));
    }

    private static void getLocation_C() {
        // VIA, center of E - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=JO45sv
        double longitude = 9.8860909;
        double latitude = 55.8719648;
        String expectedResult = "JO45wu";

        Location location = new Location(longitude, latitude);
        String result = gridAlgorithmInterface.getGridLocation(location);
        System.out.println("Lon: " + longitude + " Lat: " + latitude + " Is calculated to grid id: " + result +
                " Equal to the expected " + expectedResult + " = " + result.equals(expectedResult));
    }

    private static void getLocation_D() {
        // Qasigiannguit - https://www.karhukoti.com/maidenhead-grid-square-locator/?grid=GP48jt
        double longitude = -51.1967887;
        double latitude = 68.8197614;
        String expectedResult = "GP48jt";

        Location location = new Location(longitude, latitude);
        String result = gridAlgorithmInterface.getGridLocation(location);
        System.out.println("Lon: " + longitude + " Lat: " + latitude + " Is calculated to grid id: " + result +
                " Equal to the expected " + expectedResult + " = " + result.equals(expectedResult));
    }

}