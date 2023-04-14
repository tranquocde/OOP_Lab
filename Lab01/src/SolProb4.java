import java.util.Scanner;

public class SolProb4 {
    public SolProb4(){}
    public boolean check(String[] arr , String key){
        boolean flag = false;
        for (String s:arr){
            if (key.equals(s)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        SolProb4 sol = new SolProb4();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a year :");
        int year = keyboard.nextInt();
        System.out.println("Please enter a month :");
        String month = keyboard.next();
        boolean leapYear;
        if (year % 4 !=0){
            leapYear = false;
        }
        else if (year % 4 == 0 && year % 100 != 0){
            leapYear = true;
        }
        else if(year % 100 == 0 && year % 400 != 0){
            leapYear = false;
        }
        else {
            leapYear = true;
        }
        String[] month_with_31_days = new String[]{"Jan","1","January","Jan.","March","Mar.","Mar","3"
    ,"May","5","July","Jul","7","August","Aug.","Aug","8","October","Oct.","Oct","10","December","Dec.","Dec","12"};
        String[]month_with_30_days = new String[]{"April","Apr.","Apr","4","June","Jun","6","September","Sept.","Sep","9","November","Nov.","Nov","11"};
        String[] specialMonths = new String[]{"February","Feb.","Feb","2"};
        
        if (sol.check(month_with_31_days , month)){
            System.out.println("There are 31 days in this month");
        }
        if (sol.check(month_with_30_days,month)){
            System.out.println("There are 30 days is this month ");
        
        }
        if (sol.check(specialMonths , month)){
            if (leapYear == true){
                System.out.println("There are 29 days in this month");
            }
            else{
                System.out.println("There are 28 days in this month");
            }
            }
        }
}
