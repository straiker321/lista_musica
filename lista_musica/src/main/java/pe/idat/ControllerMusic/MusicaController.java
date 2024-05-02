package pe.idat.ControllerMusic;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.idat.entity.Musica;
import pe.idat.services.CategoriaService;
import pe.idat.services.ImagenService;
import pe.idat.services.MusicaService;

@Controller
public class MusicaController {
	@Autowired
	private MusicaService musicaService;
	
	@Autowired
	private ImagenService imagenService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value="/musica_listar",method=RequestMethod.GET)
    public String listar_GET(Map map) {
		map.put("bMusica",musicaService.findAll());
            return "musica_listar";
    }

	@RequestMapping(value="/musica_registrar",method=RequestMethod.GET)
    public String registrar_GET(Model model,Map map)
    {
		Musica musicaModel=new Musica();
		model.addAttribute("musica",musicaModel);
		map.put("bImagen",imagenService.findAll());
		map.put("bCategoria",categoriaService.findAll());
            return "musica_registrar";
    }
	
	 @RequestMapping(value="/musica_registrar",method=RequestMethod.POST)
	    public String registrar_POST(Musica musica)
	    {
	        musicaService.insert(musica);
	        return "redirect:/musica_listar";
	    }
	 
	 @RequestMapping(value="/musica_editar/{musicaId}",method=RequestMethod.GET)
	    public String editar_GET(Model model,@PathVariable Integer musicaId)
	    {
		 Musica musicaModel=musicaService.findById(musicaId);
		 model.addAttribute("musica",musicaModel);
	        return "musica_editar";
	       
	    }
	 
	 @RequestMapping(value="/musica_editar/{musicaId}",method=RequestMethod.POST)
	    public String editar_POST(Musica musica,@PathVariable Integer musicaId)
	    {
	        musicaService.update(musica);
	        return "redirect:/musica_listar";
	    }

	 @RequestMapping(value="/musica_borrar/{musicaId}",method=RequestMethod.GET)
	    public String borrar_GET(Model model,Map map,@PathVariable Integer musicaId)
	    {
	        Musica musicamodel=musicaService.findById(musicaId);
	        model.addAttribute("musica",musicamodel);
	        return "musica_borrar";
	    }
	    
	 @RequestMapping(value="/musica_borrar/{musicaId}",method=RequestMethod.POST)
	    public String borrar_POST(Musica musica)
	    {
	        musicaService.delete(musica.getMusicaId());
	        return "redirect:/musica_listar";
	    }
	    
	@RequestMapping(value="/musica_detalle/{nombre}",method=RequestMethod.GET)
	   	public String detalle_GET(Map map,@PathVariable String nombre)
		{
			Musica musicaModel=musicaService.findByNombre(nombre);
			map.put("musica",musicaModel);
			return "musica_detalle";
		}
	@RequestMapping(value="/musica_productor_listar",method=RequestMethod.GET)
    public String MusicaProductor_GET(Map map) {
		map.put("bMusicaProductor",musicaService.findAll_MusicasProductores());
            return "/MusicaProductor/listar";
    }
	
}