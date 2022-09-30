public class Main {
    public static void main(String[] args) {
 // Задание 1
 var clientOS = 0;
 if (clientOS == 0){
     System.out.println("«Установите версию приложения для iOS по ссылке».");
 } else if (clientOS == 1) {
     System.out.println("«Установите версию приложения для Android по ссылке».");
 } else {
     System.out.println("Установите хоть что нибудь");
 }
 // Задание 2
         var clientDeviceYear = 2022;
         var clientDevice = "IOS";
         // var lientDevice = "Android";
         if (clientDeviceYear < 2015 && clientDevice == "IOS"){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else {
             System.out.println("Установите обычную систему");
         }
        // Задание 3
         var year = 2021;
         if (year % 4 == 0){
             System.out.println(year + " " + "год является високосным»");
         } else {
             System.out.println(year + " " + "год не является високосным");
         }
        // Задание 4
        var deliveryDistance = 95;
         //var time = (deliveryDistance - 40)/20;
         if (deliveryDistance < 20){
             System.out.println("Потребуется дней: 1");
         } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
             System.out.println("Потребуется дней: 2");
         } else if (deliveryDistance >=60 && deliveryDistance < 100) {
             System.out.println("Потребуется дней: 3");
         } else {
             System.out.println("потребуется больше дней");
         }
        // Задание 5
       var monthNumber = 12;
         switch (monthNumber) {
             case 1: System.out.println("Это зима");
                 break;
             case 2:  System.out.println("Это зима");
                 break;
             case 12:  System.out.println("Это зима");
                 break;
             case 3:  System.out.println("Это весна");
                 break;
             case 4:  System.out.println("Это весна");
                 break;
             case 5:  System.out.println("Это весна");
                 break;
             case 6:  System.out.println("Это лето");
                 break;
             case 7:  System.out.println("Это лето");
                 break;
             case 8:  System.out.println("Это лето");
                 break;
             case 9:  System.out.println("Это осень");
                 break;
             case 10:  System.out.println("Это осень");
                 break;
             case 11:  System.out.println("Это осень");
                 break;
             default:
                 System.out.println("Такого сезона не существует");
                 break;
         }
    }
}