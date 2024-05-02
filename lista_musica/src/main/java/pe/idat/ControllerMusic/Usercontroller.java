package pe.idat.ControllerMusic;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.idat.services.MusicaService;
@Controller
public class Usercontroller {
	@Autowired
	private MusicaService musicaService;
	
	@RequestMapping(value="/index1",method=RequestMethod.GET)
	public String index1_GET() {
		return "index1";
	}
	
	@RequestMapping(value="/lista_musica",method=RequestMethod.GET)
	public String lista_musica_GET() {
		return "lista_musica";
	}
	
	@RequestMapping(value="/lista",method=RequestMethod.GET)
	public String lista_GET(Map map) {
		map.put("bMusica",musicaService.findAll());
		return "lista";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String user_GET() {
		return "user";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String admin_GET() {
		return "admin";
	}
	
	@RequestMapping(value="/dba",method=RequestMethod.GET)
	public String dba_GET() {
		return "dba";
	}
	
	@RequestMapping(value="/access_denied",method=RequestMethod.GET)
	public String access_denied_GET() {
		return "access_denied";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
   	public String logout(HttpServletRequest request,HttpServletResponse response) 
    {
		//obtener al usuario que está en sesión
        Authentication auth=SecurityContextHolder.getContext().getAuthentication();
  
        if(auth!=null)    
            new SecurityContextLogoutHandler().logout(request,response,auth); //cerrar sesión
        
        //redireccionar a login
        return "redirect:login?logout";
    }
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
}
