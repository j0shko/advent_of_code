public class Zad1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Invalid input");
            return;
        }
        char[] input = args[0].toCharArray();

        int sum1 = solveCaptcha(input, 1);
        int sum2 = solveCaptcha(input, input.length / 2);

        System.out.println("Part 1 : " + sum1);
        System.out.println("Part 2 : " + sum2);
    }

    private static int solveCaptcha(char[] input, int distance) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            char first = input[i];
            char second = input[(i + distance) % input.length];
            if (first == second) {
                sum += first - 48;
            }
        }
        return sum;
    }
}