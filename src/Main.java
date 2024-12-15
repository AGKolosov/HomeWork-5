public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Версия приложения не выбрана");
            }
        System.out.println();
        // Задание 2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        // Задание 3
        int year = 2007;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }
        System.out.println();
        // Задание 4
        int deliveryDistance = 100;
        int deliveryDays = 1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + deliveryDays);
            } else if (deliveryDistance <= 60 && deliveryDistance >= 21) {
                System.out.println("Потребуется дней: " + (deliveryDays + 1));
            } else if (deliveryDistance <= 100 && deliveryDistance >= 61) {
                System.out.println("Потребуется дней: " + (deliveryDays + 1 + 1));
            }
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
        // Задание 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна");
                break;
            case 6, 7, 8:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето");
            case 9, 10, 11:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень");
                break;
            default:
                System.out.println("Введите значение месяцев от 1-12");
        }
        System.out.println();
    }
}