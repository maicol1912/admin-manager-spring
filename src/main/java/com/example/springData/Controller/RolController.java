package com.example.springData.Controller;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.springData.Entity.RolF;
import com.example.springData.Service.IRolService;



@Controller
@RequestMapping("/rol")
public class RolController{
    @Autowired
    private IRolService service;

    @GetMapping("/listar")
    public String saludar(Model model){
        model.addAttribute("roles",service.findAll());
        return "listarRol";
    }
    @GetMapping("/registrar")
    public String renderizarTemplateRol(Model model){
        model.addAttribute("rol",new RolF());
        return "formRol";
    }
    @PostMapping("/registrar")
    public String guardarRol(@Valid RolF rol,Model model){
        service.save(rol);
        return "redirect:/rol/listar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarRol(@PathVariable Long id){
        if(id>0){
            service.delete(id);
        }
        return "redirect:/rol/listar";
    }
    @GetMapping("/editar/{id}")
    public String editarRol(@PathVariable Long id,Model model){
        Optional<RolF>rol = service.findOne(id);
        model.addAttribute("rol",rol);
        return "formRol";
    }
    
    
}
