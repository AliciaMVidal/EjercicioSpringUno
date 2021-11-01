package mvc.controller;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.UsuariosDAO;
import mvc.model.Usuarios;
import util.HibernateUtil;

@Controller
public class LoginController {

	
	//Acceso por defecto importante sino no carga nada
	@RequestMapping//(value="/", method=RequestMethod.GET)
	public String defaultAccess() {
		return verPaginaInicio();
	}
	
	
	//Llamada al fichero
	@RequestMapping(value="/verPaginaInicio")
	public String verPaginaInicio(){
		//El return es el nombre del fichero al que se esta llamando
		return "index";
	}
	
	//Hacer el login
	@RequestMapping(value="/hacerLogin")
	public String hacerLogin(@RequestParam("username")String username, @RequestParam("password") String password,Model modelo) {
		
		String vista = "";
		Session s = HibernateUtil.getSessionFactory().openSession();
		Usuarios usuario = UsuariosDAO.getUsuarioLogin(s, username, password);
		
		
		if(usuario == null) {
			//si el usuario es nulo, no existe ir a la vista de error/login otra vez
			vista = "index";
		}else {
			//si el usuario existe ir al menu
			modelo.addAttribute("nombre", usuario);
			vista = "menu";
		}
		
		return vista;
		
	}
	
}
