import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Date1 {
    public  static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your birthday(yyyy/MM/dd)");
        String bday=s.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(bday, formatter);
        LocalDate currentdate=LocalDate.now();
        Period p=Period.between(date,currentdate);
        int year=p.getYears();
        int month= p.getMonths();
        int day=p.getDays();
       System.out.println("Age is "+ year+"year,"+month+" months,"+day+" days");

    }
}
