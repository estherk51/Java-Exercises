public class BarkingDog {
    public static void main(String[] args) {

        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
       if((barking) && ((hourOfDay > -1 && hourOfDay < 8))) {
           return true;
       } else if ((barking == true) && ((hourOfDay > 22 && hourOfDay < 24))){
           return true;
       } else {
           return false;
       }
    }
}

// if dog is barking before 8 or after 22 hours return true
// if not then return false
// range is 0 - 23
