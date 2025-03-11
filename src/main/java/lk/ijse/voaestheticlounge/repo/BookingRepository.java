package lk.ijse.voaestheticlounge.repo;

import lk.ijse.voaestheticlounge.dto.BookingDTO;
import lk.ijse.voaestheticlounge.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
