package inheritance;

import java.util.List;
import java.util.ArrayList;


public class Theater extends Review{
  private String name;
  private List<String> movie = new ArrayList<>();
  private double stars;


  public Theater(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getMovie() {
    return movie;
  }

  public void addMovie(String name) {
    movie.add(name);
  }

  public  void  removeMovie (String name){
    movie.remove(movie.indexOf(name));
  }

  public double getStars() {
    this.stars = getReviewStars();
    return stars;
  }

  public String toString(){
    return "Theater Name: " + getName() + " | Stars: " + getStars() + " | List of Movie: " + getMovie() +  " | Review: " + getReview();
  }
}
