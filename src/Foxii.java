import java.util.Scanner;

public class Foxii {
    public static void main(String[] args) {
        System.out.println("Helo Im Foxii and im your bot im still in my early stages so don't expect a full on conversation with me thank you!");
        Scanner ur_mama = new Scanner(System.in);
        // above we made a new scanner class
        System.out.println("So Whats Your name?");
        String userName = ur_mama.nextLine();
        System.out.println("Hello! " + userName + ", My name is Foxii!");
        //above asks the user for their name
        System.out.println("So How old are you!?(numbers only please!)");
        int age = Integer.parseInt(ur_mama.nextLine());
        System.out.println("cool i am 18 years old!");
        // above asks the user for their age
        System.out.println("What Grade are you in?");
        String grade = ur_mama.nextLine();
        System.out.println("oh cool im in kindergarden");
        //above bot asks which grade the user is in
        System.out.println("Whats Your Salary?");
        int salary = Integer.parseInt(ur_mama.nextLine());
        if(salary <= 10000) { System.out.println("you're poor");}
        if(salary <= 100000) { System.out.println("You're Middle class"); }
        if (salary > 1000000) { System.out.println("You're Rich"); }
        System.out.println("Unfortunatley you're richer than me in every scenario because well i don't have a job lol");
        // above asks the user for their salary and it judges it upon the answer
        System.out.println("So anything bad happened today?");
        String sadThing = ur_mama.nextLine();
        System.out.println("oof that's sad, even something sad happened to me too! you wanna know??(1 = yes and 2 = no)");
        int yesOrNo = Integer.parseInt(ur_mama.nextLine());
        if (yesOrNo == 1) {
            System.out.println("my mom died");
        } else {
            System.out.println("ok..");
        }
        // above asks the user if something sad happened to them
        System.out.println("so anything u wanna share with me?");
        String goodThingg = ur_mama.nextLine();
        System.out.println("ok");
        //above asks the user if they wanna share something
        System.out.println("What Games Do you play?");
        String Games = ur_mama.nextLine();
        System.out.println("Awesome i play COD WARZONE AND FORTNITE AND APEX LEGENDS AND ALSO AMONG US THESE ARE MY FAV GAMEZ!");
        // above asks the user the video games they like!
        System.out.println("So what are your pc specs?");
        String pcSpecs = ur_mama.nextLine();
        System.out.println("sheesh that's good i hab a 2009 laptop lol (send help plspls)");
        //above asks the user their pc specs
        System.out.println("r u lonely?");
        String lonelyniess = ur_mama.nextLine();
        System.out.println("oh ok well i am lonely too!");
        // above asks the user if they are lonely
        System.out.println("hey i wanna share something with u");
        System.out.println("https://bit.ly/2OYIkbh");
        System.out.println("check it out! it's really cool!");
        System.out.println("did u like it?");
        String response = ur_mama.nextLine();
        //above rick rolls the user lol

    }
}
