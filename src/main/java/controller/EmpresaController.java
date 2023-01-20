import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa){
        return empresaRepository.save(empresa);
    }

    @GetMapping
    public List<Empresa> findLastThree(){
        List<Empresa> empresas = empresaRepository.findAll();
        int size = empresas.size();
        return empresas.subList(size-3, size);
    }
}