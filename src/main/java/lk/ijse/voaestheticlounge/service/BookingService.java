package lk.ijse.voaestheticlounge.service;

import lk.ijse.voaestheticlounge.dto.BookingDTO;

import java.util.List;

public interface BookingService {
    void save(BookingDTO bookingDTO);

    void delete(Long id);

    void update(Long id, BookingDTO bookingDTO);

    List<BookingDTO> getAll();
}
