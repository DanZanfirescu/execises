package com.company;

public class SumAndAverage {
    public void sumAndAverageVariantaFor (){
        System.out.println("Sum and average from 1 to 100 with for statement:");
        //rezolvare Problema5 cu "for"
        int sum = 0; //declara variabile sum cu valoare initiala
        int counter = 0;
        for(int i = 1; i <= 100; i ++) {
            sum = sum + i;
            counter = counter + 1; //se incremeteaza odata cu for-ul si imi spune de cate ori s-a executat for-ul
        }
        System.out.println("Sum = " + sum);
        double sum1 = sum; //transforma variabile int sum in double
        double average = sum1/counter;
        System.out.println("Average = " + average);
    }
    public void sumAndAverageVariantaWhaile (){
        System.out.println("Sum and average from 1 to 100 with while statement:");
        //rezolvare Problema5 cu "while"
        int sum = 0;
        int valoare = 1;
        int counter = 0;
        while (valoare <= 100){
            sum = sum + valoare;
            valoare = valoare +1;
            counter = counter + 1;
        }
        System.out.println("Sum = " + sum);
        double sum1 = sum; //transforma variabile int sum in double
        double average = sum1/counter;
        System.out.println("Average = " + average);
    }
    public void sumAndAverageVariantaDoWhile(){
        //rezolvare Problema5 cu "do while"
        System.out.println("Sum and average from 1 to 100 with do while statement:");
        int valoare = 1;
        int sum = 0;
        int counter = 0;
        do {
            sum = sum + valoare;
            valoare = valoare + 1;
            counter = counter + 1;
        }
        while (valoare <= 100);
        System.out.println("Sum = " + sum);
        double sum1 = sum;
        double average = sum1/counter;
        System.out.println("Average = " + average);
    }

    public void sumAndAverageVariantaUserInput(int inceputInterval, int sfarsitInterval){
        int sum = 0;
        int counter = 0;
        for(int i=inceputInterval; i <= sfarsitInterval; i++){
            sum = sum + i;
            counter = counter + 1;
        }
        System.out.println("Sum = " + sum);
        double sum1 = sum;
        double average = sum1/counter;
        System.out.println("Average = " + average);
    }

    }

