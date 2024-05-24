package bites.examples;

public class print_args {
    public static void main(String[] args){
        System.out.println(args);
        System.out.println("[L: This indicates that the object is an array. The [L is a prefix used by Java to represent arrays of objects (in this case, an array of String objects)");
        System.out.println("java.lang.String: This indicates that the array is of type String");
        System.out.println("@65ab7765: This is the hash code of the array object in memory, represented in hexadecimal format");
    }
}
