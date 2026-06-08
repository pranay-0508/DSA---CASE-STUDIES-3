# DSA---CASE-STUDIES-3
Airline Connectivity Analysis using DSU Rollback
Overview
This project implements a Disjoint Set Union (DSU) with Rollback to analyze connectivity in an airline route network. Airports are represented as vertices and flight routes as graph edges. The DSU structure efficiently manages connected components, while the rollback feature restores previous network states after temporary changes.

Problem Statement
Airline networks frequently experience route additions and removals. The objective is to determine whether two airports remain connected after specific route modifications without rebuilding the entire network.

Features
Disjoint Set Union (DSU) implementation
Union-by-Rank optimization
Connectivity checking
Rollback functionality
Dynamic graph connectivity analysis
Efficient network management
Sample Output
AIRLINE CONNECTIVITY ANALYSIS

Creating Airline Routes...

Connectivity Check
Connected (0,3): true

Performing Rollback...

Connected (0,3): false
Time Complexity
Operation	Complexity
Find	O(log n)
Union	O(log n)
Rollback	O(1)
Applications
Airline Route Networks
Transportation Systems
Communication Networks
Dynamic Connectivity Problems
Infrastructure Monitoring
Conclusion
The DSU Rollback technique efficiently manages dynamic connectivity queries by allowing previous network states to be restored without rebuilding the graph. This makes it suitable for airline, transportation, and large-scale network analysis systems.

Author
Data Structures and Algorithms Case Study

Airline Connectivity Analysis using DSU Rollback
