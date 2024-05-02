package pe.idat.ControllerMusic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class homecontroller {

	@RequestMapping(value="/welcome",method = RequestMethod.GET)
    public String welcome_GET() {
        return "welcome";
    }
	@RequestMapping(value="/index",method=RequestMethod.GET)
    public String index_GET() {
            return "index";
            
    }
	
	@RequestMapping(value="/inicio",method=RequestMethod.GET)
    public String inicio_GET() {
            return "inicio";
            
    }
}
