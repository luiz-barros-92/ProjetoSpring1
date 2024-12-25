package primeiro.projeto.projeto1.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;
	
	@ManyToMany
	private Set<Perfis> perfis;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Perfis> getPerfis() {
		return perfis;
	}
	public void setPerfis(Set<Perfis> perfis) {
		this.perfis = perfis;
	}	
	
	
}
