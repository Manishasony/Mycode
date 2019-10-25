/**
 * created by manisha
 *sample program of typeinference
 */
package TypeInference;

public class TypeInferenceExample {
    public static void main(String []ar)
    {
        printlambda(s->s.length());//compiler infers the type
    }
    public static void printlambda(stringlengthlambda l)
    {
        System.out.println((l.getlength("hello guys")));
    }
}
interface stringlengthlambda
{
    int getlength(String s);
}
