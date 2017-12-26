package udemy.invoice;

import java.util.Calendar;
import java.util.Objects;

public class Invoice {

    private Calendar date;
    private String customer;
    private double amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.amount, amount) == 0 &&
                Objects.equals(date, invoice.date) &&
                Objects.equals(customer, invoice.customer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(date, customer, amount);
    }

    public Invoice(Calendar date, String customer, double amount) {
        this.date = date;
        this.customer = customer;
        this.amount = amount;
    }
    public Calendar getDate() {
        return date;
    }
    public String getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }


}