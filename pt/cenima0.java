package pt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class cenima0 {
	class Movie {
	    private String title;
	    private String genre;
	    private int duration;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
	
	}

	class Showtime {
	    private Movie movie;
	    private String date;
	    private String time;
		public Movie getMovie() {
			return movie;
		}
		public void setMovie(Movie movie) {
			this.movie = movie;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
	   
	}

	class CinemaManager {
	    private List<Movie> movies;
	    private List<Showtime> showtimes;

	    public CinemaManager() {
	        movies = new ArrayList<>();
	        showtimes = new ArrayList<>();
	    }

	    public void addMovie(Movie movie) {
	        movies.add(movie);
	    }

	    public void addShowtime(Showtime showtime) {
	        showtimes.add(showtime);
	    }

	    public void listMovies() {
	        System.out.println("Available Movies:");
	        for (Movie movie : movies) {
	            System.out.println(movie.getTitle());
	        }
	    }

	    public void listShowtimes() {
	        System.out.println("Upcoming Showtimes:");
	        for (Showtime showtime : showtimes) {
	            System.out.println(showtime.getMovie().getTitle() + " - " + showtime.getDate() + " " + showtime.getTime());
	        }
	    }

	    // Add more methods for managing movies, showtimes, and other functionalities
	}
}
