public class Date {

    /* Write a program that creates a Date object, set it´s elapsed time to 10000, 100000, 1000000, 10000000, 100000000,
    1000000000, 10000000000 and 100000000000.
    Display the date and time using the toString() method, respectively.
    */

    public static void main(String[] args) {
        Date date = new Date();                    // date object


        for (long i = 10000; i <= 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }

    private void setTime(long i) {

    }
}
