import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Expense> expenses;

    public User(String name, String email, List<Expense> expenses) {
        this.name = name;
        this.email = email;
        this.expenses = expenses;
    }

    void addExpense() {

    }

    void removeExpense() {

    }

    void updateExpense(Expense expense, String idExpense) {
        if (idExpense == null) {
            throw new Error("No se encuentra la expensa");
        }

    }
}
