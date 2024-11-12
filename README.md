# Exception handling
# Description
This Java program demonstrates basic exception handling by performing division between two integers entered by the user. If the user attempts to divide by zero, the program catches the exception and outputs an error message.

# Program Flow
The program prompts the user to enter two integers, x and y.
It attempts to calculate x / y and displays the result.
If the user enters 0 for y, a division-by-zero exception is triggered, and the program catches it, displaying a custom error message.

# Example
Division by Zero
Enter the value of x:
10
Enter the value of y:
0

!Exception caught:
Division by zero is not allowed

# Code Explanation
try block: Attempts to perform the division and handles user input.
catch block: Catches any Exception, which in this case covers ArithmeticException if the user tries to divide by zero, and displays an error message to the user.
