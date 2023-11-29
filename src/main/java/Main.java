public class Main {
    public static void main(String[] args) {
        String[][] months = {{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"},
                {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"}};
        System.out.println(months[0][0]);
        System.out.println(months[1][0]);
        for (int i = 0; i < 12; i++){
            printCalendarForMonth(months[0][i], Integer.parseInt(months[1][i]));
        }
        }

    public static void printCalendarForMonth(String monthName, int daysInMonth){
        System.out.println("\n" + monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");
        for (int i = 1; i <= daysInMonth; i++){
            System.out.print(i + " ");
            if (i % 7 == 0){
                System.out.print("\n");
            }
        }
    }
}
