package bites.examples;

public class Announcement {

    // a normal main method signature
    public static void main(String[] args) {
        // call our static method
//        System.out.println(
//                Announcement.celebration()
//        );
//        System.out.println(
//                Announcement.changeOfPlan()
//        );
//        System.out.println(
//                Announcement.apology()
//        );
//        System.out.println(
//                Announcement.politeNotice()
//        );
//        System.out.println(
//                Announcement.helpNeeded()
//        );
//        print out instanced methods
        Announcement myAnnouncement = new Announcement();

        System.out.println(myAnnouncement.celebration());
        System.out.println(myAnnouncement.changeOfPlan());
        System.out.println(myAnnouncement.apology());
        System.out.println(myAnnouncement.politeNotice());
        System.out.println(myAnnouncement.helpNeeded());
    }

    // a static method that returns nothing but prints a String
//    public static void alert(String message) {
//        System.out.println(message);
//    }
//    public static String celebration(){
//        return "Its friday!";
//    }
//    public static String changeOfPlan(){
//        return "Loads of work just came in :(";
//    }
//    public static String apology(){
//        return "Im sorry you need to work on this";
//    }
//    public static String politeNotice(){
//        return "This will need to be completed by Monday";
//    }
//    public static String helpNeeded(){
//        return "Your are going to need help on this so just grab someone";
//    }
//    instanced methods
    public String celebration(){
        return "Its friday!";
    }
    public String changeOfPlan(){
        return "Loads of work just came in :(";
    }
    public String apology(){
        return "Im sorry you need to work on this";
    }
    public String politeNotice(){
        return "This will need to be completed by Monday";
    }
    public String helpNeeded(){
        return "Your are going to need help on this so just grab someone";
    }

}
