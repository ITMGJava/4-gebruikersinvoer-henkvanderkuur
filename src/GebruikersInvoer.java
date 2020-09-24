import java.util.Scanner;

public class GebruikersInvoer {
    public static void main(String[] args) {
        System.out.println("Voer een woord in, dan gaan de lengte bepalen: ");
        var woordinvoer = new Scanner(System.in);
        var woord = woordinvoer.next();
        System.out.println("De lengte van het woord \""+woord+"\" is: "+woord.length()+" karakters.");
        System.out.println();
        System.out.println();

        System.out.println("Voer nu je leeftijd in: ");

        var getalinvoer = new Scanner(System.in);
        var leeftijd = getalinvoer.nextInt();
        leeftijd = leeftijd + 4;
        System.out.println("Hmmm dat betwijfel ik, je bent waarschijnlijk: "+leeftijd+" :-)");
        System.out.println();
        System.out.println();

        System.out.println("Voer een getal in, dan gaan we het vermenigvuldigen: ");
        var getal = new Scanner(System.in);
        var tafel = getal.nextInt();
        System.out.println("Dit is de tafel van: "+tafel);
        var b = tafel * 2;
        var c = tafel * 3;
        var d = tafel * 4;
        var e = tafel * 5;
        var f = tafel * 6;
        var g = tafel * 7;
        var h = tafel * 8;
        var i = tafel * 9;
        var j = tafel * 10;
        System.out.println("1 x "+tafel+" = "+tafel);
        System.out.println("2 x "+tafel+" = "+b);
        System.out.println("3 x "+tafel+" = "+c);
        System.out.println("4 x "+tafel+" = "+d);
        System.out.println("5 x "+tafel+" = "+e);
        System.out.println("6 x "+tafel+" = "+f);
        System.out.println("7 x "+tafel+" = "+g);
        System.out.println("8 x "+tafel+" = "+h);
        System.out.println("9 x "+tafel+" = "+i);
        System.out.println("10 x "+tafel+" = "+j);
        System.out.println();
        System.out.println("THANKS!");
    }

}
