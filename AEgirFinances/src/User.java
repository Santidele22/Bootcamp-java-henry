import Exceptions.ExpenseNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class User {
    private String name;
    private String email;
    private List<Expense> expenses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.expenses = new ArrayList<>();
    }

    void addExpense(Expense expense){
        this.expenses.add(expense);
        System.out.println("✅ Expense agregada con éxito: " + expense);

    }


    void deleteExpense(int expenseId) throws ExpenseNotFoundException {
           Iterator<Expense> iterator = expenses.iterator();
           while(iterator.hasNext()){
               if(iterator.next().getExpenseid() == expenseId){
                   iterator.remove();
                   return;
               }
           }
           throw new ExpenseNotFoundException("No se ha encontrado ningún gasto!");
    }


    void updateExpense(int expenseId,Expense updatedExpense) throws ExpenseNotFoundException {
            Optional<Expense> optionalExpense = expenses.stream().filter(expense -> expense.getExpenseid() == expenseId).findFirst();
            if(optionalExpense.isPresent()){
                Expense expense = optionalExpense.get();
                expense.setAmount(updatedExpense.getAmount());
                expense.setDesc(updatedExpense.getDesc());
                expense.setDate(updatedExpense.getDate());
                expense.setCategory(updatedExpense.getCategory());
            }else{
                throw new ExpenseNotFoundException("No se ha encontrado ningún gasto!");
            }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
