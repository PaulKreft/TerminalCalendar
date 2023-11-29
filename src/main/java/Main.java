public class Main {
    public static void main(String[] args) {
        String[][] months = {{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"},
                {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"}, {"1", "2", "3", "3", "2", "3", "1", "4", "5", "6", "2", "1"}};
        System.out.println(months[0][0]);
        System.out.println(months[1][0]);
        for (int i = 0; i < 12; i++){
            printCalendarForMonth(months[0][i], Integer.parseInt(months[1][i]), Integer.parseInt(months[2][i]));
        }
        }

    public static void printCalendarForMonth(String monthName, int daysInMonth, int offsetDays){
        System.out.println("\n" + "\n" + monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");
        for (int i = 1; i <= daysInMonth + offsetDays; i++){
        if(i <= offsetDays) {
            System.out.print("   ");
        }else {
            System.out.print(i - offsetDays + " ");
            if(i - offsetDays < 10) {
                System.out.print(" ");
            }
        }
            if (i % 7 == 0){
                System.out.print("\n");
            }
        }
    }
}
