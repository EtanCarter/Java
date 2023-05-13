public class lineCheck {
    public static String convert(String input) {
        int big = 0;
        int small = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                big++;
            } else if (Character.isLowerCase(c)) {
                small++;
            }
        }
        if (big > small) {
            return input.toUpperCase();
        } else if (small > big) {
            return input.toLowerCase();
        } else {
            return input.toLowerCase();
        }
    }
}
