/**
 * created by manisha
 * sample hashmap program that gives number of character count by using get and put method
 */
package HashMapProgram;
import java.util.*;

public class SampleHashMapProgram {
    public static void main(String[]args)
    {
        String str="developer";
        Map<Character,Integer>charcount=new HashMap<>();//declaring hashmap
        for(Character c:str.toCharArray())//loop iterates and takes each character
        {
            if(charcount.containsKey(c))//containskey() checks whether the character is already present in map or not
            {
                charcount.put(c,charcount.get(c)+1);
            }
            else
            {
                charcount.put(c,1);
            }
        }
        System.out.println(charcount);
    }
}
