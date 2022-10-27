public class CheckTheLeapyear {

    public static boolean is_Leap_Year(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 200 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }
}

