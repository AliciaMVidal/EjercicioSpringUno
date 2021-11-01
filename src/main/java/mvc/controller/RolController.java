package mvc.controller;

import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.RolesDAO;
import dao.UsuariosDAO;
import mvc.model.Roles;
import mvc.model.Usuarios;
import util.HibernateUtil;

@Controller
public class RolController {
	
	
	//Ir al jsp de altarol llamandolo desde el menu
	//crear el atributo qeu va en el form apra dar de alta un neuvo rol
	@RequestMapping(value="/altaRol")
	public String showRegisterForm(Model modelo) {
		Roles rol = new Roles();
		modelo.addAttribute("nuevoRol", rol);
		
		
		return "altarol";
	}
		
	
	@RequestMapping(value="/procesarAltaRol")
	public String procesarAltaRolFormulario(@Valid @ModelAttribute("nuevoRol") Roles rol, BindingResult validationResult) {
		//si tiene errores volver a la vista de altarol
		//sino tiene errorer ir la vista confirmarregistrorol
		String vista = "";
		Session s = HibernateUtil.getSessionFactory().openSession();
	
		if(validationResult.hasErrors() == false) {
			RolesDAO.insertRoles(s, rol);
			
			vista = "confirmarRegistroRol";
		}else {
			vista="altarol";
		}
		

		return vista;
	}
		

}
