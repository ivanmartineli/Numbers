package numeros;

/**
 *
 * @author ivan
 */
public class Numbers {

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 12;

        calc(num1, num2);

    }

    private static int calc(int a, int b) {

        String sumNum = "";
        String num1Length = Integer.toString(a);
        String num2Length = Integer.toString(b);

        int maxNum = Math.max(num1Length.length(), num2Length.length());

        for (int i = 0; i <= maxNum; i++) {
            if (i < num1Length.length()) {
                sumNum += num1Length.charAt(i);
            }
            if (i < num2Length.length()) {
                sumNum += num2Length.charAt(i);
            }
        }

        if (sumNum.length() > 1000000) {
            return -1;
        } else {

            return Integer.parseInt(sumNum);
        }

    }

}
