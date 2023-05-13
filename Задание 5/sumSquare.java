public class sumSquare {
    private static final int PIP = 2;
    public static int transformation(String usersText) {
        int fin;
        int sum = 0;
        double square;
        for (int i = 0; i < usersText.length(); i++) {
            if (usersText.charAt(i) != ' ') {
                fin = Character.getNumericValue(usersText.charAt(i));
                square = Math.pow( fin, PIP);
                sum += square;
            }
        }
        return sum;
    }
}
