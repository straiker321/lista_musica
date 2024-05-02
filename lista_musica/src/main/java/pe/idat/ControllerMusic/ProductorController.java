package pe.idat.ControllerMusic;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import pe.idat.entity.Productor;
import pe.idat.services.ProductorService;

@Controller
public class ProductorController {
	@Autowired
	private ProductorService productorService;
	
	@RequestMapping(value="/productor_listar",method=RequestMethod.GET)
    public String listar_GET(Map map) {
		map.put("bProductor",productorService.findAll());
            return "/Productor/listar";
    }
	
	@RequestMapping(value="/productor_registrar",method=RequestMethod.GET)
    public String registrar_GET(Model model)
    {
		model.addAttribute("productor",new Productor());
			return "/Productor/registrar";
    }
	
	@RequestMapping(value="/productor_registrar",method=RequestMethod.POST)
    public String registrar_POST(Productor productor)
    {
       
        productorService.insert(productor);
        return "redirect:/productor_listar";
    }
	
	@RequestMapping(value="/productor_editar/{productorId}",method=RequestMethod.GET)
    public String editar_GET(Model model,@PathVariable Integer productorId)
    {
	 Productor productorModel=productorService.findById(productorId);
	 model.addAttribute("productor",productorModel);
        return "/Productor/editar";
       
    }
	
	 @RequestMapping(value="/productor_editar/{productorId}",method=RequestMethod.POST)
	    public String editar_POST(Productor productor,@PathVariable Integer productorId)
	    {
	        productorService.update(productor);
	        return "redirect:/productor_listar";
	    }
	 
	 @RequestMapping(value="/productor_borrar/{productorId}",method=RequestMethod.GET)
	    public String borrar_GET(Model model,@PathVariable Integer productorId)
	    {
			Productor productorModel= productorService.findById(productorId);
			model.addAttribute("productor",productorModel);
	        
	        return "/Productor/borrar";
	    }
		
		@RequestMapping(value="/productor_borrar/{productorId}",method=RequestMethod.POST)
	    public String borrar_POST(Productor productor)
	    {
	    	productorService.delete(productor.getProductorId());
	        
	        return "redirect:/productor_listar";
	    }
}
