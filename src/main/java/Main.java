/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        boolean turnOn = true;

        Console.println("Welcome to the ATM ! \n                                        \n" +
                "***     ***              ***              \n" +
                "***     ***              ***              \n" +
                "***     ***              ***              \n" +
                "***     ***     *****    ***   *** ***    \n" +
                "***     ***    *******   ***   ********   \n" +
                "***********   ****  ***  ***   **** ****  \n" +
                "***********   ***   ***  ***   ***   ***  \n" +
                "***     ***   *********  ***   ***   ***  \n" +
                "***     ***   *********  ***   ***   ***  \n" +
                "***     ***   ***        ***   ***   ***  \n" +
                "***     ***   ****       ***   ****  ***  \n" +
                "***     ***    ********  ***   ********   \n" +
                "***     ***     *******  ***   *** ***    \n" +
                "                               ***        \n" +
                "                               ***        \n" +
                "                               ***  \n==========++=========" +
                " \nWould you like to make a new account or do you have an existing account?");
        Integer inputValue = Console.getIntegerInput("Choose: an Option \n 1. I have an existing account \n 2. I want to make a new Account\n 3. Exit ATM "
        );

        switch(inputValue){
            case 1:
                String usernameValue = Console.getStringInput( "Welcome back! \n Please input your username: ");


//                if (pinNumValue== usernamePinNum ){
//                    call the transaction methods here
//                }
                for(int i=1;i<=1000;i++)
                {
                    try
                    {
                        Integer pinNumValue = Console.getIntegerInput( " Please input your four digit pin number: ");
                        if(pinNumValue<=9999 && pinNumValue>=1000)
                        {
                        }
                        else
                        {
                            System.out.println("Pin must be four digit");

                        }


                    }
                    catch(InputMismatchException e)
                    {

                        System.out.println("Error use numbers not alphabets or characters");
                    }
                }



                break;
            case 2:
                Console.println("Thank you for choosing our bank! Please input your first name:");
                String firstName = Console.getStringInput("First name:");
                String lastName = Console.getStringInput("Last name:");
                System.out.println("Welcome " + firstName +  " \n Your new username is :" + firstName+lastName  );

                break;
            case 3:
                turnOn= false;
                break;

            default:
                Console.println("Error: invalid option");

                break;
        }

    }

}
