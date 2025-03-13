package lk.ijse.voaestheticlounge.service.impl;

import lk.ijse.voaestheticlounge.dto.AppoimentDTO;

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
    public void save(AppoimentDTO bookingDTO) {

    }

    @Override
    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public void update(Long id, AppoimentDTO bookingDTO) {

    }

    @Override
    public List<AppoimentDTO> getAll() {
        return modelMapper.map(bookingRepository.findAll(),new TypeToken<List<AppoimentDTO>>() {}.getType());
    }
}
