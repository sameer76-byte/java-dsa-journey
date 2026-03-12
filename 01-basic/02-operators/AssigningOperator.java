public class AssigningOperator {
    public static void main(String[] args) {
        // --- 1. ASSIGNMENT (=) ---
        int x = 10; // Assigning the value 10 to variable x
        System.out.println("Initial value of x: " + x); // Output: 10

        // --- 2. COMPOUND ASSIGNMENT (+=, -=, *=, /=, %=) ---
        x += 5; // Equivalent to x = x + 5
        System.out.println("After x += 5: " + x); // Output: 15

        x -= 3; // Equivalent to x = x - 3
        System.out.println("After x -= 3: " + x); // Output: 12

        x *= 2; // Equivalent to x = x * 2
        System.out.println("After x *= 2: " + x); // Output: 24

        x /= 4; // Equivalent to x = x / 4
        System.out.println("After x /= 4: " + x); // Output: 6

        x %= 4; // Equivalent to x = x % 4
        System.out.println("After x %= 4: " + x); // Output: 2
    }
}
