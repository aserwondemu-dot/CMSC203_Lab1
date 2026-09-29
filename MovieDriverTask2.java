import java.util.Scanner;

/**
 * Driver class that tests the Movie class by reading in
 * information for multiple movies in a loop.
 */
public class MovieDriverTask2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String continueResponse;

		do {
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

			System.out.print("Do you want to enter another movie? (y/n): ");
			continueResponse = keyboard.nextLine();

		} while (continueResponse.equalsIgnoreCase("y"));

		keyboard.close();
	}
}
