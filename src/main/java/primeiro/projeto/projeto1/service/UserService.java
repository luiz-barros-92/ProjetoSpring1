package primeiro.projeto.projeto1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import primeiro.projeto.projeto1.repository.RepositorioDeUsuario;
import primeiro.projeto.projeto1.entity.Usuario;

@Service
public class UserService {
	
	@Autowired
	RepositorioDeUsuario repositorioDeUsuario;
	
	public List<Usuario>findAll() {
		return repositorioDeUsuario.findAll();
	}

}
