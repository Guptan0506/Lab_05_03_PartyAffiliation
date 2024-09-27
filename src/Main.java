import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your party affiliation [Democrat(D), Republican(R), Indepedent(I)]?");
        Scanner in = new Scanner(System.in);
        String partyAffiliation;
        partyAffiliation = in.nextLine();
        if (Objects.equals(partyAffiliation, "D")) {
            System.out.println("You get a Democratic Donkey");
        }
        else if (Objects.equals(partyAffiliation, "R")) {
            System.out.println("You get a Republican Elephant");
        }
        else if (Objects.equals(partyAffiliation, "I")) {
            System.out.println("You get a Person");
        }
        else {
            System.out.println("You get Other");
        }
    }
}