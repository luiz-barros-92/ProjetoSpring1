package primeiro.projeto.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import primeiro.projeto.projeto1.entity.Usuario;





@Repository
public interface RepositorioDeUsuario extends JpaRepository<Usuario, Long>{
	
		
	Usuario findByEmail(String email);
	
	}
