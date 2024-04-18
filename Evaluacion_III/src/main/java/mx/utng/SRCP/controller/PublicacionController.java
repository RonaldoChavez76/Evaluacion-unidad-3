package mx.utng.SRCP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.SRCP.model.entity.Publicacion;
import mx.utng.SRCP.model.service.IPublicacionService;

@Controller
@SessionAttributes("publicacion")
public class PublicacionController {
    @Autowired
    private IPublicacionService service;

    @GetMapping({"/publicacion", "/publicacion/", "/publicacion/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Publicaciones");
        model.addAttribute("publicaciones", service.list());
        return "publicacion-list";
    }

    @GetMapping("/publicacion/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Publicaciones");
        model.addAttribute("publicacion", new Publicacion());
        return "publicacion-form";
    }

    @PostMapping("/publicacion/form")
    public String save(@Valid Publicacion publicacion, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Publicaciones");
            return "publicacion-form";
        }
        service.save(publicacion);
        return "redirect:/publicacion/list";
    }

    @GetMapping("/publicacion/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Publicacion publicacion = null;
        if(id>0){
            publicacion = service.getById(id);
        }else{
            return "redirect:/publicacion/list";
        }
        model.addAttribute("title", "Editar Publicacion");
        model.addAttribute("publicacion", publicacion);
        return "publicacion-form";
    }

    @GetMapping("/publicacion/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/publicacion/list";
    }
    
}
