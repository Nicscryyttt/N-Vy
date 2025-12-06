import javax.swing.*;

public class Veloz11 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 1, 9, 7};
        String result = "";

        for (int i = 0; i < arr.length; i += 2) {
            result += arr[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Even-index elements:\n" + result);
    }
}
