public static void main(String[] args) {
        int[] arr = {-5, 3, -7, 2, -9};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }

        System.out.print("Array with all positive values: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
