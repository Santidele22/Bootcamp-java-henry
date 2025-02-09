import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Expense {
    private Integer Expenseid , lastId = 0;
    private BigDecimal amount;
    private LocalDateTime date;
    private Category category;
    private String desc;

    public Expense(BigDecimal amount, LocalDateTime date, Category category, String desc) {
        this.lastId++;
        this.Expenseid = this.lastId;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.desc = desc;
    }
}
