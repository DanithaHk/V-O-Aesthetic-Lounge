package lk.ijse.voaestheticlounge.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Bookings booking;

    private double amount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod method; // CREDIT_CARD, PAYPAL, BANK_TRANSFER

    private LocalDateTime paymentDate;

    public enum PaymentMethod {
        CREDIT_CARD, PAYPAL, BANK_TRANSFER
    }

    public Payment(Long id, Bookings booking, double amount, PaymentMethod method, LocalDateTime paymentDate) {
        this.id = id;
        this.booking = booking;
        this.amount = amount;
        this.method = method;
        this.paymentDate = paymentDate;
    }

    public Payment() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Bookings getAppoiment() {
        return booking;
    }

    public void setAppoiment(Bookings booking) {
        this.booking = booking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", booking=" + booking +
                ", amount=" + amount +
                ", method=" + method +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
