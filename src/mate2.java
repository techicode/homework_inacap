public class mate2 {
    public static void main(String[] args) {
        for (int n = 1; ; n++) {
            int x = n + 2;
            int y = n;
            int total = (x * y);

            if (total == 399) {
                System.out.println(n);
                break;
            }
        }
    }
}