public class UnaryOperator {
    public static void main(String[] args) {
        // --- 1. INCREMENT (++) ---
        int count = 5;
        System.out.println("Original count: " + count); // Output: 5
        
        count++; // Post-increment: count becomes 6 after this line
        System.out.println("After post-increment (count++): " + count); // Output: 6
        
        ++count; // Pre-increment: count becomes 7 before this line
        System.out.println("After pre-increment (++count): " + count); // Output: 7

        // --- 2. DECREMENT (--) ---
        int score = 10;
        System.out.println("\nOriginal score: " + score); // Output: 10
        
        score--; // Post-decrement: score becomes 9 after this line
        System.out.println("After post-decrement (score--): " + score); // Output: 9
        
        --score; // Pre-decrement: score becomes 8 before this line
        System.out.println("After pre-decrement (--score): " + score); // Output: 8

        // --- 3. UNARY PLUS (+) and MINUS (-) ---
        int a = 5;
        int b = -3;

        System.out.println("\n a:  " + a); // Output: 5
        System.out.println(" b: " + b); // Output: -3
        
        System.out.println("\nUnary plus on a (+" + a + "): " + (+a)); // Output: 5
        System.out.println("Unary minus on a (-" + a + "): " + (-a)); // Output: -5
        
        System.out.println("Unary plus on b (+" + b + "): " + (+b)); // Output: -3
        System.out.println("Unary minus on b (-" + b + "): " + (-b)); // Output: 3

    }
}
