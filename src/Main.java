import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int year = LocalDate.now().getYear();

            //Задание 1
            System.out.println("Задание 1");
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " високосный год");
            } else {
                System.out.println(year + " невисокосный год");
            }
        }
    }

