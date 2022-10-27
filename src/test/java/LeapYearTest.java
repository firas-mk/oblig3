import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {


    @Test
    public void checking_leap_year_it_is_divisible_by_4_but_not_100()
    {
        assertEquals(true, CheckTheLeapyear.is_Leap_Year(1108));
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(1216));
        assertEquals(true, CheckTheLeapyear.is_Leap_Year(2004));
        assertEquals(true, CheckTheLeapyear.is_Leap_Year(2008));

    }
    @Test
    public void checking_leap_year_is_divisible_by_400()
    {
        assertEquals(true, CheckTheLeapyear.is_Leap_Year(400));
        assertEquals(true, CheckTheLeapyear.is_Leap_Year(800));
        assertEquals(true, CheckTheLeapyear.is_Leap_Year(1600));
        assertEquals(true, CheckTheLeapyear.is_Leap_Year(2000));
    }

    @Test
    public void checking_leap_year_is_not_divisible_by_4()
    {
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(2005));
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(2006));
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(2007));
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(2009));
    }

    @Test
    public void checking_leap_year_is_divisible_by_100_but_not_400()
    {
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(1700));
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(2100));
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(1500));
        assertEquals(false, CheckTheLeapyear.is_Leap_Year(1800));

    }
}
