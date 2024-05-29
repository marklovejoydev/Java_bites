package bites.examples;

public class StoryBuilder {
    String plot = "";


    public void addPlotline(String plotline){
        this.plot = String.format("%s\n%s", this.plot, plotline).trim();
    }
    public String getPlot(){
        return this.plot;
    }

    public static void main(String[] args) {
        StoryBuilder storyBuilder = new StoryBuilder();
        System.out.println("First added plotline ");
        storyBuilder.addPlotline("This is the first line.");
        System.out.println(storyBuilder.getPlot());
        System.out.println("Second added plotline ");
        storyBuilder.addPlotline("This is now the second line.");
        System.out.println(storyBuilder.getPlot());
    }
}
