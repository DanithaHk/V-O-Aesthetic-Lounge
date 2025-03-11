package lk.ijse.voaestheticlounge.service.impl;

import lk.ijse.voaestheticlounge.dto.BookingDTO;
import lk.ijse.voaestheticlounge.entity.Booking;
import lk.ijse.voaestheticlounge.repo.BookingRepository;
import lk.ijse.voaestheticlounge.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public void save(BookingDTO bookingDTO) {
        bookingRepository.save(modelMapper.map(bookingDTO, Booking.class));
    }

    @Override
    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public void update(Long id, BookingDTO bookingDTO) {
        Booking exBooking = bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found with ID: "+id));
       exBooking.setUser(bookingDTO.getUser());
       exBooking.setService(bookingDTO.getService());
       exBooking.setAppointmentDate(bookingDTO.getAppointmentDate());
       exBooking.setPayment(bookingDTO.getPayment());
        bookingRepository.save(exBooking);
    }

    @Override
    public List<BookingDTO> getAll() {
        return modelMapper.map(bookingRepository.findAll(),new TypeToken<List<BookingDTO>>() {}.getType());
    }
}
