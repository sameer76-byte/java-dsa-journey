public class ReturnExampleWithFunction {
    public static void main(String[] args) {
        int result = calculateSum(5);
        System.out.println("The sum of numbers from 1 to 5 is: " + result);
    }

    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0; // Return 0 for non-positive numbers
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add i to sum
        }
        return sum; // Return the calculated sum
    }
}
