package lk.ijse.voaestheticlounge.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String transactionId;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private String paymentMethod; // "Stripe", "PayPal", "Credit Card"

    @Column(nullable = false)
    private String paymentType; // "BOOKING" or "PRODUCT"

    @Column(nullable = true)
    private Long bookingId; // Nullable - Only for Booking Payments

    @Column(nullable = true)
    private Long productId; // Nullable - Only for Product Payments

    @Column(nullable = false)
    private String status; // "PENDING", "SUCCESS", "FAILED"

    @Column(nullable = false)
    private String createdAt;
    public enum PaymentStatus {
        PENDING,
        SUCCESS,
        FAILED
    }

    public Payment() {
    }

    public Payment(Long id, Long userId, String transactionId, double amount, String paymentMethod, String paymentType, Long bookingId, Long productId, String status, String createdAt) {
        this.id = id;
        this.userId = userId;
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentType = paymentType;
        this.bookingId = bookingId;
        this.productId = productId;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
