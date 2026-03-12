public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop when i is even
            }
            System.out.println(i); // This will only print odd numbers
        }
        System.out.println("Loop completed.");
    }
}
