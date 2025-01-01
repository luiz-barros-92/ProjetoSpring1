package primeiro.projeto.projeto1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import primeiro.projeto.projeto1.entity.Perfis;
import primeiro.projeto.projeto1.entity.Usuario;
import primeiro.projeto.projeto1.repository.RepositorioDePerfis;
import primeiro.projeto.projeto1.repository.RepositorioDeUsuario;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	RepositorioDePerfis repositorioDePerfis;
	@Autowired
	RepositorioDeUsuario repositorioDeUsuario;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Perfis perfis = new Perfis();
		perfis.setNome("Admin");
		
		Perfis perfis2 = new Perfis();
		perfis2.setNome("Aluno");
		
		this.repositorioDePerfis.save(perfis);
		this.repositorioDePerfis.save(perfis2);
		
		Usuario usuario = new Usuario();		
		usuario.setNome("Luiz");
		usuario.setEmail("luiz@barros.io");
		usuario.setPerfis(perfis);
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Dreadnought");
		usuario2.setEmail("dreadnought@ships.com");
		usuario2.setPerfis(perfis);
		
		this.repositorioDeUsuario.save(usuario);
		this.repositorioDeUsuario.save(usuario2);
		
		}		
	}


