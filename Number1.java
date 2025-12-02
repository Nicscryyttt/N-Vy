public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number < 1 || number > 100) {
            System.out.print("Enter a number between 1 and 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 1 || number > 100) {
                    System.out.println("Number out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        System.out.println("Thank you! You entered " + number);
        scanner.close();
    }
}
