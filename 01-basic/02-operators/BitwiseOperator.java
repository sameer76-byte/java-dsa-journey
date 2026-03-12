public class BitwiseOperator {
    public static void main(String[] args) {
        // --- 1. BITWISE AND (&) ---
        int a = 5;  // In binary: 0101
        int b = 3;  // In binary: 0011
        int andResult = a & b; // Result is 1 (0001 in binary)
        System.out.println("Bitwise AND (5 & 3): " + andResult); // Output: 1

        // --- 2. BITWISE OR (|) ---
        int orResult = a | b; // Result is 7 (0111 in binary)
        System.out.println("Bitwise OR (5 | 3): " + orResult); // Output: 7

        // --- 3. BITWISE XOR (^) ---
        int xorResult = a ^ b; // Result is 6 (0110 in binary)
        System.out.println("Bitwise XOR (5 ^ 3): " + xorResult); // Output: 6

        // --- 4. BITWISE NOT (~) ---
        int notResult = ~a; // Result is -6 (in two's complement, ~0101 is 1010)
        System.out.println("Bitwise NOT (~5): " + notResult); // Output: -6

        // --- 5. LEFT SHIFT (<<) ---
        int leftShiftResult = a << 1; // Shift left by 1 bit: Result is 10 (1010 in binary)
        System.out.println("Left Shift (5 << 1): " + leftShiftResult); // Output: 10

        // --- 6. RIGHT SHIFT (>>) ---
        int rightShiftResult = a >> 1; // Shift right by 1 bit: Result is 2 (0010 in binary)
        System.out.println("Right Shift (5 >> 1): " + rightShiftResult); // Output: 2

        // --- 7. UNSIGNED RIGHT SHIFT (>>>) ---
        int unsignedRightShiftResult = a >>> 1; // Shift right by 1 bit without sign extension
        System.out.println("Unsigned Right Shift (5 >>> 1): " + unsignedRightShiftResult); // Output: 2
    }
}
