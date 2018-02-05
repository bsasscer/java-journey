public class PezBuilder {

    public static void main(String[] args) {
        System.out.println("We are making a new PEZ Dispenser");
        PezDispenser dispenser = new PezDispenser("Chewbaca");
        System.out.printf("The dispenser is %s %n",
                            dispenser.getCharacterName()
                        );
        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispenser with PEZ...");
        dispenser.fill();
        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }

        while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ");
        }
        try {
            dispenser.fill(400);
        } catch(IllegalArgumentException iae) {
            System.out.println("Whoa there.");
            System.out.printf("The error was %s",
                            iae.getMessage());
        }
    }
}
