public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String month : months){
            printCalendarForMonth(month);
        }
    }

    public static void printCalendarForMonth(String monthName){
        System.out.println(monthName);
    }
}
