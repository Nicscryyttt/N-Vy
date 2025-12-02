   public static void main(String[] args) {

        int[] arr = {1, 7, 3, 7, 5, 6, 7, 8, 9, 7};

        int target = 7;

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTarget: " + target);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " appears " + count + " times.");
    }
}
