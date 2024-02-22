public class javaliterals {
    public static void main(String[] args){
        /**
         * java literals
         * there are diffrent types of literals
         * i. integer literals
         * ii. floating-point literals
         * iii. boolean literals
         * iv. character literals
         * v. string literals
         */

        // 1. integer literals
        //they come in different forms
        // -> decimal (base 10)
        // it dosent have special nottion e.g 12
        System.out.println("Example of decimal literal is:" + 12);

        //-> hexadecimal(base 16)
        //preceeded by 0x or 0x eg 0xc
        System.out.println("Exapmle of hexadecimal literal is:"+ 0xC);

        // -> octal (base 8)
        //preceeded by 0 r.g 014
        System.out.println("Example of a octal literal is:" + 015);


        //2. floating literals
        //represents decimals with fractional parts e.g 3.1416
        //can be expressed in standard or scientific notation
        //e.g 583.45 (standard) or 5.8345e2
        System.out.println("Example of a standard float literal is: " + 583.45);
        System.out.println("Example of a scientific float literal is: " + 5.8345e2);

        //3. boolean literals
        //boolean literals have only teo values, true or false
        System.out.println("Example of boolean literal is: true and false ");

        //4. character literals
        //represents single unicode characters
        //a unicode character set replaces the 8-bit ASCII set.
        //unicode allows the inclusion of symbols and special characters from other languages
        //to use a character literal,enclose the character in single quote
        //e.g letter a is reresented as 'a'
        System.out.println('a');

        System.out.println("this is a paragraph with \n a new line or line break");

        //5. string literals
         //represent multiple characters and an enclosed by double quotes example:"hello world"
        System.out.println("hello world!!!");

        //primitive data types


    }
}
