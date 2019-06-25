public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        } else {
            // 1 mph = 1.609 kmph
            double mph = kilometersPerHour / 1.609;
            long rounded = Math.round(mph);
            return rounded;
        }

    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
