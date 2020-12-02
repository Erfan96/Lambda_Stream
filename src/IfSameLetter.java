import java.util.Scanner;

public class IfSameLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please write a word...");
        Word word = (w) -> w.toLowerCase().startsWith
                (String.valueOf(w.charAt(w.length() - 1)).toLowerCase());
        System.out.println("Word starts and ends with the same letter : \n"
                + word.ifSame(s.next()));
    }

    private interface Word{
        Boolean ifSame(String str);
    }
}
