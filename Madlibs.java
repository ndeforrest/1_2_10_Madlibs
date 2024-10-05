import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String madlibFull = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";   //madlib 1 of 3
        //String madlibFull = "Once upon a time in a <adjective> land, a <noun> <adjective> grew.";     //madlib 2 of 3
        //String madlibFull = "<name> was very <adjective> today, so they went to <place>!";   //madlib 3 of 3

        int indexLeft1 = madlibFull.indexOf("<");   //find indexes for first word
        int indexRight1 = madlibFull.indexOf(">");
        String part1 = madlibFull.substring(0, indexLeft1);     //find first section before first word
        String partExtra1 = madlibFull.substring(indexRight1+1);        //find section after first word to be able to find indexes of 2nd+ word
        String partReference1 = madlibFull.substring(0,(indexRight1 + 1));      //Find length of start to end of first word to calculate index of 2nd+ word

        int indexLeft2 = partExtra1.indexOf("<") + partReference1.length();     //find indexes for second word
        int indexRight2 = partExtra1.indexOf(">") + partReference1.length();
        String part2 = madlibFull.substring(indexRight1+1, indexLeft2);         //find first section before first word
        String partExtra2 = madlibFull.substring(indexRight2+1);            //find section after first word to be able to find indexes of 3rd word
        String partReference2 = madlibFull.substring(0, (indexRight2 + 1));         //Find length of start to end of first word to calculate index of 3rd word

        int indexLeft3 = partExtra2.indexOf("<") + partReference2.length();     //find indexes of third word
        int indexRight3 = partExtra2.indexOf(">") + partReference2.length();
        String part3 = madlibFull.substring(indexRight2+1, indexLeft3);         //find part 3 section
        String part4 = madlibFull.substring(indexRight3+1);         //part 4, last section

        String word1 = madlibFull.substring(indexLeft1+1, indexRight1);     //grammar words
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

        System.out.println(part1 + inputWord1 + part2 + inputWord2 + part3 + inputWord3 + part4);       //Final
    }
}