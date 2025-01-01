package primeiro.projeto.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import primeiro.projeto.projeto1.entity.Perfis;

@Repository
public interface RepositorioDePerfis extends JpaRepository<Perfis, Long>{

}
