import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.reverse;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an input");
        String word = scanner.nextLine();
        System.out.println(isNumeric(word));
        System.out.println(StringUtils.swapCase(word));
        System.out.println(reverse(word));
    }
}
