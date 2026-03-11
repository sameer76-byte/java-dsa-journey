    public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Greater than
        boolean isGreater = a > b;    
        // Less than
        boolean isLess = a < b;
        // Equal to
        boolean isEqual = a == b;
        // Not equal to
        boolean isNotEqual = a != b;
        // Greater than or equal to
        boolean isGreaterOrEqual = a >= b;
        // Less than or equal to
        boolean isLessOrEqual = a <= b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a less than b? " + isLess);
        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a not equal to b? " + isNotEqual);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);
    }
}
