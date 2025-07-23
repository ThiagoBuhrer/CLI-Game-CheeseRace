package CheeseRace.GameDesign;

import CheeseRace.Pilots.Rat;

import java.util.Scanner;

public class Text {

    /**
     * Full credits (available at the menu)
     */
    public static void Credits() {

        System.out.println();
        Design.Bar();
        System.out.println("\n\nCheese Race – Developed by Thiago Bührer");
        System.out.println("©2025 CESAE Digital. All Rights Reserved.\n");
        System.out.println("\uD83D\uDC00 Game Design: Thiago Bührer");
        System.out.println("\uD83D\uDC00 Art and Graphics: CESAE Digital Team");
        System.out.println("\uD83D\uDC00 Sound and Music: Composer X");
        System.out.println("\uD83D\uDC00 Programming: Thiago Bührer");
        System.out.println("\uD83D\uDC00 Testing: the glorious QA Team (AKA me)");
        System.out.println("\uD83D\uDC00 Special Thanks to: All beta testers");
        System.out.println("\uD83D\uDC00 Developed in IntelliJ IDEA\n");
        Design.SwissCheese();
        System.out.println();
        Design.Bar();
        System.out.println();

    }


    /**
     * Short credits (in the Title Screen)
     */
    public static void ShortCredits() {
        System.out.println("\nCheese Race – Developed by Thiago Bührer");
        System.out.println("©2025 CESAE Digital. All Rights Reserved.\n");
    }


