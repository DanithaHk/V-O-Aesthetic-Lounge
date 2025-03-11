package lk.ijse.voaestheticlounge.dto;

import jakarta.persistence.Column;
import lk.ijse.voaestheticlounge.entity.Booking;

import java.time.LocalDateTime;

public class PaymentDTO {
    private Long id;
    private Long userId;
    private double amount;
    private String paymentMethod;
    private String paymentType;
    private Long bookingId;
    private Long productId;
    private String status;

    public PaymentDTO() {
    }

    public PaymentDTO(Long id, Long userId, double amount, String paymentMethod, String paymentType, Long bookingId, Long productId, String status) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentType = paymentType;
        this.bookingId = bookingId;
        this.productId = productId;
        this.status = status;
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
}
