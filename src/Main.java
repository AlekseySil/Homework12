import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkTheLeanYear(2020);
        defineVersion(1,2008);
        defineVersion(0,2023);
        calculateDeliveryDay(95);

    }
    private static void checkTheLeanYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " - год високосный");
        }else{
            System.out.println(year + " - год не високосный");
        }
    }
    private static void defineVersion (int phoneOS, int phoneYear){
        String phoneOSName;

        switch (phoneOS) {
            case 0:
                phoneOSName = "IOS";
                break;
            case 1:
                phoneOSName = "Android";
                break;
            default:
                phoneOSName = "Не верная ОС";
        }
        int currentYear = LocalDate.now().getYear();

        if(phoneYear == currentYear){
            System.out.println(phoneOSName + " - установите обычную версию");
        } else {
            System.out.println(phoneOSName + " - установите life-версию");
        }
    }
    private static void calculateDeliveryDay (int distance){
        int day = 0;

        if(distance <= 20){
            day = 1;
            System.out.println("Доставка займет - " + day + " дня");
        }else if (distance <= 60){
            day = 2;
            System.out.println("Доставка займет - " + day + " дня");
        }else if (distance <= 100) {
            day = 3;
            System.out.println("Доставка займет - " + day + " дня");
        }else{
            System.out.println("Доставка не осуществляется");
        }
    }
}