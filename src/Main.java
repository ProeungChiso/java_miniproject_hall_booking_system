import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void welcomeDisplay(){
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("CSTAD HALL BOOKING SYSTEM");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
    public static void menuDisplay(){
        System.out.println("[[ Application Menu ]]");
        System.out.println("<A> Booking");
        System.out.println("<B> Hall");
        System.out.println("<C> Showtime");
        System.out.println("<D> Reboot Showtime");
        System.out.println("<E> History");
        System.out.println("<F> Exit");
    }
    public static void dailyShowtime(){
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("# Daily Showtime of CSTAD hall:");
        System.out.println("# A) Morning (10:00AM - 12:30PM)");
        System.out.println("# B) Afternoon (03:00PM - 05:30PM)");
        System.out.println("# C) Night (07:00PM - 09:30PM)");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
    public static void morningSeat(int row, int column){
        int[][] rowSeat = new int[row][column];
        char letter = 'A';
        for(int i = 0; i < rowSeat.length; i++){
            for (int j = 0; j < rowSeat[i].length; j++){
                System.out.print("|"+letter+"-"+(j+1)+"::AV|    ");
            }
            letter++;
            System.out.println();
        }
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
    public static void afternoonSeat(int row, int column){
        int[][] rowSeat = new int[row][column];
        char letter = 'A';
        for(int i = 0; i < rowSeat.length; i++){
            for (int j = 0; j < rowSeat[i].length; j++){
                System.out.print("|"+letter+"-"+(j+1)+"::AV|    ");
            }
            letter++;
            System.out.println();
        }
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
    public static void nightSeat(int row, int column){
        int[][] rowSeat = new int[row][column];
        char letter = 'A';
        for(int i = 0; i < rowSeat.length; i++){
            for (int j = 0; j < rowSeat[i].length; j++){
                System.out.print("|"+letter+"-"+(j+1)+"::AV|    ");
            }
            letter++;
            System.out.println();
        }
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
    public static void instructionDisplay(){
        System.out.println("# INSTRUCTION");
        System.out.println("# Single: C-1");
        System.out.println("# Multiple: C-1,C-2 ");
    }
    public static void bookingInfo(){
        System.out.print("> Please select available seat: ");
        String av = scanner.next();
        System.out.print("> Please enter student ID: ");
        int stdId = scanner.nextInt();
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        String stdIdString = String.valueOf(stdId);
        System.out.print("> Are you sure to book? (Y/n): ");
        String yesNo = scanner.next().toLowerCase();
        switch (yesNo){
            case "y":
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                System.out.println("Booking Successful!");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                break;
            case "n":
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                System.out.println("Booking canceled!");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                break;
        }
    }
    public static void main(String[] args) {
        //Greeting to user
        welcomeDisplay();
        //user input to config
        System.out.print("> config total row in hall: ");
        int row = scanner.nextInt();
        System.out.print("> config total seats per row in hall: ");
        int column = scanner.nextInt();
        //Menu
        String option;
        do{
            //Menu list
            menuDisplay();
            //select menu
            System.out.print("> Please select menu no: ");
            option = scanner.next().toLowerCase();
            //switch case
            switch (option){
                case "a":
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.println("Start booking process");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.println("# A) Morning (10:00AM - 12:30PM)");
                    System.out.println("# B) Afternoon (03:00PM - 05:30PM)");
                    System.out.println("# C) Night (07:00PM - 09:30PM)");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.print("> Please select show time ( A | B| C ) : ");
                    String selectShowTime = scanner.next().toLowerCase();
                    switch (selectShowTime){
                        case "a":
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                            System.out.println("# Hall A");
                            morningSeat(row,column);
                            instructionDisplay();
                            bookingInfo();
                            break;
                        case "b":
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                            System.out.println("# Hall B");
                            afternoonSeat(row,column);
                            instructionDisplay();
                            bookingInfo();
                            break;
                        case "c":
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                            System.out.println("# Hall C");
                            nightSeat(row,column);
                            instructionDisplay();
                            bookingInfo();
                            break;
                    }
                    break;
                case "b":
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.println("# Hall Information");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.println("# Hall - Morning");
                    morningSeat(row,column);
                    System.out.println("# Hall - Afternoon");
                    afternoonSeat(row,column);
                    System.out.println("# Hall - Night");
                    nightSeat(row,column);
                    break;
                case "c":
                    dailyShowtime();
                    break;
                case "d":
                    System.out.println("D");
                    break;
                case "e":
                    System.out.println("E");
                    break;
                case "f":
                    System.out.println("Exit the program...!!");
                    break;
            }
        }while (!option.equals("f"));
    }
}