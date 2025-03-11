package lk.ijse.voaestheticlounge.repo;

import lk.ijse.voaestheticlounge.dto.CartDTO;
import lk.ijse.voaestheticlounge.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartReposittory extends JpaRepository<Cart,Long> {
    List<CartDTO> findByUserId(Long userId);
}
