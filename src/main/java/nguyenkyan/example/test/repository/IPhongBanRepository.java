package nguyenkyan.example.test.repository;

import nguyenkyan.example.test.enity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan, String> {
}
