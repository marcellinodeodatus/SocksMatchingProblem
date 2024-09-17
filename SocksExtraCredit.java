import java.io.*;
import java.util.*;

public class SocksExtraCredit {
    public static void main(String[] args) {
        // Prompt the user for the filename
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file containing the sock information: ");
        String fileName = scanner.nextLine();
        
        // A list to store all socks
        List<String[]> socksList = new ArrayList<>();
        
        try {
            // Open the file
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            
            // Read the total number of socks (first line)
            int totalSocks = Integer.parseInt(br.readLine().trim());
            
            // Read each line representing a sock and store it in the list
            String line;
            while ((line = br.readLine()) != null) {
                // Each line contains a two-word description of a sock
                String[] sock = line.trim().split(" ");
                socksList.add(sock);
            }
            br.close();
            
            // Prepare a list for matched pairs
            List<String[]> pairs = new ArrayList<>();
            
            // Use a boolean array to track which socks are already paired
            boolean[] paired = new boolean[socksList.size()];
            
            // Try to match each sock with every other sock
            for (int i = 0; i < socksList.size(); i++) {
                if (paired[i]) continue;  // Skip already paired socks
                
                for (int j = i + 1; j < socksList.size(); j++) {
                    if (paired[j]) continue;  // Skip already paired socks
                    
                    String[] sock1 = socksList.get(i);
                    String[] sock2 = socksList.get(j);
                    
                    // Match either by color or adjective
                    if (sock1[0].equals(sock2[0]) || sock1[1].equals(sock2[1])) {
                        pairs.add(new String[] {sock1[0] + " " + sock1[1], sock2[0] + " " + sock2[1]});
                        paired[i] = true;
                        paired[j] = true;
                        break;  // Once a pair is made, stop looking for another match for sock1
                    }
                }
            }
            
            // Output the total number of matching pairs
            System.out.println(pairs.size() + (pairs.size() == 1 ? " matching pair" : " matching pairs"));
            
            // Output each matching pair
            for (String[] pair : pairs) {
                System.out.println(pair[0] + " and " + pair[1]);
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
