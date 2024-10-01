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
    }
}