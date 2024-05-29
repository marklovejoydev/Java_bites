package bites.examples;

public class Discounter {
    Integer discountAmount;

    public Discounter(Integer discountAmount){
        this.discountAmount = discountAmount;
    }
    public Integer applyTo(Integer value){
        return value - discountAmount;
    }


    public static void main(String[] args) {
        Discounter discounter = new Discounter(20);
        System.out.println(discounter.applyTo(100));
        System.out.println(discounter.applyTo(200));
    }
}
