import java.util.Stack;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            stack.push(scanner.nextInt());
        }
        System.out.println();

        while (!stack.isEmpty()) {
            if (stack.size() >= 2 && stack.peek().equals(stack.get(stack.size() - 2))) {
                System.out.print(stack.pop() + ", ");
                stack.pop();
            }
            else {
                System.out.print(stack.pop() + ", ");
            }
        }
    }
}