import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Expense {
    private static int lastId = 0;
    private Integer Expenseid;
    private BigDecimal amount ;
    private LocalDateTime date;
    private Category category;
    private String desc;

    public Expense(BigDecimal amount, LocalDateTime date, Category category, String desc) {
        this.Expenseid = ++lastId;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.desc = desc;
    }

    public Integer getExpenseid() {
        return Expenseid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
