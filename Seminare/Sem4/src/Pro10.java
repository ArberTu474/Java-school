// The Monty Hall Paradox. Marilyn vos Savant described the following problem
// (loosely based on a game show hosted by Monty Hall) in a popular magazine: “Sup­
// pose you’re on a game show, and you’re given the choice of three doors: Behind one
// door is a car; behind the others, goats. You pick a door, say No. 1, and the host, who
// knows what’s behind the doors, opens another door, say No. 3, which has a goat.
// He then says to you, “Do you want to pick door No. 2?” Is it to your advantage to
// switch your choice?”
// Ms. vos Savant proved that it is to your advantage, but many of her readers, includ­
// ing some mathematics professors, disagreed, arguing that the probability would not
// change because another door was opened.

// Your task is to simulate this game show. In each iteration, ran­domly pick a door
// number between 1 and 3 for placing the car. Randomly have the player pick a door.
// Randomly have the game show host pick a door having a goat (but not the door that
// the player picked). Increment a counter for strategy 1 if the player wins by switching
// to the host’s choice, and increment a counter for strategy 2 if the player wins by
// sticking with the orig­inal choice. Run 1,000 iterations and print both counters.

import java.util.Random;

public class Pro10 {
    public static void main(String[] args) {
        final int ITERATIONS = 1_000_000;
        Random random = new Random();

        int winningBySwitching = 0;
        int winningByStaying = 0;

        for (int i = 0; i < ITERATIONS; i++) {
            int winningDoor = random.nextInt(3 - 1 + 1) + 1;

            int playersPick = random.nextInt(3 - 1 + 1) + 1;

            // String avaiableDoors = "123";

            // if (winningDoor == playersPick) {
            //     if (avaiableDoors.contains(Integer.toString(winningDoor))) {
            //         avaiableDoors = avaiableDoors.replace(Integer.toString(winningDoor), "");
            //     }
            // } else if (winningDoor != playersPick) {
            //     avaiableDoors = avaiableDoors.replace(Integer.toString(winningDoor), "");
            //     avaiableDoors = avaiableDoors.replace(Integer.toString(playersPick), "");
            // }

            // you switch your door
            if (winningDoor != playersPick) {
                winningBySwitching++;
            } else {
                winningByStaying++;
            }
        }

        System.out.printf("Wining by switching: %d (%.2f%%)\n", winningBySwitching,
                (double) winningBySwitching / ITERATIONS * 100);
        System.out.printf("Wining by staying: %d (%.2f%%)\n", winningByStaying,
                (double) winningByStaying / ITERATIONS * 100);

    }
}
