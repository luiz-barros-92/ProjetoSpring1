package primeiro.projeto.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import primeiro.projeto.projeto1.entity.Usuario;
import primeiro.projeto.projeto1.repository.RepositorioDeUsuario;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	RepositorioDeUsuario repositorioDeUsuario;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<Usuario> usuarios = repositorioDeUsuario.findAll();
		
		if (usuarios.isEmpty()) {
				
		Usuario usuario = new Usuario();		
		
		usuario.setEmail("teste@testando.com.br");
		usuario.setNome("Testador");
		
		repositorioDeUsuario.save(usuario);
		
			}
		}

		
	}


