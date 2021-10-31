package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	//Acceso por defecto importante sino no carga nada
	@RequestMapping//(value="/", method=RequestMethod.GET)
	public String defaultAccess() {
		return verPaginaInicio();
	}
	
	
	//Llamada al fichero
	@RequestMapping(value="/TestIncial")
	public String verPaginaInicio(){
		//El return es el nombre del fichero al que se esta llamando
		return "TestInicial";
	}
}
