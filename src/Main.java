import java.util.ArrayList;
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
        if (inputColors.isEmpty()) {
            System.out.println("Please input the colors in the order of top to bottom from top left cup to bottom " +
                    "right:");
            inputColors = myObj.nextLine();  // Read user input
        } else {
            if (inputColors.length() % 4 != 0) {
                System.out.println("re-enter the input, not evenly divisible by 4:");
                inputColors = myObj.nextLine();  // Read user input
            } else {


                int numFilledGlasses = (inputColors.length() / 4);
                glasses = new Glass[numFilledGlasses + 2]; // +2 for 2 empty glasses

                for (int i = 0; i < numFilledGlasses; i++) {  // Create glasses from input
                    glasses[i] = new Glass(inputColors.charAt(i * 4), inputColors.charAt(i * 4 + 1),
                            inputColors.charAt(i * 4 + 2), (inputColors.charAt(i * 4 + 3)));
                }
                // Create the two empty glass at the end
                glasses[numFilledGlasses] = new Glass();
                glasses[numFilledGlasses + 1] = new Glass();

                //TEST TODO: DELETE Output all possible moves for round 1
                for (int i = 0; i < glasses.length; i++) {
                    ArrayList<Integer> moves = getMoves(glasses[i], i, glasses);
                    for (int j = 0; j < moves.size() - 2; j += 2) {
                        System.out.println("Glass " + moves.get(j) + " to glass " + moves.get(j + 1) + ".\n");
                    }
                }

                for (Glass glass : glasses) { // Print all the glass to test TODO: DELETE
                    for (int j = 0; j < 4; j++) {
                        System.out.println(((char) glass.getColors()[j]));
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    // Intake a glass and glasses and determine all possible moves for said glass
    public static ArrayList<Integer> getMoves(Glass _glass, int glassi, Glass[] _glasses) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        if (_glass.getTopColor() != 0) {
            for (int i = 0; i < _glasses.length; i++) {

                if (i == glassi){
                    i++;
                    continue;
                }
                if (_glasses[i].hasOpenSlot() && _glass.getTopColor() == _glasses[i].getTopColor()) {
                    output.add(glassi);
                    output.add(i);
                }
            }
        }
        return output;
    }
}