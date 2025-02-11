import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        // Crear categorías
        Category foodCategory = new Category("Comida", "FOOD");
        Category transportCategory = new Category("Transporte", "TRANSPORT");
        Category entertainmentCategory = new Category("Entretenimiento", "ENTERTAINMENT");
        Category healthCategory = new Category("Salud", "HEALTH");
        Category educationCategory = new Category("Educación", "EDUCATION");

        // Crear 10 usuarios
        User user1 = new User("Juan Pérez", "juan.perez@email.com");
        User user2 = new User("Ana Gómez", "ana.gomez@email.com");
        User user3 = new User("Carlos Díaz", "carlos.diaz@email.com");
        User user4 = new User("Laura Martínez", "laura.martinez@email.com");
        User user5 = new User("Pedro Sánchez", "pedro.sanchez@email.com");
        User user6 = new User("Marta Ruiz", "marta.ruiz@email.com");
        User user7 = new User("Luis Fernández", "luis.fernandez@email.com");
        User user8 = new User("Lucía Hernández", "lucia.hernandez@email.com");
        User user9 = new User("Javier Morales", "javier.morales@email.com");
        User user10 = new User("Isabel Torres", "isabel.torres@email.com");

        // Crear algunos gastos para los usuarios
        Expense expense1 = new Expense(new BigDecimal("120.50"), LocalDateTime.now(), foodCategory, "Almuerzo");
        Expense expense2 = new Expense(new BigDecimal("200.00"), LocalDateTime.now(), transportCategory, "Boleto de tren");
        Expense expense3 = new Expense(new BigDecimal("50.00"), LocalDateTime.now(), entertainmentCategory, "Cine");
        Expense expense4 = new Expense(new BigDecimal("300.00"), LocalDateTime.now(), healthCategory, "Medicamentos");
        Expense expense5 = new Expense(new BigDecimal("50.00"), LocalDateTime.now(), foodCategory, "Cena");
        Expense expense6 = new Expense(new BigDecimal("150.00"), LocalDateTime.now(), educationCategory, "Curso de Java");
        Expense expense7 = new Expense(new BigDecimal("80.00"), LocalDateTime.now(), transportCategory, "Taxi");
        Expense expense8 = new Expense(new BigDecimal("250.00"), LocalDateTime.now(), healthCategory, "Visita médica");
        Expense expense9 = new Expense(new BigDecimal("100.00"), LocalDateTime.now(), entertainmentCategory, "Concierto");
        Expense expense10 = new Expense(new BigDecimal("60.00"), LocalDateTime.now(), foodCategory, "Desayuno");

        // Asignar los gastos a los usuarios
        user1.addExpense(expense1);
        user1.addExpense(expense2);

        user2.addExpense(expense3);
        user2.addExpense(expense4);

        user3.addExpense(expense5);
        user3.addExpense(expense6);

        user4.addExpense(expense7);
        user4.addExpense(expense8);

        user5.addExpense(expense9);
        user5.addExpense(expense10);

        // Mostrar usuarios y sus gastos
        displayUserInfo(user1);
        displayUserInfo(user2);
        displayUserInfo(user3);
        displayUserInfo(user4);
        displayUserInfo(user5);
        displayUserInfo(user6);
        displayUserInfo(user7);
        displayUserInfo(user8);
        displayUserInfo(user9);
        displayUserInfo(user10);
    }

    // Método para mostrar la información del usuario y sus gastos
    private static void displayUserInfo(User user) {
        System.out.println("Usuario: " + user.getName() + " (" + user.getEmail() + ")");
        for (Expense expense : user.getExpenses()) {
            System.out.println("  Gasto ID: " + expense.getExpenseid() + " | Monto: " + expense.getAmount() + " | Categoría: " + expense.getCategory().getName() + " | Descripción: " + expense.getDesc() + " | Fecha: " + expense.getDate());
        }
    }
}
