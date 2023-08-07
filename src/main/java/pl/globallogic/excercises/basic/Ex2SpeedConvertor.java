package pl.globallogic.excercises.basic;

public class Ex2SpeedConvertor {

        /*
        * This program will convert speed in kilometers per h to miles per h
        *
        *
        *
         */

   public static void main(String[] args) {
            System.out.println(toMilesPerHour(1.5) == 1);
            System.out.println(toMilesPerHour(10.25) == 6);
            System.out.println(toMilesPerHour(-5.6) == -1);
       System.out.println(convertedSpeedMessage(1.5).equals("1.5km/h = 1 mi/h"));
       System.out.println(convertedSpeedMessage(25.24).equals("25.24km/h = 16 mi/h"));
       System.out.println(convertedSpeedMessage(-7.89).equals("Invalid value"));
    }

    private static String convertedSpeedMessage(double kilometersPerHour) {
       long miles = toMilesPerHour(kilometersPerHour);
       if (miles < 0) {
           return "invalid value";

       }
        return "" + kilometersPerHour + "km/h = " +miles +" mi/h" ;
    }

    private static long toMilesPerHour(double kilometersPerHour) {
            double conversionCoefficient = 1.609;
            if(kilometersPerHour < 0)
                return -1;
            return Math.round(kilometersPerHour / conversionCoefficient);
    }
}
