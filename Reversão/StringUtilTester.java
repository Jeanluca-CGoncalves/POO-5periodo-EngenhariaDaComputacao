package Reversão;

public class StringUtilTester {

    public static void main(String[] args) {

        String palavra = "Jeanluca";

        String inverso = StringUtil.inverso(palavra);

        System.out.println("Original: " + palavra);
        System.out.println("Invertida: " + inverso);
    }
}