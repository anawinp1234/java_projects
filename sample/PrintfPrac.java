public class PrintfPrac {
    public static void main(String[] args){
        // printf() = optional method to control, format, and display text
        //         two arguments = format string + (object/variable/value)
        //         % [flags] [precision] [width] [conversion-character]
        
        
        System.out.printf(" Hello %d there", 89);
        System.out.println();
        System.out.printf("%%d Hello there", 89); //to print literal string just escape with another %
        System.out.println();

        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Anawin";
        int myInt = 30;
        double myDouble = 1000;
        double myDoubleSci = 25.56;
        
        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%s", myString);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f", myDouble); // default 6 decimal places
        System.out.println();
        System.out.printf("%e", myDoubleSci); // default 6 decimal places
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.printf("%o", i); //octal int
            System.out.println();
        }
        

        // [width]
        //minimum number of characters written as output
        System.out.printf("Hello %10s", myString); // right-justified
        System.out.println();
        System.out.printf("Hello %-10s", myString); // left-justified
        System.out.println();

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f", myDouble); // prints = You have this much money 1000.00
        System.out.println();

        //[flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %-20f", myDouble); // left justify
        System.out.println();
        System.out.printf("You have this much money %20f", myDouble); // right justify
        System.out.println();
        System.out.printf("You have this much money %+f", myDouble); //will include + or - sign
        System.out.println();
        System.out.printf("You have this much money %020f", myDouble); //padding with 0
        System.out.println();
        double bigDouble = 1000000000;
        System.out.printf("You have this much money %,f", bigDouble); // comma grouping
        System.out.println();
        System.out.printf("You have this much money %,.2f", bigDouble); // combine comma goruping with precision 2 decimals
        System.out.println();
        System.out.printf("You have this much money %,.2f\n", bigDouble); // combine comma goruping with precision 2 decimals with newline


    }
}