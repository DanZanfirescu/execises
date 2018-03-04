package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner tastatura = new Scanner(System.in);

/*
//Problema1 Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.
// The program shall always print “DONE” before exiting.
        CheckPassFail checkPassFail = new CheckPassFail();
        System.out.print("Type your number: ");
        int mark = tastatura.nextInt();
        checkPassFail.check(mark);

//Problema2 Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
// The program shall always print “BYE!” before exiting.

        CheckOddEven checkOddEven = new CheckOddEven();
        System.out.println("Type your number: ");
        int number = tastatura.nextInt();
        checkOddEven.check(number);

//Problema3 Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.

        PrintNumberInWord printNumberInWord = new PrintNumberInWord();
        System.out.println("Type your number: ");
        int numBer = tastatura.nextInt();
        printNumberInWord.printNumber(numBer);

 //Problema4 Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "day" is 0, 1, ..., 6,
        // respectively. Otherwise, it shall print “Not a valid day”.

        PrintDayInWord printDayInWord = new PrintDayInWord();
        System.out.println("Type your number: ");
        int day = tastatura.nextInt();
        printDayInWord.printDay(day);
 */

 //Problema5 Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.

        SumAndAverage sumAndAverage = new SumAndAverage();
        sumAndAverage.sumAndAverageVariantaFor();
        sumAndAverage.sumAndAverageVariantaWhaile();
        sumAndAverage.sumAndAverageVariantaDoWhile();
        System.out.println("Indica inceput interval:");
        int inceputInterval = tastatura.nextInt();
        System.out.println("Indica sfarsit interval:");
        int sfarsitInterval = tastatura.nextInt();
        sumAndAverage.sumAndAverageVariantaUserInput(inceputInterval, sfarsitInterval);



    }
}
