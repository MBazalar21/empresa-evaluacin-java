package dao;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpresaDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    @Nonnull
    private String ruc;

    @Nonnull
    private String RazonSocial;

    @Nonnull
    private String direccion;

    @Nonnull
    private boolean estado;


}