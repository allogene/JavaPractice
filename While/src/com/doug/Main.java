package com.doug;

public class Main {

    public static void main(String[] args) {
        int count = 0, total = 0;
 /*       while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }
        count = 16;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);*/

        int startNumber = 5;
        int finishNumber = 20;
        while (startNumber <= finishNumber) {
            if (!isEvenNumber(startNumber)) {
                startNumber++;
                continue;
            }

            System.out.println("Number " + startNumber + " is Even");
            total += startNumber;
            count++;

            if(count == 5){
                System.out.println("Total of even numbers " + total);
                break;
            }
            startNumber++;

        }
    }


    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
