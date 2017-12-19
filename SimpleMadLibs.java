import java.io.Console;

public class SimpleMadLibs {

    public static void main(String[] args) {
        //__Name__ is a __adjective__ __noun__. She is always __adverb__ __verb__.
        Console console = System.console();
        String ageAsString = console.readLine("How old are you? ");
        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            console.printf("You need to be 13 years old to access this program.\n");
            System.exit(0);
        }
        String name = console.readLine("Enter your name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Enter a noun: ");
            isInvalidWord = (noun.equalsIgnoreCase("dork") ||
                            noun.equalsIgnoreCase("jerk"));
            if (isInvalidWord) {
                console.printf("That language is not allowed. Try again. \n\n");
            }
        } while (isInvalidWord);
        String adverb = console.readLine("Enter an adverb: ");
        String verb = console.readLine("Enter a verb ending in -ing: ");

        console.printf("Your SimpleMadLibs: \n--------------\n");
        console.printf("%s is a very %s %s. ", name, adjective, noun);
        console.printf("They are always %s %s. \n", adverb, verb);
    }
}
