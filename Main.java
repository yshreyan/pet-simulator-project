import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pet statistics
        int happiness = 10;
        int hunger = 10;
        int energy = 10;

        // Keeps the game running
        boolean playing = true;

        System.out.println("🐶 Welcome to the Pet Simulator! 🐶");
        System.out.println();

        while (playing) {

            // Show current stats
            System.out.println("-------------------------");
            System.out.println("Happiness: " + happiness);
            System.out.println("Hunger: " + hunger);
            System.out.println("Energy: " + energy);
            System.out.println("-------------------------");

            // Ask for an action
            System.out.println("What's your next action?");
            System.out.println("p = Play 🎾");
            System.out.println("e = Eat 🍗");
            System.out.println("s = Sleep 😴");
            System.out.println("q = Quit 🚪");

            String action = scanner.nextLine();

            // Play
            if (action.equals("p")) {

                happiness = happiness + 2;
                hunger = hunger - 2;
                energy = energy - 2;

                System.out.println("You played with your pet! 🎾");

            // Eat
            } else if (action.equals("e")) {

                hunger = hunger + 3;
                energy = energy - 1;

                System.out.println("Your pet ate some food! 🍗");

            // Sleep
            } else if (action.equals("s")) {

                energy = energy + 5;
                hunger = hunger - 1;

                System.out.println("Your pet took a nap! 😴");

            // Quit
            } else if (action.equals("q")) {

                playing = false;

                System.out.println("Thanks for playing! 👋");

            // Invalid command
            } else {

                System.out.println("That's not a valid action!");
            }
        }

        scanner.close();
    }
}