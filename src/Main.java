import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Glass[] glasses;

        // Obtain input
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please input the colors in the order of top to bottom from top left cup to bottom right:");

        String inputColors = myObj.nextLine();  // Read user input
        if (!inputColors.isEmpty() && inputColors.length() % 4 == 0){
            int numGlasses = inputColors.length()/4;
            glasses = new Glass[numGlasses];

            for (int i = 0; i < numGlasses; i++) {  // Create glasses from input
                glasses[i] = new Glass(inputColors.charAt(i*4),inputColors.charAt(i*4+1),
                                        inputColors.charAt(i*4+2),(inputColors.charAt(i*4+3)));
            }

            for (int i = 0; i < glasses.length; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.println(((char)glasses[i].getColors()[j]));
                }
                System.out.println();
            }
        }


        System.out.println();
    }
}