import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        boolean result = endOther(a, b);

        System.out.println("Result: " + result);

        System.out.print("Enter the string to test: ");
        String toTest = scanner.nextLine();

        boolean resultEndOther = endOther(a, b);
        boolean resultFindRepeats = findRepeats(toTest);

        System.out.println("Result of endOther: " + resultEndOther);
        System.out.println("Result of findRepeats: " + resultFindRepeats);
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    public static boolean findRepeats(String toTest) {
        for (int i = 0; i < toTest.length() - 1; i++) {
            for (int j = i + 2; j <= toTest.length(); j++) {
                String substring = toTest.substring(i, j);
                int firstIndex = toTest.indexOf(substring);
                int lastIndex = toTest.lastIndexOf(substring);

                if (firstIndex != lastIndex) {
                    return true;
                }
            }
        }
        return false;
    }

}
