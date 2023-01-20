package repository;

import dao.EmpresaDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaDAO, Long> {
    EmpresaDAO save(EmpresaDAO empresa);

    @Query(value = "SELECT e FROM Empresa e ORDER BY e.idEmpresa DESC")
    List<EmpresaDAO> findTop3ByOrderByIdEmpresaDesc();
}
