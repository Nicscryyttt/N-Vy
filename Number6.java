public static void main(String[] args) {
        int[] arr = {3, 4, 7, 2, 9, 6};

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }

        double average = 0;
        if (count != 0) {
            average = (double) sum / count;
        }

        System.out.println("Average of odd numbers: " + average);
    }
}
