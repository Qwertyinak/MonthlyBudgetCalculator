import java.util.Scanner;

public class MonthlyBudgetCalculator {
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner input = new Scanner(System.in);

        // Initialize variables for storing financial data
        double monthlyIncome = 0, rentExpense = 0, utilitiesExpense = 0, groceriesExpense = 0, entertainmentExpense = 0, savingsTarget = 0, totalExpenses = 0, monthlyBudget = 0;

        // Prompt the user to enter financial data
        try {
            System.out.print("Enter monthly income: $");
            monthlyIncome = input.nextDouble();

            System.out.print("Enter rent expense: $");
            rentExpense = input.nextDouble();

            System.out.print("Enter utilities expense: $");
            utilitiesExpense = input.nextDouble();

            System.out.print("Enter groceries expense: $");
            groceriesExpense = input.nextDouble();

            System.out.print("Enter entertainment expense: $");
            entertainmentExpense = input.nextDouble();

            System.out.print("Enter savings target: $");
            savingsTarget = input.nextDouble();
        } catch (Exception e) {
            // Handle non-numeric input by displaying an error message
            System.out.println("Please enter valid numerical values.");
            System.exit(0); // Terminate the program if non-numeric input is encountered
        }

        // Calculate total expenses
        totalExpenses = rentExpense + utilitiesExpense + groceriesExpense + entertainmentExpense;

        // Calculate the monthly budget by subtracting the total expenses and the savings target from the monthly income
        monthlyBudget = monthlyIncome - totalExpenses - savingsTarget;

        // Compare the monthly budget with the savings target
        if (monthlyBudget >= 0) {
            System.out.println("You have met your savings target. Well done!");
        } else {
            System.out.println("You have not met your savings target. Keep saving!");
        }

        // Display the summary report with the calculated financial data
        System.out.println("Monthly Budget: $" + String.format("%.2f", monthlyBudget));
        System.out.println("Rent Expense: $" + String.format("%.2f", rentExpense));
        System.out.println("Utilities Expense: $" + String.format("%.2f", utilitiesExpense));
        System.out.println("Groceries Expense: $" + String.format("%.2f", groceriesExpense));
        System.out.println("Entertainment Expense: $" + String.format("%.2f", entertainmentExpense));

        // Close the scanner to release system resources
        input.close();
    }
}
