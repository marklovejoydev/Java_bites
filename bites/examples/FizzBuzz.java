package bites.examples;

public class FizzBuzz {

    private void play(Integer input){
        if (input % 3 == 0 && input % 5 == 0 ) {
            System.out.println("FizzBuzz");
        }
        else if (input % 3 == 0){
            System.out.println("Fizz");
        }
        else if (input % 5 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(input.toString());
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.play(1);
//        fizzBuzz.play(3);
//        fizzBuzz.play(5);
//        fizzBuzz.play(15);

        for(Integer i = 100; i >= 1; i--){
            fizzBuzz.play(i);
        }
//        Integer i = 0;
//        while(i <= 20){
//            fizzBuzz.play(i);
//            i++;
//        }
    }
}
