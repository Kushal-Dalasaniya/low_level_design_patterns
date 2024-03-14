package creational_design_patterns.builder_pattern;

public class MovieBuilder implements PresentationBuilder{
    private Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 0);
    }
    
    public Movie getMovie(){
        return movie;
    }
}
