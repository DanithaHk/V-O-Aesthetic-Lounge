package lk.ijse.voaestheticlounge.repo;

import lk.ijse.voaestheticlounge.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
}
