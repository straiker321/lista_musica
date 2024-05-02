package pe.idat.ControllerMusic;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import pe.idat.entity.Imagen;
import pe.idat.services.ImagenService;
@Controller
public class ImagenController {
	@Autowired
	private ImagenService imagenService;
	@RequestMapping(value="/imagen_listar",method=RequestMethod.GET)
    public String listar_GET(Map map) {
		map.put("bImagen",imagenService.findAll());
            return "/ImagenMusic/ListarMusic";
    }
	@RequestMapping(value="/imagen_registrar",method=RequestMethod.GET)
    public String registrar_GET(Model model)
    {
		model.addAttribute("imagen",new Imagen());
			return "/ImagenMusic/registrar";
    }
	
	@RequestMapping(value="/imagen_registrar",method=RequestMethod.POST)
    public String registrar_POST(@RequestPart("picture") MultipartFile picture) throws IOException
    {
		Imagen imagen =new Imagen();
		
		imagen.setNombre(picture.getOriginalFilename());
		imagen.setFile(picture.getBytes());
		
		
        imagenService.insert(imagen);

        return "redirect:/imagen_listar";
    }
	
	@RequestMapping(value="/imagen_editar/{imagenId}",method=RequestMethod.GET)
	public String editar_GET(Model model,@PathVariable Integer imagenId)
	{
		Imagen imagenModel= imagenService.findById(imagenId);
		model.addAttribute("imagen",imagenModel);		
		return "/ImagenMusic/editar";
	}
	
	@RequestMapping(value="/imagen_editar/{imagenId}",method=RequestMethod.POST)
	public String editar_POST(Imagen imagen,@PathVariable Integer imagenId,
			@RequestParam("picture") MultipartFile picture) throws IOException
	{
        if(picture.isEmpty())
        {
        	Imagen imagenModel=imagenService.findById(imagenId);
        	imagen.setFile(imagenModel.getFile());
        }
        else {
            imagen.setFile(picture.getBytes());
        }
   		imagen.setNombre(picture.getOriginalFilename());
        imagenService.update(imagen);
		return "redirect:/imagen_listar";
	}
	
	@RequestMapping(value="/imagen_borrar/{imagenId}",method=RequestMethod.GET)
    public String borrar_GET(Model model,@PathVariable Integer imagenId)
    {
		Imagen imagenModel= imagenService.findById(imagenId);
		model.addAttribute("imagen",imagenModel);
        
        return "/ImagenMusic/borrar";
    }
	
	@RequestMapping(value="/imagen_borrar/{imagenId}",method=RequestMethod.POST)
    public String borrar_POST(Imagen imagen)
    {
    	imagenService.delete(imagen.getImagenId());
        
        return "redirect:/imagen_listar";
    }
}