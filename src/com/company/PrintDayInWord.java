package com.company;

public class PrintDayInWord {

    public void printDay(int day){
        String dayInWord;
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thoursday");
                break;
            case 5:
                System.out.println("Frieday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.println("Not a valid day.");
        }
    }


}
