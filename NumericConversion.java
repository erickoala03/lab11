import java.util.Scanner;

public class NumericConversion {


    public static short hexCharDecode(char c) {
 short value = 0; // this value is intialized at zero at to reset to them.

        if(Character.isDigit(c)) {
           value = (short)  ( c - 48);
        } // this for digits only. the character of asc value.

       else if (Character.isLetter(c)) {
           c = Character.toLowerCase(c);
            if ( c == 'a') {
                value  = (short)  (c-87) ;
            }
            else if (c == 'b' ) {
               value  = (short)  (c-87);
            }
            else if (c== 'c' ) {
                value = (short) (c-87) ;
            }
            else if( c == 'd') {
                value  = (short) (c-87);
            }
            else if( c == 'e' ){
                value = (short) (c-87);
            }
            else if (c == 'f' ) {
                value = (short) (c-87);
            }
            /*
            The value of the letter only accounts for a - f. It also grabs the character of uppercase letters and converts them to lower case.
            It still converts them 10-16.
            */

        }
    return value;
    }


   public static long hexStringDecode(String hex) {
        hex = hex.replace("0b", "");
        hex = hex.replace("0x", "");
            long dec = 0;
           long total = 0;

        for ( int i = hex.length() - 1; i >= 0; --i ) {
            char c = hex.charAt(i);
           dec +=  hexCharDecode(c) * Math.pow(16, total++);
        }

        return dec;
        }
/*  this dec is for my total of the string to decimal actually. it grabs the value of the character. when you reach the character value. Then it is mutiplied */
        public static short binaryStringDecode(String hex) {
        int dec = 0;
        int placement = 0;
            hex = hex.replace("0b", "");
            hex = hex.replace("0x", "");
        for (int i = hex.length() - 1; i >= 0; --i) {
            char c = hex.charAt(i);
            if ( c == 49)
            {
             dec += Math.pow(2, placement);
                }
            placement++;
            }

return (short) dec;
        }


        public static void main (String[]args){
            Scanner scnr = new Scanner(System.in);
            int option;
            boolean calculatorOn = true;
            /* THe do prints out the menu first. I didn't bother doing the extra credit so it just brings me back to the menu
            when pick the option 4. */
            do {
                System.out.println("Decoding Menu");
                System.out.println("-------------");
                System.out.println("1. Decode hexadecimal");
                System.out.println("2. Decode binary");
                System.out.println("3. Convert binary to hexadecimal");
                System.out.println("4. Quit");
                System.out.println("Please enter an option: ");
                option = scnr.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Please enter the numeric string to convert: ");
                        String hex = scnr.next();
                        System.out.println("Result: " +  hexStringDecode(hex));
                        break;
                    case 2:
                        System.out.println("Please enter the numeric string to convert: ");
                         hex = scnr.next();
                        System.out.println("Result: " + binaryStringDecode(hex) );
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        calculatorOn = false;
                        break;
                }

            } while (calculatorOn); // this just turns off the calculator. 

        }

}
