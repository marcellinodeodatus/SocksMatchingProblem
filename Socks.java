import java.io.*;
import java.util.*;

public class Socks {

	public static void main (String[] args) {

		// get filename from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of the file containing the sock information: ");
		String fileName = scanner.nextLine();

		// Store the count of each type of sock in a Map
		Map<String, Integer> sockMap = new HashMap<>();

		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			// Read the total number of socks (first line)
			int totalSocks = Integer.parseInt(br.readLine().trim());

			// Read each line representing a sock and store it in the map
			String line;
			while ((line = br.readLine()) != null) {
				// Each line contains a two-word description of a sock
				String sockType = line.trim();

				// Increase the count for this sock type
				sockMap.put(sockType, sockMap.getOrDefault(sockType, 0) + 1);

			}
			br.close();

			// Prepare to count pairs
			int totalPairs = 0;
			Map<String, Integer> pairMap = new HashMap<>();

			// Calculate the number of pairs for each sock type
			for (Map.Entry<String, Integer> entry : sockMap.entrySet()) {
				String sockType = entry.getKey();
				int sockCount = entry.getValue();
				int pairs = sockCount / 2;

				if (pairs > 0) {
					pairMap.put(sockType, pairs);
					totalPairs += pairs;
				}
			}

			// Output the total number of matching pairs
			System.out.println(totalPairs + (totalPairs == 1 ? " matching pair" : " matching pairs"));

			// Output the number of pairs for each type of sock
			for (Map.Entry<String, Integer> entry : pairMap.entrySet()) {
				int pairs = entry.getValue();
				System.out.println(pairs + (pairs == 1 ? " pair " : " pairs ") + entry.getKey());
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
	
} // end class Socks