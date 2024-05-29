package bites.examples;
import java.util.ArrayList;
import java.util.List;

public class Year {
    public static void main(String[] args) {
        Year year = new Year();
        System.out.println(year.isLeap(2000));
        System.out.println(year.isLeap(1970));
        System.out.println(year.isLeap(1900));
        System.out.println(year.isLeap(1988));
        System.out.println(year.isLeap(1500));

        int[] leapYears = year.getLeapYearsInRange(1990, 2000);
        for (int y : leapYears) {
            System.out.print(y + " "); // 1992 1996 2000
        }
        System.out.println();


        System.out.println(year.getClosestLeapYear(1999)); // 2000
        System.out.println(year.getClosestLeapYear(2003)); // 2004
        System.out.println(year.getClosestLeapYear(2000)); // 2000
        System.out.println(year.getClosestLeapYear(1899)); // 1896
    }



    public boolean isLeap(int year) {

        if(year % 400 == 0){
            return true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 != 0){
            return false;
        } else {
            return false;
        }
    }

    public int[] getLeapYearsInRange(int startYear, int endYear) {
        List<Integer> leapYears = new ArrayList<>();
        for (int year = startYear; year <= endYear; year++) {
            if (isLeap(year)) {
                leapYears.add(year);
            }
        }
        // Convert the List to an array
        int[] result = new int[leapYears.size()];
        for (int i = 0; i < leapYears.size(); i++) {
            result[i] = leapYears.get(i);
        }
        return result;
    }


    public int getClosestLeapYear(int year) {
        if (isLeap(year)) {
            return year;
        }

        int yearBefore = year - 1;
        int yearAfter = year + 1;

        while (true) {
            if (isLeap(yearBefore)) {
                return yearBefore;
            }
            if (isLeap(yearAfter)) {
                return yearAfter;
            }
            yearBefore--;
            yearAfter++;
        }
    }
}
