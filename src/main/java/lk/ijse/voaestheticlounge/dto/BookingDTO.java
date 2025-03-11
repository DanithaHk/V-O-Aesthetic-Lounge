package lk.ijse.voaestheticlounge.dto;

import lk.ijse.voaestheticlounge.entity.Payment;
import lk.ijse.voaestheticlounge.entity.Service;
import lk.ijse.voaestheticlounge.entity.User;

import java.time.LocalDateTime;

public class BookingDTO {
    private Long id;
    private User user;
    private Service service;
    private LocalDateTime appointmentDate;
    private Payment payment;

    public BookingDTO() {
    }

    public BookingDTO(Long id, User user, Service service, LocalDateTime appointmentDate, Payment payment) {
        this.id = id;
        this.user = user;
        this.service = service;
        this.appointmentDate = appointmentDate;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
