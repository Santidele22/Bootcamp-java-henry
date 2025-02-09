import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Expense> expenses;

    public User() {
    }

    public User(String name, String email, List<Expense> expenses) {
        this.name = name;
        this.email = email;
        this.expenses = expenses;
    }

    void addExpense(Expense expense){
        this.expenses.add(expense);
    }


    void deleteExpense(int expenseId){
       try {
           this.expenses.remove(expenseId);

       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }
    

    void updateExpense(int expenseId,Expense expense){
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
