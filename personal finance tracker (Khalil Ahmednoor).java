public class PersonalFinanceTracker {
    public static void main(String[] args) {
        // Varaibles
        String name = "Khalil  A"; // User's name
        double monthlyIncome = 2000; // Monthly income in USD
        double rentExpense = 700; // Monthly rent expense in USD
        double groceryExpense = 300; // Monthly grocery expense in USD
        double savingGoal = 500; // Desired monthly savings in USD

        // Calculating total expenses
        double totalExpenses = rentExpense + groceryExpense;

        // Calculating savings
        double savings = monthlyIncome - totalExpenses;

        // Using if-else to see goal met
        boolean isGoalMet;
        if (savings >= savingGoal) {
            isGoalMet = true; // Saving goal met
        } else {
            isGoalMet = false; // Saving goal not met
        }

        // Print income and expenses 
        System.out.printf("Welcome, %s!\n", name);
        System.out.printf("Monthly Income: $%.2f\n", monthlyIncome);
        System.out.printf("Rent Expense: $%.2f\n", rentExpense);
        System.out.printf("Grocery Expense: $%.2f\n", groceryExpense);
        System.out.printf("Total Expenses: $%.2f\n", totalExpenses);

        // Print savings and goal status
        System.out.printf("Savings: $%.2f\n", savings);
        System.out.println("Saving Goal Met: " + (isGoalMet ? "Yes" : "No"));

        // Summary
        System.out.println("\nSummary:");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Income: $%.2f\n", monthlyIncome);
        System.out.printf("Total Expenses: $%.2f\n", totalExpenses);
        System.out.printf("Savings: $%.2f\n", savings);
        System.out.println("Saving Goal Met: " + (isGoalMet ? "Yes" : "No"));
    }
}

