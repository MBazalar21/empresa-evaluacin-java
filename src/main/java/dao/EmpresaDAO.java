@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    @NotNull
    private String ruc;

    @NotNull
    private String RazonSocial;

    private String direccion;

    @NotNull
    private boolean estado;


}