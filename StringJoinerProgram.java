/**
 * created by manisha
 * sample program using StringJoiner class
 */

package StringJoiner;
import java.util.StringJoiner;
public class StringJoinerProgram {

        public static void main(String[] args) {
            /* Passing semicolon ; as delimiter and opening square bracket
             * "[" as prefix and closing bracket "]" as suffix
             */
            StringJoiner mystring = new StringJoiner(";", "[", "]");

            mystring.add("tamil");
            mystring.add("hindhi");
            mystring.add("english");
            mystring.add("malayalam");

            System.out.println("First String: "+mystring);

            /* Passing hyphen , as delimiter and opening curlybraces
             * as prefix and closing curlybraces as suffix
             */
            StringJoiner myanotherstring = new StringJoiner(",", "{", "}");

            myanotherstring.add("hi");
            myanotherstring.add("hello");
            myanotherstring.add("welcome");
            myanotherstring.add("thank you");

            System.out.println("Second String: "+myanotherstring);

            /* Merging both the strings the output string will be
             * having the delimiter prefix and suffix of the first string (the string
             * which is calling the merge method of StringJoiner)
             */
            StringJoiner mergedString = mystring.merge(myanotherstring);
            System.out.println(mergedString);
            /*The length() method of StringJoiner class returns the
             *length of the string
             */
            int length = mystring.length();
            System.out.println("Length of the StringJoiner: "+length);




        }
    }

