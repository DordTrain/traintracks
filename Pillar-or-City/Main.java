import java.util.Scanner;


public class Main {
    public static void talk(String text) throws InterruptedException{
      for(int i = 0;i<text.length();i++) {
        System.out.print(text.charAt(i));
        Thread.sleep(20);
      }
      System.out.println("");
    }
    static Person user = new Person("",100,20);
    


    //colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";









    //continue method
    public static void cont() throws InterruptedException{
        Scanner cont = new Scanner(System.in);
        System.out.println();
        talk("Press enter to continue...");
        cont.nextLine();
    }

    public static void exit() throws InterruptedException{
        Scanner cont = new Scanner(System.in);
        System.out.println();
        talk("Game Over! More to come soon!");
        talk("Press enter to exit.");
        cont.nextLine();
        System.exit(0);
    }

    public static void notdone() throws InterruptedException{
        dev("Hey this is me, the developer. I need to make this path.");
        dev("Please re-pick your option");
        dev("I promise I'll be done with this soon!");
        dev("-dev");
    }

    //Joseph
    public static void jotalk(String text) throws InterruptedException{
        talk(ANSI_BLUE+text+ANSI_RESET);
    }
    public static void jatalk(String text) throws InterruptedException{
        talk(ANSI_CYAN+text+ANSI_RESET);
    }

    //User
    public static void utalk(String text) throws InterruptedException{
        talk(ANSI_RED+text+ANSI_RESET);
    }

    //dev talk
    public static void dev(String text) throws InterruptedException{
        talk(ANSI_GREEN+text+ANSI_RESET);
    }

    //wisdom on the pillar
    public static void wisdom(String text) throws InterruptedException{
        talk(ANSI_WHITE+text+ANSI_RESET);
    }




    public static void main(String[] args) throws InterruptedException {
        boolean repeat = true;


        Scanner scan = new Scanner(System.in);
        talk("You regain consciousness, the heat blistering your skin. You have been fainting on and off, too little water.");
        talk("Your legs ache, your tongue sticks to the roof of your mouth, dry as the blowing desert.");
        talk("You sit down and look around, a stick pokes out of the heated sand, next to it, a rock is sitting.");
        talk("You decide to pick one of them.");
        user.setWater(user.getWater()-1);
        Item rock = new Item("rock",7,0,20,20);
        Item stick = new Item( "stick",17,0,5,5);
        while (repeat == true) {
            talk("You can (a) pick up rock, or (b) pick up stick: ");
            String a1 = scan.nextLine();

            if (a1.toLowerCase().equals("a")) {
                user.addtoInv(rock);
                talk("You picked up the rock and put it in your pocket.");
                talk("It weighs down your pants.");
                user.setWater(user.getWater()-1);
                repeat = false;
            }
            else if (a1.toLowerCase().equals("b")) {
                user.addtoInv(stick);
                talk("You grab the stick and put it in your pocket.");
                talk("It pokes out but you ignore it.");
                user.setWater(user.getWater()-1);
                repeat = false;
            }
            else {
                talk("Please pick an option given.");
            }
        }
        repeat = true;
        cont();
        talk("You stand up and sand falls from your clothing.");
        talk("Your bones crack and ache as your pockets release more sand.");
        cont();
        talk("In the distance you see a small city, the bright sun radiating off of it.");
        talk("You also see a tall quartz pillar not too far away. You could walk to it.");


        while (repeat == true) {
            talk("Do you want to (a) Travel to the city, or (b) walk to the pillar.");
            String a2 = scan.nextLine();

            if (a2.toLowerCase().equals("a")) {
                talk("You crack your back and peer towards the distant city.");
                talk("You take a deep breath and start walking.");
                user.setWater(user.getWater()-1);
                repeat = false;
                City.city();
            }
            else if (a2.toLowerCase().equals("b")) {
                talk("You got this, it's not that far away.");
                talk("You shake sand off of your clothes and walk.");
                cont();
                Pillar.pillar();
                repeat = false;
            }
            else {
                talk("Please pick an option given.");
                repeat = true;
            }

        }







    }
}
