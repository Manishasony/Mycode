/**
 * created by manisha
 * this is the sample progam using advanced feauture of datetime
 */
package DateTimeAPI;
import java.time.*;
import java.util.Set;

public class SampleProgram_DateTime {
    public static void main(String[]args)
    {
        LocalDate d=LocalDate.now();//only gives the current date with year
        System.out.println("current date:"+d);
        boolean leapyear = LocalDate.now().isLeapYear();//checks whether the year is leap year or not
        System.out.println("if the current date occurs is leap year:"+leapyear);
        LocalTime now = LocalTime.now();//only gives the current time
        System.out.println("current time:"+now);
       int  threeThirty = LocalTime.parse("03:30").getHour();
        System.out.println("current time:"+ threeThirty );
        LocalTime l=LocalTime.now(ZoneId.of("GMT"));//it gives time based on zoneid
        System.out.println("time with based on zone:"+l);
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();//to check what are all zoneid's available
        System.out.println(allZoneIds);

        }



    }


