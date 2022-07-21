public class Main {
    public static int highYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }

    public static int deviceClient(int os, int year) {
        int ios = 0;
        int android = 1;

        boolean fullIos = os == ios && year > 2015;
        if (fullIos) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        }
        boolean lightIos = os == ios && year <= 2015;
        if (lightIos) System.out.println("Установите облегченную версию приложения для iOS по ссылке ");

        boolean fullAndroid = os == android && year > 2015;
        if (fullAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } boolean lightAndroid = os == android && year <= 2015;
        if (lightAndroid) System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        return os + year;

    }

    public static int days(int deliveryDistance) {
        int daysDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + daysDelivery);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (daysDelivery+1));
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (daysDelivery+2));
        }
        if (deliveryDistance > 100) {
            System.out.println("Извините, доставка в ваш район не осуществляется");
        }
        return daysDelivery;
    }


    public static void duplicates(String sorted) {
        for (int i = 0; i < sorted.length(); i++) {
            if (sorted.charAt(i) == sorted.charAt(i + 1)) {
                System.out.println("Обнаружен дубль - " + "'" + sorted.charAt(i) + "'");
                break;
            }
            if (i == sorted.length()-2) {
                System.out.println("Дублей нет");
                break;
            }
        }
    }

    public static void main(String[] args) {
        highYear(2022);
        deviceClient(0, 2021);
        days(113);
        duplicates("abcdefgghiijjkk");
    }

}

