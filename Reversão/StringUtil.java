package Reversão;

public class StringUtil {

    public static String inverso(String palavra) {

        StringBuilder sb = new StringBuilder();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            sb.append(palavra.charAt(i));
        }

        return sb.toString();
    }
}