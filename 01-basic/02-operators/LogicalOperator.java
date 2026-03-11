
// # Logical Operators: The "Decision Makers"

// Logical operators allow a program to combine multiple conditions to make a single decision. They always return a `boolean` result (`true` or `false`).

// ## 1. The Three Basic Operators

// | Operator | Name | Logic                               | Analogy |
// |----------|------|-------------------------------------|---------|
// | `&&`     | AND  | `true` only if **BOTH** are true.   | You need a Ticket **AND** an ID to enter. |
// | `||`     | OR   | `true` if **AT LEAST ONE** is true. | You can pay with Cash **OR** a Card. |
// | `!`      | NOT  | Flips the value (**Opposite**).     | If it's **NOT** raining, we go out. |
public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // AND
        boolean andResult = a && b;
        // OR
        boolean orResult = a || b;
        // NOT
        boolean notResult = !a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a AND b: " + andResult);
        System.out.println("a OR b: " + orResult);
        System.out.println("NOT a: " + notResult);
    }
}
