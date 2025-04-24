package midterm1.t2.beef.sub.R21;

import midterm1.t2.beef.A21;
import midterm1.t2.oven.scene.A22;

public class R21 {
    public static void main(String[] args) {
        A21 rectangle = new A21();

        int width = rectangle.getWidth();
        int height = rectangle.getHeight();

        int area = width * height;

        System.out.println("The area of the rectangle is: " + area);

        A22 date = new A22();
        int monthNumber = date.getMonth();

        String monthName = getMonthName(monthNumber);

        if (monthName != null) {
            System.out.println("The month is: " + monthName);
        } else {
            System.out.println("Invalid value: " + monthNumber);
        }
    }

    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return null;
        }
    }
    }
}
