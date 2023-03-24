package math;
/******************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill t v
 *
 *  Given the temperature t (in Fahrenheit) and the wind speed v
 *  (in miles per hour), compute the wind chill w using the formula
 *  from the National Weather Service.
 *
 *     w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 *  Reference:  http://www.nws.noaa.gov/om/windchill/index.shtml
 *
 ******************************************************************************/

public class WindChill {
    public static void main(String[] args) {
        double t = 20;  // Temp in F
        double v = 6;   // Wind in Miles pr. H
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}
