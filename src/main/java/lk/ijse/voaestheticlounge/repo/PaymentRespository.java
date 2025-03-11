package lk.ijse.voaestheticlounge.repo;

import lk.ijse.voaestheticlounge.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRespository extends JpaRepository<Payment, Long> {

}
