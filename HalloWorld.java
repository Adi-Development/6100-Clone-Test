import java.util.*;

public class HalloWorld {


    private static String Hallo() {
        int[] numbers = {72, 97, 108, 111, 32};
        int selectedNum = 0;
        int counter = 0;
        char[] hallo = new char[5];
        String letters = "";

        while (counter < 5) {
            while (selectedNum != numbers[counter]) {
                selectedNum++;
            }
            hallo[counter] = (char) selectedNum;
            counter++;
        }


        for (char i: hallo) {
                letters = letters + Character.toString(i);
                if (i == 108){
                    letters = letters + Character.toString(i);
                }
            }
        /*
        for (int i = 0; i < hallo.length; ) {
            i = i;
            if (i == 2) {
                letters = letters + Character.toString(hallo[i]);
            } else {
                letters = letters + Character.toString(hallo[i]);
                i++;
            }
        }
        */
        return letters;
    }

    private static String World() {
        int[] numbers = {87, 111, 114, 108, 100};
        int i = 0;
        int n;
        String world = "";
        char[] letters = new char[5];
        Scanner readnum = new Scanner(System.in);

        while (true) {
            System.out.println("enter a number between 1-9: ");
            n = readnum.nextInt();
            if ((n > 0) && (n < 9)) {
                System.out.println("you chose: " + n);
                break;
            } else {}
        }
        readnum.close();

        // This part is pure shit!
        for (int ennumerate : numbers) {
            if ((n % 2) == 0) {
                System.out.println("the number is even! " + n);
                while (n != ennumerate) {
                    n++;
                }
            } else {
                System.out.println("the number is odd " + n);
                while (n != ennumerate) {
                    n++;
                }
            }
            letters[i] = (char) n;
            i++;
        }
        for (char characters : letters) {
            world = world + Character.toString(characters);
        }

        return world;
    }

    public static void main(String[] args) {
        System.out.println(Hallo() + World());
    }
}