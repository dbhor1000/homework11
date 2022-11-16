import java.time.LocalDate;

public class Main {

    public static void checkYearMethod(int yearInput) {

        int yearFour = yearInput % 4;
        int yearHund = yearInput % 100;
        int yearQuart = yearInput % 400;

        if((yearFour == 0 && yearHund != 0) || yearQuart == 0) {

            System.out.println(yearInput + " - високосный год.");

        } else if(yearFour != 0 || (yearHund == 0 && yearQuart != 0)) {
            System.out.println(yearInput + " - не високосный год.");

        }

    }

    public static void checkPhone(int clientOS, int clientDeviceYear ) {

        int currentYear = LocalDate.now().getYear();

        if(clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения" +
                    " для iOS по ссылке.");

        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения" +
                    " для Android по ссылке.");
        }

        if(clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");

        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");


        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) {

        int deliveryDistanceAdj = deliveryDistance - 20;
        int distanceBy40 = deliveryDistanceAdj / 40;
        int days = distanceBy40 + 2;

        if(deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Потребуется дней: " + days);

        }

    }


    public static void main(String[] args) {


        ///Task 1 (Task 3(HW5))

        ///С помощью метода проверить, является ли этот год високосным.

        int currentYear = 2024;
        checkYearMethod(currentYear);


        ///Task 2 (Task 2(HW5))

        ///С помощью метода определить действия по параметрам OS и году выпуска устройства

        int typeSystem = 1;
        int yearMake = 2022;
        checkPhone(typeSystem, yearMake);

        ///Task 3 (Task 4(HW5))

        ///С помощью метода, основываясь на дистанции, рассчитать время доставки.

        int distance = 120;
        calculateDeliveryTime(distance);





    }



}