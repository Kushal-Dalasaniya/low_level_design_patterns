package creational_design_patterns.builder_pattern;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        
        builder.getMovie();
    }
}