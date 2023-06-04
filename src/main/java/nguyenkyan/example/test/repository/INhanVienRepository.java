package nguyenkyan.example.test.repository;

import nguyenkyan.example.test.enity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanVienRepository extends JpaRepository<NhanVien, String> {
}
