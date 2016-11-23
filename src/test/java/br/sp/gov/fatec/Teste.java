package br.sp.gov.fatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.gov.sp.fatec.model.Usuario;
import br.gov.sp.fatec.repository.UsuarioRepository;

public class Teste {
	
	@Autowired
	private static ApplicationContext context;

	
	public static void main (String[] args){
	
		Usuario usuario = new Usuario(1, "ivan", "132465");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UsuarioRepository usuarioRepo = (UsuarioRepository) context.getBean("usuarioRepository");
		
		usuarioRepo.save(usuario);
		
	}

}