    /**
     * Dialogue number 01 - "Introduction to the Sewer World"
     */
    public static void Dialogue01() {

        System.out.println("\n\n\n\t\t\u001B[33m** Day One: Two suspicious rats are driving towards you in a car. It's Bobbie and Jimmy! **\u001B[0m\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Oh hi there, mate! Welcome to the Cheese Race! \uD83C\uDFC1");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: You might be wondering what is this all about. And it is a whole lot...");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: But long story short: your goal is to beat the latest record on the most famous track in the sewer world.");
        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m JIMMY: Yes, the sewers, this ain't no Monaco. If you can't play in the dirt you better bounce, mister.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: But listen up, if you win... that will make you the nastiest rat pilot of all time.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: Oh yeah, babe, that's one big-time achievement, huh?.");
        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m BOBBIE: Of course having a good vehicle is key if you wanna crash the party. So hop up, mate, and let us help you with that...");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: We know the biz inside out, if you know what I mean. This ain't our first rodeo.  \u001B[33m* winks *\u001B[0m");

    }


    /**
     * Dialogue number 02 - "Registering a new rat pilot"
     */
    public static void Dialogue02() {

        System.out.println("\n\t\t\u001B[33m◯\u001B[0m JIMMY: Ok, first things first... we need to get you registered as a pilot.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: Only registered rats can race, you know? I didn't make the rules, lets get to it...");

    }


    /**
     * Dialogue number 03 - "The goal"
     */
    public static void Dialogue03() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m BOBBIE: Oh, look at you now! Ready to burn rubber?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Now that you're registered, let's talk about the real deal.\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: There will be 4 different races in 4 different tracks coming your way.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Everytime you beat the record of one of them, you will win a special bounty.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Throughout the game, you’ll be building your racing stats, managing your collected bounty, and buying better vehicles and items.\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Believe me, mate, that last track is no joke.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Yes, after the 4th race you will have to face one final challenge: a 5000 meters lap, with 5 laps in total. Every move counts.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: You gotta beat the record there, or the whole thing is over. Think you’re ready for that? If you stay ready you ain't got to get ready, mate.");

    }


    /**
     * Dialogue number 04 - "Special bounty: the cheese pieces"
     * @param newPilot
     */
    public static void Dialogue04(Rat newPilot) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m JIMMY: Oh! Oh my! Smell this?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: Let's talk business... paper... money honey... you know what I'm talking about, huh?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: It is the Sewer World's main currency and most savory food to ever land in your furry little dirty hands...\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: Yes, I'm talking about the\u001B[33m cheese pieces\u001B[0m! 🧀");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: Remember the special bounty we mentioned before? Everytime you beat a track's record you will earn a nice ammount of\u001B[33m cheese pieces\u001B[0m 🧀.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: They can be exchanged by vehicles and items at Mozzarato's mechanic shop later on.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: Since you are new to the races, me and Bobbie will give you an initial ammount so you can hit the ground running.\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Wait a minute, before we handle you cheese, you must first choose the game mode.\n\n\n");

        int choice = 0;
        while (choice != 1 && choice != 2) {
            System.out.println("Enter your game mode of preference: ");
            System.out.println("\uD83D\uDC2D\t1 - EASY");
            System.out.println("\uD83D\uDC2D\t2 - HARD");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Design.Earn();
                    System.out.println("\nYou earned 100 cheese pieces! 🧀");
                    newPilot.addCheese(100);
                    break;
                case 2:
                    Design.Earn();
                    System.out.println("\nYou earned 50 cheese pieces! 🧀");
                    newPilot.addCheese(50);
                    break;
                default:
                    System.out.println("\n\t\t\u001B[33m◯\u001B[0m Invalid choice, please choose 1 for Easy or 2 for Hard.");
                    break;

            }

        }

    }


    /**
     * Dialogue number 05 - "Your first vehicle"
     */
    public static void Dialogue05() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m BOBBIE: Yo, where do you think you goin'?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Man, \u001B[33mcheese pieces\u001B[0m 🧀 are cool, but they ain’t gonna win you no races, dummy. Vehicles do!");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Time to get your hands on your first vehicle, that’s fire, huh? Now go talk to Mozzorato at his mechanic shop \uD83E\uDDF0\uD83D\uDEE0");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Just follow the stink, you’ll find it.\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: Oh, and don’t forget to tell him Bobbie and Jimmy sent you. Otherwise, you might not get a good deal...");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMY: By the way, Mozzorato can be mad grumpy sometimes. So, good luck!");

    }


    /**
     * Dialogue number 06 - "First time at the mechanic shop"
     */
    public static void Dialogue06() {

        System.out.println("\n\n\t\t\u001B[33m** Day Two: you finally arrive at Mozzorato's mechanic shop after following the stench **\u001B[0m\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Yo, you lookin' for a ride, huh?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Well, I ain't just handin' out vehicles like it's candy.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: If you want somethin' solid, you better got the cheese for it, capisce?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: I ain't in the business of giving freebies, so show me you serious\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Wait, you said Bobbie and Jimmy? Hum... Pssh, they owe me big time. But I’ll hook you up.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: All right, come take a look in the garage so you can check out the vehicles that are available for you...\n");
    }


    /**
     * Dialogue number 07 - "Mozzorato wants to sell a car"
     */
    public static void Dialogue07() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m MOZZORATO: Take a good look, mate.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Since this is your first vehicle, I will make a special offer.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: I will sell you a car completely\u001B[33m 10 cheese pieces\u001B[0m 🧀 of yours.\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: But under one condition — you promise me not to drive like a headless cockroach.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Last thing I need is another rookie like Jimmy and Bobbie turning my fine machines into overpriced scrap metal.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: So, you got the cheese or are we just exchanging air here?\n");

        System.out.println("\t\t\u001B[33m** I nodded my head, filled with excitement **\u001B[0m");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Very well, in that case choose from one of the vehicles in the garage: \n\n");

    }


    /**
     * Dialogue number 08 - "Introduction to Special Items"
     */
    public static void Dialogue08() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m MOZZORATO: Before you go, mate, let me introduce you to the \u001B[33mrace items\u001B[0m !");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Yep, I also got some special stuff that'll make your ride a beast on the track.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: You see these little gems? \uD83D\uDC8E These ain't just shiny trinkets...\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Nah, these are items that’ll give your car that edge.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: Lighter weight? I gotcha. Less wear and tear? Yup, got that too.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: And if you're lookin' for a horsepower boost, well... you’re in the right place, buddy.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: All these items can be bought with \u001B[33mcheese pieces\u001B[0m 🧀, so don't go wasting 'em.\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: So, wanna take a look at the stock? I got some real good stuff waiting for you.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m MOZZORATO: You will have a chance to see the stock and use items every time you finish a race, don't worry.\n");

    }

    /**
     * Dialogue number 09 - "Your very first race"
     */
    public static void Dialogue09() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m BOBBIE: Yo Yo, hold up, my brother! Not so fast...");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Are you telling me you have never been to the races and already tryna buy some gems? What for? You are still a newbie, dude!");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Humble yourself a bit, huh? You can buy items later on, fella. There will be many opportunities to do so.\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMIE: You heard him. Chill out and follow us to the \u001B[33m1st Sewer Track\u001B[0m. \uD83C\uDFC1");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMIE: And, wow... I can see that Mozzorato hooked you up nice. Never thought that old grumpie had it in him.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMIE: Let’s see if you can actually keep up, rookie.\n");

    }


    /**
     * Dialogue number 10 - "Ready for your 2nd race?"
     */
    public static void Dialogue10() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m BOBBIE: Look who’s back! How’d the first race go in the Sewer World, huh?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Not sure if you crushed it or... But hey, we all start somewhere, right? You got this!\n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMIE: That’s right. You gave it a solid shot, rookie! The next race could be your big break, you just gotta get the right gear.");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMIE: Might wanna think about buying a new vehicle or some special items. So, what’s it gonna be? \n");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMIE: Wanna swing by Mozzorato’s mechanic shop and tweak your setup? Or are you ready to dive straight into the \u001B[33m2nd Sewer Track\u001B[0m?");
        System.out.println("\t\t\u001B[33m◯\u001B[0m JIMMIE: Oh, and by the way, every time you visit the mechanic shop you can also switch and manage any pre-existing gear and items.");

    }

    public static void Dialogue11() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m BOBBIE: Look who’s back!");
        System.out.println("\t\t\u001B[33m◯\u001B[0m BOBBIE: Ready for the next race? Let's go!");

    }

    /**
     * Display current amount of cheese to the player
     * @param newPilot
     */
    public static void showAmountCheese(Rat newPilot) {

        Design.yummy();
        System.out.println("\n\u001B[33m Cheese pieces\u001B[0m remaining: " + newPilot.getCheesePieces() + " 🧀\n\n");
    }



    /*

    DIALOGUE METHOD TEMPLATE:

    //Dialogue number 0 - " "
    public static void Dialogue0() {

        System.out.println("\n\n\t\t\u001B[33m◯\u001B[0m ");
        System.out.println("\t\t\u001B[33m◯\u001B[0m ");
        System.out.println("\t\t\u001B[33m◯\u001B[0m ");
        System.out.println("\t\t\u001B[33m◯\u001B[0m ");
        System.out.println("\t\t\u001B[33m◯\u001B[0m ");



    }

     */

}
