import java.util.Scanner;

/**
 * Driver class that tests the Movie class by reading in
 * information for a single movie and printing it out.
 */
public class MovieDriverTask1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();

		System.out.print("Enter the title of the movie: ");
		String title = keyboard.nextLine();
		movie.setTitle(title);

		System.out.print("Enter the movie's rating: ");
		String rating = keyboard.nextLine();
		movie.setRating(rating);

		System.out.print("Enter the number of tickets sold: ");
		int soldTickets = keyboard.nextInt();
		keyboard.nextLine(); // discard the leftover newline
		movie.setSoldTickets(soldTickets);

		System.out.println(movie.toString());

		keyboard.close();
	}
}
