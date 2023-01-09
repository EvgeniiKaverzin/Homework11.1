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
        //Задание 2.
        System.out.println("Задание 2.");
        int clientOs = LocalDate.now().getYear();
        int clientDeviceYear = LocalDate.now().getYear();
        int currentYear = LocalDate.now().getYear();
        switch (clientOs) {
            case 0:
                if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 1:
                if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Hе удалось определить операционную систему");
        }
        private static void informTime ( int deliveryDistance){
            //Задание 3.
            System.out.println("Задание 3.");
            int deliveryDistance = 15;
            informTime(deliveryDistance);

            int time = 1;
            if (deliveryDistance > 20) {
                time++;
            }
            if (deliveryDistance > 60) {
                time++;
            }
            System.out.println("Потребуется дней: " + time);
        }
    }
}





