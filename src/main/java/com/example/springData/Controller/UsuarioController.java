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
import com.example.springData.Entity.Usuario;
import com.example.springData.Service.IUsuarioService;


@Controller
@RequestMapping("/usuario")
public class UsuarioController{
    @Autowired
    private IUsuarioService service;

    @GetMapping("/listar")
    public String saludar(Model model){
        model.addAttribute("usuarios",service.findAll());
        return "listar";
    }
    @GetMapping("/registrar")
    public String renderizarTemplate(Model model){
        model.addAttribute("usuario",new Usuario());
        return "form";
    }
    @PostMapping("/registrar")
    public String guardarUsuario(@Valid Usuario usuario,Model model){
        
        service.save(usuario);
        return "redirect:/usuario/listar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id){
        if(id>0){
            service.delete(id);
        }
        return "redirect:/usuario/listar";
    }
    @GetMapping("/editar/{id}")
    public String editarUsuario(@PathVariable Long id,Model model){
        Optional<Usuario>usuario = service.findOne(id);
        model.addAttribute("usuario",usuario);
        return "form";
    }
    
    
}
