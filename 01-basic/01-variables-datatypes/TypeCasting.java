public class TypeCasting {
    public static void main(String[] args) {
        
        // --- 1. WIDENING (Implicit Casting) ---
        // Rule: Moving from a SMALLER type to a LARGER type.
        // It happens automatically because it is "safe."
        int myInt = 500;
        double myDouble = myInt; // int automatically becomes double
        
        System.out.println("--- Widening ---");
        System.out.println("Int value: " + myInt);
        System.out.println("Automatic Double: " + myDouble); // Output: 500.0

        // --- 2. NARROWING (Explicit Casting) ---
        // Rule: Moving from a LARGER type to a SMALLER type.
        // You MUST do this manually using (type) parentheses.
        double price = 199.99;
        int roundedPrice = (int) price; // Manually forcing double into int
        
        System.out.println("\n--- Narrowing ---");
        System.out.println("Original Price: " + price);
        System.out.println("Casted Int: " + roundedPrice); // Output: 199
        // Note: The .99 is simply chopped off (Truncated), not rounded!

        // --- 3. AUTOMATIC TYPE PROMOTION ---
        // Rule: In math expressions, Java promotes types to the largest one involved.
        byte a = 40;
        byte b = 50;
        byte c = 100;
        
        // Even though a, b, and c are bytes, the math (a * b) 
        // exceeds byte range (-128 to 127). Java promotes them to INT.
        int result = a * b / c; 
        
        System.out.println("\n--- Type Promotion ---");
        System.out.println("Result of (40 * 50 / 100): " + result); 
    }
}