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
				
			createUser("Teste1", "teste1@testador.org");
			createUser("João", "joao@john.com");
			createUser("Luiz", "luiz@ludwig.org");
		
			}
		
		repositorioDeUsuario.deleteById(253L);
		
		}
	
	public void createUser(String nome, String email) {
		
		Usuario usuario = new Usuario(nome, email);
		
		repositorioDeUsuario.save(usuario);
	}

		
	}


