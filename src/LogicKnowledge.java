import java.util.Scanner;

public class LogicKnowledge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        System.out.print("Enter a third number: ");
        int c = scanner.nextInt();

        int result = greenTicket(a, b, c);
        System.out.println("Result: " + result);

        System.out.print("Enter the number of 1 pound chocolate bars (small): ");
        int small = scanner.nextInt();

        System.out.print("Enter the number of 5 pound chocolate bars (large): ");
        int large = scanner.nextInt();

        System.out.print("Enter the total number of pounds needed to sell (goal): ");
        int goal = scanner.nextInt();

        int resultChocolate = makeChocolate(small, large, goal);
        System.out.println("Result of makeChocolate: " + resultChocolate);
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int makeChocolate(int small, int large, int goal) {
        int maxLargeBars = goal / 5;
        int remainingGoal;

        if (large >= maxLargeBars) {
            remainingGoal = goal - (maxLargeBars * 5);
        } else {
            remainingGoal = goal - (large * 5);
        }

        if (remainingGoal <= small) {
            return remainingGoal;
        } else {
            return -1;
        }
    }
}
