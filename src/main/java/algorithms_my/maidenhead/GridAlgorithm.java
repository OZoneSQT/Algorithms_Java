package algorithms_my.maidenhead;

import algorithms_my.maidenhead.gridcalc.*;
import algorithms_my.maidenhead.mockup.Location;

// https://en.wikipedia.org/wiki/Maidenhead_Locator_System
public class GridAlgorithm implements GridAlgorithmInterface {
    private double longitude, latitude;
    private int longitudeField, latitudeField, longitudeSquare, latitudeSquare, longitudeSubSquare, latitudeSubSquare;
    private Field field;
    private Square square;
    private SubSquare subSquare;
    private MaidenheadLongitude maidenheadLongitude;
    private MaidenheadLatitude maidenheadLatitude;

    public GridAlgorithm() {
        field = new Field();
        square = new Square();
        subSquare = new SubSquare();
        maidenheadLongitude = new MaidenheadLongitude();
        maidenheadLatitude = new MaidenheadLatitude();
    }

    public String getGridLocation(Location location) {
        this.longitude = location.getLongitude();
        this.latitude = location.getLatitude();
        parseLocation();

        return getGridSquares();
    }

    // Test method for, muck up test of location
    public String getGridLocationTestMethod(Location muckUpLocation) {
        this.longitude = muckUpLocation.getLongitude();
        this.latitude = muckUpLocation.getLatitude();
        parseLocation();

        System.out.print(" ( ( ( longitude + 180 ) % 20 )  & ");
        System.out.print(" (int) ( longitude + 180 ) / 20 -> ");
        System.out.println(" Value of longitudeField: " + longitudeField);

        System.out.print(" ( ( latitude + 90 ) % 10 )  & ");
        System.out.print(" (int) ( latitude + 90 ) / 10  -> ");
        System.out.println(" Value of latitudeField: " + latitudeField);

        System.out.print(" ( ( longitudeFieldRemainder % 2 )  & ");
        System.out.print(" ( (int) ( longitudeFieldRemainder / 2 )  -> ");
        System.out.println(" Value of longitudeSquare: " + longitudeSquare);

        System.out.print(" ( ( latitudeFieldRemainder % 1 )  & ");
        System.out.print(" ( (int) ( latitudeFieldRemainder / 1 )  -> ");
        System.out.println(" Value of latitudeSquare: " + latitudeSquare);

        System.out.print(" (int) ( longitudeSquareRemainder / 0.083333  -> ");
        System.out.println(" Value of longitudeSubSquare: " + longitudeSubSquare);

        System.out.print(" (int) ( latitudeSquareRemainder / 0.0416  -> ");
        System.out.println(" Value of latitudeSubSquare: " + latitudeSubSquare);

        String result = getGridSquares();
        System.out.print(" Longitude: " + longitude + ", Latitude: " + latitude + ",");
        System.out.println(" Location grid id = " + result);

        return result;
    }

    // https://www.dxzone.com/grid-square-locator-system-explained/
    private void parseLocation() {
        // Field
        this.longitudeField = maidenheadLongitude.calcLongitudeField(longitude);
        this.latitudeField = maidenheadLatitude.calcLatitudeField(latitude);
        // Square
        this.longitudeSquare = maidenheadLongitude.calcLongitudeSquare();
        this.latitudeSquare = maidenheadLatitude.calcLatitudeSquare();
        // SubSquare
        this.longitudeSubSquare = maidenheadLongitude.calcLongitudeSubSquare();
        this.latitudeSubSquare = maidenheadLatitude.calcLatitudeSubSquare();
    }

    private String getGridSquares() {
        return field.getField(longitudeField, latitudeField) +
                square.getSquare(longitudeSquare, latitudeSquare) +
                subSquare.getSubSquare(longitudeSubSquare, latitudeSubSquare);
    }

}
