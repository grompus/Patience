import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi and welcome to the world of PATIENCE!");
        System.out.println("In this text based adventure you will be able to explore, discover and fight.");
        System.out.println("Don't get to excited though there is only one good way to win and one bad way.");
        System.out.println("To navigate through this adventure you will pick from four cardinal directions to travel");
        System.out.println("First you need some fun context!");
        System.out.println();
        System.out.println("Please give us a name to begin your story!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name + " to the dark and cold landscape of antarctica!");
        System.out.println("It was a dark and stormy night as you and a small team of prisoners travel by submarine to a secret prison in the arctic");
        System.out.println("How do you know it is dark and stormy you may be asking? Well it adds aesthetic so deal with it!");
        System.out.println("After arriving to the prison you drop off the prisoners and head back to your vessel.");
        System.out.println("You make it about half way before you stop for a snack, after scarfing down three snow sandwiches you take a nap.");
        System.out.println("When you finally wake up you see day light! You feel confused because it is only supposed to be week one of Antarctica's night cycle");
        System.out.println("It takes you two seconds to deduce you slept for five months and three weeks! Btw Antarctica has six months of night.");
        System.out.println("Seriously look it up I will wait.");
        System.out.println();
        System.out.println("Enter Yes when you are ready to continue");
        String answer = scanner.next();
        boolean wait = true;
        while (wait) {
            if (answer.equalsIgnoreCase("Yes")) {
                wait = false;
            }
        }
        System.out.println("After pouting and yelling at yourself for what seemed like hours.");
        System.out.println("Seriously dude I have places to be!");
        System.out.println("You collect yourself and decide to try to get back to your sub.");
        System.out.println("To begin you have to choose your team and equipment.");
        System.out.println("With arms as weak as cooked pasta you have to choose one item to start your journey:");
        System.out.println("Option 1: A Candy Bar, Option 2: A Empty Canteen, Option 3: A Bicycle");
        System.out.println("Please Enter 1, 2, or 3");
        answer = scanner.next();
        int item1 = 0;
        boolean choose = true;
        while (choose) {
            if (answer.equalsIgnoreCase("1")) {
                item1 = 1;
                System.out.println("Really! well it's your funeral.");
                choose = false;
            }
            else if (answer.equalsIgnoreCase("2")) {
                item1 = 2;
                System.out.println("Could come in handy if all the water around you wasn't filled with salt!");
                choose = false;
            }
            else if (answer.equalsIgnoreCase("3")) {
                item1 = 3;
                System.out.println("In the distance you hear Professor oak screaming it is not time to use that " + name +"!");
                choose = false;
            }
            else if (answer.equalsIgnoreCase("5139")) {
                item1 = 5139;
                System.out.println("Propter hanc potestatem gravem pretium debes reddere! unum mox face. " + "You have acquired the shield of rage!");
                choose = false;
            }
        }
        System.out.println("With your first item weighing you down you realize you must find help on your journey.");
        System.out.println("You have three choices:");
        System.out.println("Option 1: Bribe some guards to ditch work and help you.");
        System.out.println("Option 2: Free a convict to help you.");
        System.out.println("Option 3: go it alone.");
        System.out.println("Enter 1, 2, or 3");
        answer = scanner.next();
        int person_type = 0;
        int person = 0;
        choose = true;
        while(choose) {
            if (answer.equalsIgnoreCase("1")) {
                System.out.println("Rolling the dice on bribes? Well good luck!");
                person_type = 1;
                choose = false;
            }
            else if (answer.equalsIgnoreCase("2")) {
                System.out.println("Feeling secure with a convict? Maybe they learned their lesson.");
                person_type = 2;
                choose = false;
            }
            else if (answer.equalsIgnoreCase("3")) {
                System.out.println("Well fine they don't need to help you anyway!");
                person_type = 3;
                choose = false;
            }
        }
        choose = true;
        while(choose && person_type == 1 || person_type == 2) {
            if(person_type == 1) {
                System.out.println("Time to pick the guards to bribe.");
                System.out.println("Your options are:");
                System.out.println("Option 1: Mordecai and Rigby, Option 2: Carter and Briggs, Option 3: Turner and Hutch");
                answer = scanner.next();
                if (answer.equalsIgnoreCase("1")) {
                    System.out.println("Mordecai and Rigby quickly look at each other before nodding and yelling Woooah!");
                    System.out.println("Unfortunately you are now out of some cash and owe them a chocolate cake.");
                    person = 1;
                    choose = false;
                }
                else if (answer.equalsIgnoreCase("2")) {
                    System.out.println("Carter and Briggs look at you, laugh and knock you out cold!");
                    System.out.println("You wake up in a cell stripped of your belongings and filed under another prisoners name");
                    System.out.println("Well hope you have a great cell mate! I'm just gonna head out, good luck.");
                    System.out.println("Congratulations you found fail ending number 1!");
                }
                else if (answer.equalsIgnoreCase("3")) {
                    System.out.println("Turner looks at Hutch and before you know it you feel electricity from a stun gun");
                    System.out.println("You wake up in a holding room while Turner files a report for bribing a officer and disrupting official business");
                    System.out.println("You are sentenced to one year in the prison and $10,000 fine to be paid in one week on release");
                    System.out.println("Congratulations you found fail ending number 2!");
                }
            }
            if(person_type == 2) {
                System.out.println("Time to pick the prisoner(s) to break out.");
                System.out.println("Your options are:");
                System.out.println("Option 1: Striker, Option 2: Kyle and Cartman, Option 3: Jarred from a sub shop");
                answer = scanner.next();
                if (answer.equalsIgnoreCase("1")) {
                    System.out.println("Striker goes to run out of his cell when he stubs his toe and hits his head on a cell bar");
                    System.out.println("You where so distracted from laughter that the guards rushed in and arrested you.");
                    System.out.println("The judge took pity on you and sentenced you to three years in prison");
                    System.out.println("Congratulations you found fail ending number 3!");
                }
                else if (answer.equalsIgnoreCase("2")) {
                    System.out.println("No sooner had you released the pair did they start bickering about their past");
                    System.out.println("You help them navigate through the escape route and manage to avoid detection");
                    person = 2;
                    choose = false;
                }
                else if (answer.equalsIgnoreCase("3")) {
                    System.out.println("Jarred knocks you out and throws you in his cell.");
                    System.out.println("The guards can't distinguish you from jarred so you must finish his sentence");
                    System.out.println("Luck for you it is only four years.");
                    System.out.println("Meanwhile Jarred has stolen your identity and is spending your savings.");
                    System.out.println("Congratulations you found fail ending number 4!");
                }
            }
        }
        System.out.println("Ready to continue?");
        System.out.println("Enter Yes");
        answer = scanner.next();
        choose = true;
        while (choose) {
            if (answer.equalsIgnoreCase("Yes")) {
                choose = false;
            }
        }
        System.out.println("With your item and companion(s) at your side you are ready to begin the journey!");
        System.out.println("Choose a direction to travel in: North, East, South, West");
        answer = scanner.next();
        choose = true;
        int north = 0;
        int east = 0;
        int south = 0;
        int west = 0;
        while (choose) {
            if (answer.equalsIgnoreCase("North")) {
                north += 1;
                answer = scanner.next();
            }
            else if (answer.equalsIgnoreCase("East")) {
                east += 1;
                answer = scanner.next();
            }
            else if (answer.equalsIgnoreCase("South")) {
                south += 1;
                answer = scanner.next();
            }
            else if (answer.equalsIgnoreCase("West")) {
                west += 1;
                answer = scanner.next();
            }
            if (west == 10) {
                System.out.println("You feel the empty cold engulf you as you begin to pass out.");
                System.out.println("In a dream you are in a gun fight, at high noon in the middle of a town in texas");
                System.out.println("You pass away due to exposure");
                System.out.println("My deepest condolences on reaching fail ending number 10");
                choose = false;
            }
        }
    }
}