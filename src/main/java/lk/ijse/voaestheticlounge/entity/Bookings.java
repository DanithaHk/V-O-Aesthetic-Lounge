package lk.ijse.voaestheticlounge.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Bookings")
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User  user;

    private String userEmail;



    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service serviceId;
    private String serviceName;

    private LocalTime appoimentTime;



    private LocalDate appointmentDate;

    private Double price;
 // PENDING, CONFIRMED, CANCELLED


    public Bookings() {
    }

    public Bookings(Long id, User user, String userEmail, Service serviceId, String serviceName, LocalTime appoimentTime, LocalDate appointmentDate, Double price) {
        this.id = id;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Service getServiceId() {
        return serviceId;
    }

    public void setServiceId(Service serviceId) {
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
