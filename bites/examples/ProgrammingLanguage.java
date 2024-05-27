package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator){
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String getName(){
        return this.name;
    }
    public Integer getYearOfCreation(){
        return this.yearOfCreation;
    }
    public String getCreator(){
        return this.creator;
    }

    public static void main(String[] args) {
        ProgrammingLanguage info = new ProgrammingLanguage("JavaScript", 1995, "Brendan Eich" );
        System.out.println(info.getName());
        System.out.println(info.getYearOfCreation());
        System.out.println(info.getCreator());
    }
}
