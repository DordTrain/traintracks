import java.util.Random;
import java.util.Scanner;

public class Pillar extends Main {
    public static void talk(String text) throws InterruptedException{
      for(int i = 0;i<text.length();i++) {
        System.out.print(text.charAt(i));
        Thread.sleep(20);
      }
      System.out.println("");
    }
    
    static Scanner scan = new Scanner(System.in);
    static String[] stories = new String[] {"Take all the time you need, I'll be here.","Don't walk alone, you need others.","Enjoy the scenery, it won't last forever.","If something doesn't make you happy, why are you doing it?","Keep your sense of child innocence.","Don't love to hate yourself.","Be honest to yourself."};
    static Random rand = new Random();
    public static void pillar() throws InterruptedException {
        talk("The sun beats over you, your mouth is dryer than what your feet are trudging through.");
        talk("Your eyes feel heavy, the pillar is right there, it's so close.");
        talk("You pick yourself back up, only 100 more feet. That's only 40 more steps.");
        cont();
        talk("Your eyes close further, you crave the taste of water, all you can think now.");
        talk("The burning sand fades, your feet feel the cool dampness of fertile soil.");
        talk("You open your eyes, a black dirt path leads up to the pillar.");
        cont();
        talk("You can see the pillar clearly now, a tall white quarts peering over you.");
        talk("The smooth coat almost metallic like, reflecting the sun brighter than it already was.");
        talk("The dirt path circles around the tall monument. But besides that, nothing else is around.");
        cont();

        talk("Etched into the walls, you see lines of words, some longer than others.");


        //reading wisdom
        boolean repeat = true;
        boolean read_one = false;
        while (repeat == true) {
            if (!read_one) {
                talk("You can (a) read a word of wisdom, or (b) inspect the pillar.");
            }
            else {
                talk("You can (a) read another, or (b) inspect the pillar.");
            }
            String a1 = scan.nextLine();
            if (a1.equals("a")) {
                wisdom(stories[rand.nextInt(stories.length)]);
                read_one=true;
            }
            else if (a1.equals("b")) {
                repeat = false;
            }
            else {
                talk("Please pick an option given.");
                repeat = true;
            }
        }

        talk("You inspect all sides of the pillar, nothing seems out of the ordinary.");
        talk("About 10 feet tall, six sides, pointed at the top, made of quarts.");
        talk("What else could there be?");
        cont();
        talk("A crackling boom splits your ears, the loud rumbling shaking the ground.");
        talk("You jolt up, analyzing the sky, it's dark, it's going to rain.");
        cont();
        talk("The crackling rip of the sky makes itself known in an instant.");
        talk("Sulphuric veins of plasma blister out, striking the sand where you first woke up.");
        talk("The sand responds, spilling into the blackened sky. You need to take cover.");
        talk("Act fast, there is a ditch off to your left, and a tree to your right.");
        repeat = true;
        while (repeat == true) {
            talk("You can (a) hop in the ditch, or (b) hide under the tree.");
            String a2 = scan.nextLine();
            if (a2.equals("a")) {
              repeat = false;
              talk("Loud crackling of boiling sand plaugues the air as you jump into a nearby ditch, the floor is part dirt part sand.");
              talk("The ditch begins to arch over you as you can feel your legs sinking further into the floor.");
              talk("Quicksand slowly engulfs your torso.");
              cont();
              talk("Panic sets in, you are going to die. You struggle and the sang spills further down into the carving pit.");
              talk("Through the rain and the flashing sky you see a silloughette stretch a boney hand towards you.");
              jatalk("HEY GRAB MY HAND!");
              cont();
              talk("The voice cuts through the pouring rain.");
              
            }
            else if (a2.equals("b")) {
                repeat = false;
                talk("Cracks of lightning split the air as the tree becomes your overhead. The branches of the tree flicker shadows from the changing skies.");
                talk("All at once a blinding light coveres your view, the smell of charred food and the sound of crackling wood overwhelms you.");
                talk("The tree, it's dry leaves, were falling to the ground with grace and burning rage.");
                cont();

            }
            else {
                talk("Please pick an option given.");
                repeat = true;
            }
        }



        exit();





    }
}
