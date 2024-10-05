import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String madlibFull = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        //String madlibFull = "Once upon a time in a <adjective> land, a <noun> <adjective> grew.";
        String madlibFull = "<name> was very <adjective> today, so they went to <place>!";

        int indexLeft1 = madlibFull.indexOf("<");
        int indexRight1 = madlibFull.indexOf(">");
        String part1 = madlibFull.substring(0, indexLeft1);
        String partExtra1 = madlibFull.substring(indexRight1+1);
        String partReference1 = madlibFull.substring(0,(indexRight1 + 1));

        int indexLeft2 = partExtra1.indexOf("<") + partReference1.length();
        int indexRight2 = partExtra1.indexOf(">") + partReference1.length();
        String part2 = madlibFull.substring(indexRight1+1, indexLeft2);
        String partExtra2 = madlibFull.substring(indexRight2+1);
        String partReference2 = madlibFull.substring(0, (indexRight2 + 1));

        int indexLeft3 = partExtra2.indexOf("<") + partReference2.length();
        int indexRight3 = partExtra2.indexOf(">") + partReference2.length();
        String part3 = madlibFull.substring(indexRight2+1, indexLeft3);
        String part4 = madlibFull.substring(indexRight3+1);

        String word1 = madlibFull.substring(indexLeft1+1, indexRight1);
        String word2 = madlibFull.substring(indexLeft2+1, indexRight2);
        String word3 = madlibFull.substring(indexLeft3+1, indexRight3);

        System.out.println("Here's a MadLib for you!");
        System.out.println("Please give me a " + word1 + ":");
        String inputWord1 = scanner.nextLine();
        System.out.println("Thanks! Next, a " + word2 + ":");
        String inputWord2 = scanner.nextLine();
        System.out.println("Finally, a " + word3 + ":");
        String inputWord3 = scanner.nextLine();
        System.out.println("Developing MadLib...");

        System.out.println(part1 + inputWord1 + part2 + inputWord2 + part3 + inputWord3 + part4);
    }
}