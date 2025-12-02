public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 9};
        int target = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at index " + i);
                break;
            }
        }
    }
}
