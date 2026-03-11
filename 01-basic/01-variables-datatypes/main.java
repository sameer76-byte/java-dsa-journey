/**
 * Standard Naming Convention: Class names should typically start 
 * with an Uppercase letter (e.g., Public class Main).
 */
public class main { 
    // The entry point of the program where execution begins
    public static void main(String[] args) {
        
        // --- VARIABLE DECLARATIONS ---
        
        // 'name' is a Reference Variable stored in the STACK.
        // The actual text "John" is an Object stored in the HEAP (String Pool).
        String name = "John"; 
        
        // Primitives: These values are stored directly in the STACK memory.
        int age = 30;             // Integer (4 bytes)
        double height = 1.75;     // Double precision floating point (8 bytes)
        boolean isStudent = true; // Boolean (1 bit of information)

        // --- OUTPUT SECTION ---
        
        // System.out.println prints the data followed by a new line.
        // We use the '+' operator to concatenate (join) strings with variables.
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
    }
}