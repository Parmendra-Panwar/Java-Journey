// 1. Package Declaration (Optional: defines the folder structure)
package com.example.myapp;

// 2. Import Files (Brings in built-in or external Java utilities)
import java.util.Scanner;  // Explicit import for user input
import java.time.LocalDate; // Explicit import for dates

// 3. Class Boilerplate
public class HelloWorld {
    
    // 4. Main Method Boilerplate
    public static void main(String[] args) {
        
        // Use an imported class (Scanner) to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Use another imported class (LocalDate)
        LocalDate today = LocalDate.now();
        
        // Output the results
        System.out.println("Hello, " + name + "!");
        System.out.println("Today's date is: " + today);
        
        // Clean up resource
        scanner.close();
    }
}
