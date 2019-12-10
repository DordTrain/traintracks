

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class City extends Main {
    static boolean cactus = false;
    public static void city() throws InterruptedException {
        cont();
        talk("The sun is directly overhead, the heat is excruciating");
        talk("You toss your " + user.inv.get(0).name + " and catch it over and over.");
        talk("The city feels like it's getting farther and farther away.");
        cont();
        talk("The cry of vultures circle above as your energy drains.");
        talk("Your mouth is more dry now, the taste of saliva plagues your mind.");
        talk("You need to find water.");
        cont();
        talk("You could check the cacti, which might have water inside them.");
        talk("Or you could wait it out, the city might be closer than you think.");
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while (repeat == true) {
            talk("You can (a) check cacti, or (b) continue to city: ");
            String a2 = scan.nextLine();
            //CACTUS CUTTING MINIGAME

            if (a2.toLowerCase().equals("a")) {
                cactus = true;
                talk("The cacti look more appealing now, you grab your " + user.inv.get(0).name + " and run to a cactus.");
                Random rand = new Random();

                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    if (rand.nextInt(8) > 5) {
                        talk("WATER! You pick up the sliced cactus and drink the liquid.");
                        user.setWater(user.getWater() + 1);
                    } else {
                        talk("No water, you get thirstier");
                        user.setWater(user.getWater() - 2);

                    }
                    if (i == 5) {
                        talk("You put away your " + user.inv.get(0).name + " and clean the sand off your coat.");
                    } else {
                        talk("You run to another cactus");

                    }
                }
                if (user.getWater() <= 0) {
                    talk("So thirsty...");
                    talk("So thirsty...");
                    talk("So thirsty...");
                    talk("You pass out from lack of water, never to wake up again.");
                    exit();

                } else if ((user.getWater() <= 7) & (user.getWater() >= 1)) {
                    talk("You are so thirsty, your mouth tastes foul.");
                    talk("You hang on to life and continue to travel.");
                } else if ((user.getWater() <= 14) & (user.getWater() <= 8)) {
                    talk("You are thirsty, but able to continue.");
                    talk("You should probably drink water as soon as you get to the city.");
                } else if ((user.getWater() >= 15)) {
                    cont();
                    talk("You got enough.");
                    talk("You continue on your way.");
                } else {
                    talk("");
                    talk("You feel refreshed!");
                    talk("You happily skip to the city, as it gets closer and closer.");
                }


                repeat = false;
            } else if (a2.toLowerCase().equals("b")) {
                talk("You ignore your call to water and keep walking.");
                repeat = false;
            } else {
                talk("Please pick an option given.");
                repeat = true;
            }
        }
            cont();

            //continue

            talk("Hours pass, the sun creeps further towards the horizon, dropping the temperature.");
            if (user.getWater()>=10) {
                talk("You feel hydrated, if you could call it that.");
                cont();
            }
            else {
                talk("Your mouth is even more dry now, water is only what you think of.");
                cont();
            }

            talk("You drag your limbs like dead weight, you didn't even notice the rising wall of stone in front of you.");
            talk("A large stone brick wall peers over you, its vines hanging down, marks of wars past plastered on it.");
            cont();
            jotalk("Hello down there, welcome to the city of Norwich!");
            talk("You look up, a guard is looking from his tower, in full chainmail armor.");
            talk("The blinding sun is blocking your view, you can't get a good look at him");
            cont();
            jotalk("You need water, right? I saw you coming for a couple miles.");
            if (cactus == true) {
                jotalk("I laughed so hard when you sliced those cacti, pretty sure you were going crazy.");
                talk("He wiped a tear from his eye.");
            }
            else {
                jotalk("You just kept walking, I was waiting for something to happen.");
            }
            cont();
            jotalk("Oh right, you wanna come in. The King is very strict, he will decide if you enter.");
            jotalk("I will have to persuade him, it will be tough,");
            jotalk("Just a second!");
            cont();
            talk("You can't hide the fact this is a little weird, but you need water so badly.");
            talk("The sound of blowing sand and tossing tumbleweeds ring in the air.");
            talk("You can see the top of his chain helmet, it pokes over the cutout in the tower.");
            cont();
            talk("His head bobs and he jumps back up, his expression quickly turning grim again.");
            jotalk("The King reluctantly agrees, but you must follow the rules of the kingdom!");
            jotalk("The gates will open in just a minute, let me call the gatekeeper.");
            jotalk("GATEKEEPER! WAKE UP!");
            cont();
            talk("The clank of chain is heard over the blowing sand, then the loud sound of a person falling down a flight of stairs.");
            talk("The man muffles his pain, running to the gate.");
            jotalk("Okay beautiful and amazing and wonderful Guard, I am opening the gate! ");
            System.out.print("The man said in a deeper tone than before.");
            talk("You begin the doubt the legitimacy of this guard.");
            cont();
            talk("A scream resounds, blistering your ear, the stone wall swallows itself as it splits open.");
            talk("The crack rips open, standing there is the guard, sweating out of his armor, hands on his knees.");
            talk("He was a younger man, mid 30's, heavy set with a long beard covering his face, you could see a bright shirt under his armor.");
            cont();
            jotalk("Hello weary traveler! I am the guard, and the king, and the gatekeeper, and well... everyone.");
            jotalk("Sorry if you we're expecting more, it's just me! I decided to drop the act, figured you'd notice.");
            talk("You weren't really expecting this, just one guy, that's weird.");
            cont();


            repeat = true;
            while (repeat == true) {
                talk("You can (a) go into the city, or (b) leave him.");
                String a3 = scan.nextLine();
                if (a3.toLowerCase().equals("a")) {
                    repeat = false;
                }
                else if (a3.toLowerCase().equals("b")) {
                    talk("You look dead in his eyes and shake your head. He frowns and you turn away.");
                    jotalk("You don't wanna come inside? We got water!");
                    cont();
                    talk("His voice trails off, you are already too far gone...");
                    talk("Too far gone...");
                    talk("Conciousness slips out of your grasp.");
                    exit();
                    repeat = false;
                }
                else {
                    talk("Please pick an option given.");
                    repeat = true;
                }
            }
            talk("You accept his offer and move into the gates.");
            talk("The blinding screech of the gates closing is heard behind, ending it's performance with a loud bang.");
            talk("You take off your shoes, the cold stone ground healing your crumpled feet.");
            cont();
            talk("The city was a square, with walls roughly 50 feet up, guard towers spiking up from each corner.");
            talk("Off to the left a large castle stood, with a main tower and 2 others standing behind.");
            talk("Opposite to the castle, a large food garden was planted, the brick floor tore open to yield the crops.");
            cont();
            jotalk("This is where I live, I love it.");
            talk("He said motioning to the grand castle.");
            jotalk("It's kind of lonely, but I don't mind.");
            talk("He swiveled on his heel until facing you. He sighed, motioning that he finished his tour.");
            cont();
            jotalk("You don't say much do you? I'm Joseph by the way.");
            talk("He brightly extended a hand, his chain armor overlapping each other.");

            repeat = true;
            while (repeat==true) {
                talk("You can (a) return the gesture, or (b) reject his handshake: ");
                String a4 = scan.nextLine();
                if (a4.toLowerCase().equals("a")) {
                    talk("You meet your hand to his, giving it a good shake.");
                    talk("He smiles and nods.");
                    jotalk("You can sleep in the castle, I have an extra room.");
                    cont();
                    talk("He jogs to the lever in front of the castle gates and cranks it open.");
                    talk("The walls of the castle creak open and reveal a stunning interior.");
                    jotalk("Follow me, I'll get you to your room.");
                    utalk("Sounds good, thank you.");
                    exit();
                    repeat = false;
                }
                else if (a4.toLowerCase().equals("b")) {

                    talk("You just stand there...");
                    talk("The sound of blowing sand fills your ears again.");
                    talk("He shakes his hand to reassure you.");
                    talk("You shake your head to reassure him.");
                    cont();
                    talk("He chuckles nervously and draws his hand back.");
                    talk("He motions to the castle and walks into the empty doors.");
                    repeat = false;
                }
                else {
                    talk("Please pick an option given.");
                    repeat = true;
                }
            }
        repeat = true;
        while (repeat==true) {
            talk("You can (a) sleep in the castle, or (b) sleep somewhere else.");
            String a5 = scan.nextLine();
            if (a5.toLowerCase().equals("a")) {
                talk("You look around, the tall castle peering up into the bleeding sky.");
                talk("The gold and violets clashing with the castle's grey outline.");
                talk("You focus on the entrance, and follow him inside.");
                repeat = false;
            }
            else if (a5.toLowerCase().equals("b")) {
                talk("You feel sour, you'd rather sleep in a cage than sleep in his house.");
                talk("Looking around you see a small hut, with a cloth roof, tearing to reveal the bleeding sky.");
                talk("You amber over and clear out a patch of hay on the ground.");
                talk("You nestle under the coverage, fairly comfortable.");
                cont();
                talk("The calming sky weighed your eyes.");
                talk("Everything felt sore, everything burned.");
                talk("Your eyes closed and the darkness came.");
                repeat = false;
            }
            else {
                talk("Please pick an option given.");
                repeat = true;
            }
        }

        exit();



        }
    }