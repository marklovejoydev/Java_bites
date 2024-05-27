package bites.examples;

public class Order {

    Integer total = 0;

    public void  addAmount(Integer amount){
        this.total += amount;
    }

    public void addDiscount(Integer amount){
        this.total -= amount;
    }

    public Integer getTotal(){
        return this.total;
    }


    public static void main(String[] args) {
        Order order = new Order();
        order.addAmount(10);
        order.addDiscount(1);
        Integer total = order.getTotal();
        System.out.println(total);
    }
}
