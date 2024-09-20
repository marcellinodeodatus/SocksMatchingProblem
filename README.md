# Sock Matching Problem
This repository contains two Java programs that solve variations of the **Sock Matching Problem**:

`Socks.java`: Matches socks that are identical in both color and adjective.<br>
`SocksExtraCredit.java`: Matches socks that share either the same color or adjective.<br>

## Problem Description
You have a drawer of socks, where each sock has two attributes: a **color** and **adjective**. The goal is to find matching pairs of socks.
<ul>
<li>In **Socks.java** , two socks form a pair if both the color and the adjective are the same.</li>
<li>In **SocksExtraCredit.java** , two socks form a pair if either the color or the adjective matches.</p></li>
</ul>

<p>Sample Input:
<p>11</p>
<p>Blue Casual</p>
<p>Gray Athletic</p>
<p>Blue Athletic</p>
<p>Blue Casual</p>
<p>Red Athletic</p>
<p>Red Athletic</p>
<p>Green Casual</p>
<p>Red Athletic</p>
<p>Blue Casual</p>
<p>Blue Athletic</p>
<p>Red Athletic</p>
<p>Red Athletic</p>
</p>

<p>Expected Output (for Extra Credit):
<p>5 matching pairs</p>
<p>Blue Casual and Blue Casual</p>
<p>Blue Casual and Green Casual</p>
<p>Blue Athletic and Blue Athletic</p>
<p>Red Athletic and Red Athletic</p>
<p>Red Athletic and Red Athletic</p>

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
