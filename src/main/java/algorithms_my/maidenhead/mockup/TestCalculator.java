package algorithms_my.maidenhead.mockup;

class TestCalculator {
    public static void main(String[] args) {
        calcLongitude();
        calcLatitude();
    }

    public static void calcLongitude() {
        double longitude = 18.388544;

        System.out.println("Longitude");
        System.out.println("Field");

        double fieldA = longitude + 180;
        System.out.println( longitude + " + 180 = " + fieldA);

        double fieldB = fieldA % 20;
        System.out.print( fieldA + " % 20 = " + fieldB );
        System.out.println(" Remainder = " + fieldB );

        System.out.println("Square");

        double squareA = fieldB % 2;
        double squareB = fieldB / 2;
        int squareC = (int) squareB;
        System.out.print(squareA + " / 2 = " + squareC);
        System.out.println(" Remainder = " + squareA);

        System.out.println("SubSquare");

        double subSquareA = squareA % 0.083333;
        double subSquareB = squareA / 0.083333;
        int subSquareC = (int) subSquareB;
        System.out.print(squareA + " / 0.083333 = " + subSquareC);
        System.out.println(" Remainder = " + subSquareA + "\n");
    }

    public static void calcLatitude() {
        double latitude = -33.931833;

        System.out.println("Latitude");
        System.out.println("Field");

        double fieldA = latitude + 90;
        System.out.println( latitude + " + 90 = " + fieldA);

        double fieldB = fieldA % 10;
        System.out.print( fieldA + " % 10 = " + fieldB );
        System.out.println(" Remainder = " + fieldB );

        System.out.println("Square");

        double squareA = fieldB % 1;
        double squareB = fieldB / 1;
        int squareC = (int) squareB;
        System.out.print(squareA + " / 2 = " + squareC);
        System.out.println(" Remainder = " + squareA);

        System.out.println("SubSquare");

        double subSquareA = squareA % 0.0416;
        double subSquareB = squareA / 0.0416;
        int subSquareC = (int) subSquareB;
        System.out.print(squareA + " / 0.0416 = " + subSquareC);
        System.out.println(" Remainder = " + subSquareA + "\n");
    }

}
