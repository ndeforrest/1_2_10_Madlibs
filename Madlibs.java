import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String madlibFull = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        //madlibFull = "Once upon a time in a <adjective> land, a <noun> <adjective> grew.";
        //madlibFull = "<name> was very <adjective> today, so they went to <place>";

        int indexLeft1 = madlibFull.indexOf("<");
        int indexRight1 = madlibFull.indexOf(">");
        String part1 = madlibFull.substring(0, indexLeft1);
        String partBad1 = madlibFull.substring(indexLeft1);
        int indexLeft2 = partBad1.indexOf("<");
        int indexRight2 = partBad1.indexOf(">");
        String part2 = madlibFull.substring(indexRight1, indexLeft2);
        String partBad2 = madlibFull.substring(indexRight2);
        int indexLeft3 = partBad2.indexOf("<");
        int indexRight3 = partBad2.indexOf(">");
        String part3 = madlibFull.substring(indexRight2, indexLeft3);
        String part4 = madlibFull.substring(indexRight3);

        String word1 = madlibFull.substring(indexLeft1, (indexRight1-1));
        String word2 = madlibFull.substring(indexLeft2, (indexRight2-1));
        String word3 = madlibFull.substring(indexLeft3, (indexRight3-1));

        System.out.println("Here's a MadLib for you!");
        System.out.println("Please give me a " + word1);
        String inputWord1 = scanner.nextLine();
        System.out.println("Thanks! Next, a " + word2);
        String inputWord2 = scanner.nextLine();
        System.out.println("Finally, a " + word3);
        String inputWord3 = scanner.nextLine();
        System.out.println("Developing MadLib...");
        



    }
}