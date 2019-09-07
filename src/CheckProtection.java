// Kevin Chen, 23365285

import java.util.Scanner;

public class CheckProtection {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Check Format: x.xx | Min of 4 Characters | Max of 9 Characters | ',' and '.' Count as a Character");
        System.out.println("Enter Check Amount");
        String CheckAmount = input.nextLine();
        boolean notSatisfied = true;
        while (notSatisfied) {
            int DecimalLocation = CheckAmount.length() - 3;
            int CommaLocation = CheckAmount.length() - 7;
            String Everything = "[0-9,/,,/.]+";
            String Numbers = "[0-9]+";
            if (!CheckAmount.matches(Everything)){
                System.out.println("Try Again, Only Numbers, ',', and '.' Allowed");
                CheckAmount = input.nextLine();
            } // Check to see if there's anything other than numbers, commas and periods.
            else if (CheckAmount.length() < 4){
                System.out.println("Try Again, Missing Decimals Values");
                CheckAmount = input.nextLine();
            } // Greater than or equal to 4, Ex. 1.34 So there's nothing like 1 or 23 or .32.
            else if (CheckAmount.length() > 9){
                System.out.println("Try Again, Total Amount Entered Is More Than 9 Characters");
                CheckAmount = input.nextLine();
            } // Less than or equal to 9, Ex. 12,456.89 So there's nothing like 12,456,789.00
            else if (CheckAmount.length() < 7){
                String Check = "";
                for (int i = 0; i < CheckAmount.length(); i++){
                    if (i == DecimalLocation){
                        continue;
                    }
                    Check = Check + CheckAmount.charAt(i);
                }
                if (!Check.matches(Numbers)){
                    System.out.println("Try Again, Period/Comma in the Wrong Areas");
                    CheckAmount = input.nextLine();
                } // Decimal and Comma Check, so nothing like 0..3 or 0.2. or ,12.3 Happens
                else if(CheckAmount.charAt(DecimalLocation) != '.'){
                    System.out.println("Try Again, Missing Decimal At Appropriate Location. x.xx");
                    CheckAmount = input.nextLine();
                }// Decimal required, so usually at the 3rd index from right to left. So it's always 0.32
                else {
                    notSatisfied = false;
                }
            } // Less than 7 characters, check to see format. Ex. 123.56
            else if (CheckAmount.length() > 6) {
                String Check = "";
                for (int i = 0; i < CheckAmount.length(); i++) {
                    if (i == DecimalLocation) {
                        continue;
                    } else if (i == CommaLocation) {
                        continue;
                    }
                    Check = Check + CheckAmount.charAt(i);
                }
                if (!Check.matches(Numbers)) {
                    System.out.println("Try Again, Period/Comma in the Wrong Areas");
                    CheckAmount = input.nextLine();
                } // Decimal and Comma Check, so nothing like 0..3 or 0.2. or ,12.3 Happens
                else if (CheckAmount.charAt(DecimalLocation) != '.') {
                    System.out.println("Try Again, Missing Decimal At Appropriate Location. x.xx");
                    CheckAmount = input.nextLine();
                }// Decimal required, so usually at the 3rd index from right to left. So it's always 0.32
                else if (CheckAmount.charAt(CommaLocation) == ',') {
                    if (CheckAmount.length() <= 7) {
                        System.out.println("Try Again, Missing Number After Comma");
                        CheckAmount = input.nextLine();
                    }
                    else {
                        notSatisfied = false;
                    }
                } // Comma Check, if user uses comma, make sure there exist a number after the comma. Ex. 1,345.78
                else {
                    notSatisfied = false;
                } // If there is no comma, everything is good. Comma is just for precision.
            }
            else {
                System.out.println("Error 404: Something is Wrong. Try Again.");
                CheckAmount = input.nextLine();
            } // In case there's a BUG. Pretty sure everything works.
        } // Mainly used to check format of the user input.
        String FormattedCheckAmount = ""; // Empty String
        int empty = 9 - CheckAmount.length(); //Amount of Empty Spaces That's Left
        for (int i = 0; i < empty; i++){
            FormattedCheckAmount = FormattedCheckAmount + "*";
        } // Adding * to the Empty Spaces
        for (int i = 0; i < CheckAmount.length(); i++){
            FormattedCheckAmount = FormattedCheckAmount + CheckAmount.charAt(i);
        } // Adding the Rest of the Characters to Print
        System.out.println(FormattedCheckAmount + " Is the Check-Protected Format.");
        System.out.println("123456789 <- Total Numbers Aligned With Digits");
    }
}
