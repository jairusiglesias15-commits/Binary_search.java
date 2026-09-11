# Laboratory Activity: Recursion — Recursive Binary Search

## Description
This Java program implements the recursive binary search algorithm. It takes an array size, the array elements, and a target value as input from the user. It then automatically sorts the entered array in ascending order (a requirement for binary search) before recursively searching for the target. During each recursive call, the program prints the current values of low, high, mid, and arr[mid], allowing the shrinking search interval to be traced. If the target is found, the program outputs its index; if it is not present in the array, it outputs -1.

## Programming Language
Java (JDK 21)

## How to Compile and Run
```
javac Binary_search.java
java Binary_search
```

## Sample Input and Output
```
Enter the number of elements: 7
Enter 7 numbers in sorted (ascending) order:
Element 1: 40
Element 2: 10
Element 3: 70
Element 4: 20
Element 5: 50
Element 6: 30
Element 7: 60
Sorted array: 10 20 30 40 50 60 70

Enter a number to search: 50

Trace
bSearch(low=0, high=6) -> mid=3, arr[mid]=40
50 > 40 -> search right half
bSearch(low=4, high=6) -> mid=5, arr[mid]=60
50 < 60 -> search left half
bSearch(low=4, high=4) -> mid=4, arr[mid]=50
arr[4] == 50 -> found!

Target found.
Index: 4
