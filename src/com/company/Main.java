package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables:
        String userInputVar;
        char varCharacter; //Tried to put char but then Scanner wouldn't run.
        int charNumReturn;

        //Block 1: UI
        System.out.println("Please enter a character: ");
        userInputVar = input.next();

        //Block 2: Catching invalid inputs.

        //Block 3: Conversion
        varCharacter = userInputVar.charAt(0);
        //Had to Google this part. Didn't know how to get Scanner to return single char.
        charNumReturn = (int) varCharacter;
        System.out.println(varCharacter + "'s ASCII code is: " + charNumReturn);
    }
}

/*
I had a hard time understanding that a char had a numerical value. So I just kept going in circles.
But after I understood that part, the coding part was mostly easy.
*/
