public class ReturnExample {
    public static void main(String[] args) {
        int age = 15;

        System.out.println("Checking age for driving license...");

        if (age < 18) {
            System.out.println("Error: You must be 18 or older.");
            return; // The program STOPS here. The lines below will NEVER run.
        }

        // This part only runs if the 'return' above was NOT triggered
        System.out.println("Access Granted! You can apply for a license.");
    }
}