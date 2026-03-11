public class PromotionRules {
    public static void main(String[] args) {
        
        // RULE 1: All byte, short, and char values are promoted to INT 
        // as soon as they are used in an expression.
        byte b = 42;
        char c = 'a'; // ASCII value of 'a' is 97
        short s = 1024;
        
        // Even though these are small types, the result is an INT.
        int firstResult = b * c / s; 
        System.out.println("Rule 1 (Result is int): " + firstResult);

        // RULE 2: If any operand is LONG, the whole expression is promoted to LONG.
        long l = 100000L;
        long secondResult = b + l; 
        System.out.println("Rule 2 (Result is long): " + secondResult);

        // RULE 3: If any operand is FLOAT, the whole expression is promoted to FLOAT.
        float f = 5.67f;
        float thirdResult = f * b;
        System.out.println("Rule 3 (Result is float): " + thirdResult);

        // RULE 4: If any operand is DOUBLE (the "King" of types), 
        // the whole expression is promoted to DOUBLE.
        double d = 0.1234;
        char i = 'b';
        double finalResult = (f * b) + (i / c) - (d * s); 
        // Here, different parts are promoted differently, but the final sum is DOUBLE.
        
        System.out.println("Rule 4 (Final Result is double): " + finalResult);
    }
}