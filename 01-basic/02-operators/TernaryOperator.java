public class TernaryOperator {
    public static void main(String[] args) {
        // --- 1. TERNARY OPERATOR (?:) ---
        // Syntax: condition ? valueIfTrue : valueIfFalse
        int age = 20;
        
        // Using ternary operator to determine if someone is an adult
        String result = (age >= 18) ? "Adult" : "Minor";
        
        System.out.println("Age: " + age);
        System.out.println("Result: " + result); // Output: Adult

        // Another example with a different age
        age = 16;
        result = (age >= 18) ? "Adult" : "Minor";
        
        System.out.println("\nAge: " + age);
        System.out.println("Result: " + result); // Output: Minor
    }
}
