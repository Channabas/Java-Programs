public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Poornima";
        int[] freq = new int[128];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.print((char)i);
            }

        }
    }
}
