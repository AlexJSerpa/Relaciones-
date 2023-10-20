# Relaciones-
Convert relation to matrix of zeros and ones 

# Relational Matrix Converter

The `Relational Matrix Converter` project is a simple Java application that allows users to visualize a relationship between pairs of numbers as a matrix of zeros and ones.

## Overview

The main idea is to transform a set of number pairs (like `{1,2}, {1,3}, {2,3}`) into a matrix where the presence of a relation is marked by `1` and the absence by `0`.

## Features

1. **Regular Expressions**: The application leverages regular expressions to efficiently extract pairs of numbers from a string input.
2. **Unique Element Identification**: Using Java's `Set` data structure, the program identifies unique elements in each group of the relational pair.
3. **Matrix Creation**: A matrix is then created to represent the relationships between the numbers. The dimensions of the matrix are based on the unique elements identified.
4. **Mapping Relationships**: The relationships are then mapped to a matrix using `0`s and `1`s. If a relationship between two numbers exists, it's marked as `1`, otherwise `0`.
5. **Display**: The resultant matrix is displayed on the console with proper headers to make it intuitive and readable.

## How to Use

1. Set your relationship string:
```java
String R = "{{1,2},{1,2},{2,2},{2,3}}";
```
2. Run the program. It will process the string and print out the relationship matrix.

## Sample Output

For the string `{{1,2},{1,2},{2,2},{2,3}}`, the output might look like:

```
   2  3
1- 1  0 
2- 1  1 
```

Where each row header represents the first number in the pair and each column header represents the second number. The matrix cells with a `1` indicate a relationship exists between the corresponding row and column numbers, and `0` indicates no relation.

## Conclusion

The `Relational Matrix Converter` project offers a clear and concise way to visualize relationships between pairs of numbers. Whether you're studying relational algebra or just looking to visualize relationships in a clear matrix format, this tool provides a simple yet effective solution.
