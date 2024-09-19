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
## Problem Description
<p> You have a drawer of socks, where each sock has two attributes: a color and an adjective. The goal is to find matching pairs of socks.
In Socks.java, two socks form a pair if both the color and the adjective are the same.
In SocksExtraCredit.java, two socks form a pair if either the color or the adjective matches.</p>

<p>Sample Input:
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
</p>
<p>Expected Output (for Extra Credit):
5 matching pairs
Blue Casual and Blue Casual
Blue Casual and Green Casual
Blue Athletic and Blue Athletic
Red Athletic and Red Athletic
Red Athletic and Red Athletic
</p>

## Features
### Socks.java:
Reads sock data from a file.
Finds matching pairs based on exact matches of both color and adjective.
Outputs the number of pairs and the count for each pair type.

### SocksExtraCredit.java:
Matches socks if either the color or the adjective matches.
Lists the exact socks in each matching pair.
Tracks which socks have already been paired.

## Requirements
<p>Java Development Kit (JDK) 8 or above.
A text file containing the list of socks (one per line) with the following format:
First line: Number of socks in the drawer.
Subsequent lines: Two-word description of each sock (e.g., Blue Casual).
</p>
