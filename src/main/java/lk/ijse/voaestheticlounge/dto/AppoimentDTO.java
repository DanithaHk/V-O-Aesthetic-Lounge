package lk.ijse.voaestheticlounge.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.voaestheticlounge.entity.Payment;
import lk.ijse.voaestheticlounge.entity.Service;
import lk.ijse.voaestheticlounge.entity.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AppoimentDTO {
    private Long id;
    private String  userId;
    private String userEmail;
    private String serviceId;
    private String serviceName;
    private LocalTime appoimentTime;
    private LocalDate appointmentDate;
    private Double price;

    public AppoimentDTO() {
    }

    public AppoimentDTO(Long id, String userId, String userEmail, String serviceId, String serviceName, LocalTime appoimentTime, LocalDate appointmentDate, Double price) {
        this.id = id;
        this.userId = userId;
        this.userEmail = userEmail;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.appoimentTime = appoimentTime;
        this.appointmentDate = appointmentDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public LocalTime getAppoimentTime() {
        return appoimentTime;
    }

    public void setAppoimentTime(LocalTime appoimentTime) {
        this.appoimentTime = appoimentTime;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}