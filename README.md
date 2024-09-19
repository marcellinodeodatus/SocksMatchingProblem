# Sock Matching Problem
## This repository contains two Java programs that solve variations of the Sock Matching Problem:

### Socks.java: 
Matches socks that are identical in both color and adjective.
### SocksExtraCredit.java:
Matches socks that share either the same color or adjective.

## Table of Contents
<p>Problem Description</p>
<p>Features</p>
<p>Requirements</p>
How to Compile and Run
Program Details
Socks.java
SocksExtraCredit.java
Problem Description
<p> You have a drawer of socks, where each sock has two attributes: a color and an adjective. The goal is to find matching pairs of socks.</p>

In Socks.java, two socks form a pair if both the color and the adjective are the same.
In SocksExtraCredit.java, two socks form a pair if either the color or the adjective matches.
Sample Input:
mathematica
Copy code
11
Blue Casual
Gray Athletic
Blue Athletic
Blue Casual
Red Athletic
Green Casual
Red Athletic
Blue Casual
Blue Athletic
Red Athletic
Red Athletic
Expected Output (for Extra Credit):
mathematica
Copy code
5 matching pairs
Blue Casual and Blue Casual
Blue Casual and Green Casual
Blue Athletic and Blue Athletic
Red Athletic and Red Athletic
Red Athletic and Red Athletic
Features
Socks.java:

Reads sock data from a file.
Finds matching pairs based on exact matches of both color and adjective.
Outputs the number of pairs and the count for each pair type.
SocksExtraCredit.java:

Matches socks if either the color or the adjective matches.
Lists the exact socks in each matching pair.
Tracks which socks have already been paired.
Requirements
Java Development Kit (JDK) 8 or above.
A text file containing the list of socks (one per line) with the following format:
First line: Number of socks in the drawer.
Subsequent lines: Two-word description of each sock (e.g., Blue Casual).
How to Compile and Run
Clone the repository or download the Java files.

Compile the programs using the javac command:

bash
Copy code
javac Socks.java
javac SocksExtraCredit.java
Run the program by specifying the input file:

bash
Copy code
java Socks
or

bash
Copy code
java SocksExtraCredit
The program will prompt you to enter the name of the file containing the list of socks.

Example:
bash
Copy code
Enter the name of the file containing the sock information: socks.txt
Program Details
Socks.java
Purpose: Finds matching pairs of socks where both the color and the adjective are the same.
Data Structures:
Map<String, Integer>: Stores the count of each unique sock description (color and adjective).
Matching Criteria: Exact match on both color and adjective.
SocksExtraCredit.java
Purpose: Finds matching pairs of socks where either the color or the adjective matches.
Data Structures:
List<String[]>: Stores the list of all socks as arrays of two elements (color and adjective).
boolean[]: Tracks which socks have already been paired.
List<String[]>: Stores the pairs of socks that are found.
Matching Criteria: Match on either the color or the adjective.
Example Input and Output
Input File (socks.txt):
mathematica
Copy code
11
Blue Casual
Gray Athletic
Blue Athletic
Blue Casual
Red Athletic
Green Casual
Red Athletic
Blue Casual
Blue Athletic
Red Athletic
Red Athletic
Socks.java Output:
mathematica
Copy code
4 matching pairs
1 pair Blue Casual
2 pairs Red Athletic
1 pair Blue Athletic
SocksExtraCredit.java Output:
mathematica
Copy code
5 matching pairs
Blue Casual and Blue Casual
Blue Casual and Green Casual
Blue Athletic and Blue Athletic
Red Athletic and Red Athletic
Red Athletic and Red Athletic

