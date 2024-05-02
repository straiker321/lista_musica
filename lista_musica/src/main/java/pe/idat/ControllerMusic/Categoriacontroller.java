package pe.idat.ControllerMusic;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.idat.entity.Categoria;
import pe.idat.services.CategoriaService;

@Controller
public class Categoriacontroller {
	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value="/categoria_listar",method = RequestMethod.GET)
    public String listar_GET(Map map) {
		map.put("bCategoria",categoriaService.findAll());
        return "/Categoria/listar";
    }
	
	@RequestMapping(value="/categoria_registrar",method=RequestMethod.GET)
    public String registrar_GET(Model model)
    {
		model.addAttribute("categoria",new Categoria());
			return "/Categoria/registrar";
    }
	
	@RequestMapping(value="/categoria_registrar",method=RequestMethod.POST)
    public String registrar_POST(Categoria categoria)
    {
       
        categoriaService.insert(categoria);
        return "redirect:/categoria_listar";
    }
	
	@RequestMapping(value="/categoria_editar/{categoriaId}",method=RequestMethod.GET)
    public String editar_GET(Model model,@PathVariable Integer categoriaId)
    {
	 Categoria categoriaModel=categoriaService.findById(categoriaId);
	 model.addAttribute("categoria",categoriaModel);
        return "/Categoria/editar";
       
    }
	
	 @RequestMapping(value="/categoria_editar/{categoriaId}",method=RequestMethod.POST)
	    public String editar_POST(Categoria categoria,@PathVariable Integer categoriaId)
	    {
	        categoriaService.update(categoria);
	        return "redirect:/categoria_listar";
	    }
	 
	 @RequestMapping(value="/categoria_borrar/{categoriaId}",method=RequestMethod.GET)
	    public String borrar_GET(Model model,@PathVariable Integer categoriaId)
	    {
			Categoria categoriaModel= categoriaService.findById(categoriaId);
			model.addAttribute("categoria",categoriaModel);
	        
	        return "/Categoria/borrar";
	    }
		
		@RequestMapping(value="/categoria_borrar/{categoriaId}",method=RequestMethod.POST)
	    public String borrar_POST(Categoria categoria)
	    {
	    	categoriaService.delete(categoria.getCategoriaId());
	        
	        return "redirect:/categoria_listar";
	    }
}
