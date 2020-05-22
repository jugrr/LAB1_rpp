package com.example.lab1;

public class Transleter {
    static final private String[] unit = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    static final private String[] dozens={"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    static final private String[] from11to19={"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    static final private String[] hundred = {"сто", "двести", "триста", "четыреста", "пятьсот", "шетьсот", "семьсот", "восемьсот", "девятьсот"};

    public static String fromIntToString(int number){
        String myStrNum = "";
        int num = number;
        myStrNum = myStrNum + threeDigits(num % 1000);
        num = num / 1000;
        if(num != 0 && num % 1000 != 0){
            myStrNum = threeDigits(num % 1000) + " тысяч " + myStrNum;
        }
        num = num / 1000;
        if(num != 0){
            myStrNum = threeDigits(num % 1000) + " миллион " + myStrNum;
        }
        return myStrNum;
    }

    private static String threeDigits(int thDig){
        String shortStrDig = "";
        int digits = 0;
        digits = thDig / 100;
        if(digits != 0){
            shortStrDig = hundred[digits - 1];
        }
        thDig = thDig % 100;
        if (thDig >= 20){
            digits = thDig / 10;
            shortStrDig = shortStrDig + " " + dozens[digits - 1];
            digits = thDig % 10;
            if(digits != 0)
                shortStrDig = shortStrDig + " " + unit[digits - 1];
        }
        else if(thDig > 10 && thDig < 20){
            digits = thDig % 10;
            shortStrDig = shortStrDig + " " + from11to19[digits - 1];
        }
        else if (thDig < 10 && thDig != 0){
            digits = thDig;
            shortStrDig = shortStrDig + " " + unit[digits - 1];
        }
        else if(thDig == 10){
            shortStrDig = shortStrDig + " " + dozens[0];
        }
        shortStrDig = shortStrDig.trim();
        return shortStrDig;
    }
}
