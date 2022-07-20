package ru.netology.sqr;

public class SQRService {
       public int calculate(int min, int max){
           int number = 0;
           for (int i = 10; i <= 99; i++){
               int sqr = i * i;
               if (sqr >= min && sqr <= max) {
                  number = number + 1;
               }

           }

           return number;
       }
}
