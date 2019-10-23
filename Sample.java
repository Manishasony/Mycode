/*created by manisha
default method sample program
 */
package DefaultMethod;
interface MyInterface{
    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void newMethod(){
        System.out.println("Newly added default method");
    }

    /* This is a static method. Static method in interface is
     * similar to default method except that we cannot override
     * them in the implementation classes.
     */
    static void anotherNewMethod(){
        System.out.println("Newly added static method");
    }
    /* Already existing method is abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);
}

    public class Sample implements MyInterface{
        // implementing abstract method
        public void existingMethod(String str){
            System.out.println("String is: "+str);
        }
        public static void main(String[] args) {
            Sample obj = new Sample();
            obj.newMethod();// //calling the default method of interface
            MyInterface.anotherNewMethod();//calling the static method of interface
            obj.existingMethod("sample program of java");  //calling the abstract method of interface



        }
    }


