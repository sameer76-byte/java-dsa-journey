
//     Checks whether an object is an instance of a specific class or interface.
//      Returns `true` if the object is of the given type or a subtype.
//      Returns `false` if the object is `null`.
//      Commonly used before casting.
 public class InstanceOfOperator {
    public static void main(String[] args) {
        // Example with String
        String str = "Hello, World!";
        // Example with Integer
        Integer num = 42;

        // 1. str instanceof String → true
        System.out.println("str instanceof String? " + (str instanceof String));

        // 2. num instanceof Integer → true
        System.out.println("num instanceof Integer? " + (num instanceof Integer));

        // 3. str instanceof Object → true (all classes inherit from Object)
        System.out.println("str instanceof Object? " + (str instanceof Object));

        // 4. num instanceof Number → true (Integer is a subclass of Number)
        System.out.println("num instanceof Number? " + (num instanceof Number));

        // 5. Using a common supertype to show false
        Object obj = "I am a string, not a number";
        System.out.println("obj instanceof Integer? " + (obj instanceof Integer)); // false
        System.out.println("obj instanceof String? " + (obj instanceof String));   // true

        // 6. null always returns false
        String nothing = null;
        System.out.println("null instanceof String? " + (nothing instanceof String)); // false

        // 7. Interface example (using Object to hold a Runnable)
        Object runnableObj = new Thread();  // Thread implements Runnable
        System.out.println("runnableObj instanceof Thread? " + (runnableObj instanceof Thread));   // true
        System.out.println("runnableObj instanceof Runnable? " + (runnableObj instanceof Runnable)); // true
        System.out.println("runnableObj instanceof String? " + (runnableObj instanceof String));   // false
    }
}