package bites.examples;

public class Bagel {
    public static void main(String[] args) {
        Bagel myBagel = new Bagel();
        System.out.println(myBagel.seeds());
        System.out.println(myBagel.filling());
        System.out.println("£" + myBagel.price());

    }
    public String seeds(){
        return "seeds are the little circular stuff on top of the bread can also plant them to grow";
    }
    public String filling(){
        return "inside this bagel is pastrami and cheese with  hint of mayo";
    }
    public Integer price(){
        return 5;
    }

}

