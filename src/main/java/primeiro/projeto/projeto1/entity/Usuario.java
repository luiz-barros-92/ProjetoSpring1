package primeiro.projeto.projeto1.entity;

import jakarta.persistence.*;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;
	
	@ManyToOne
	private Perfis perfis;
		
	public Usuario() {
		
	}	
	
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

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

	public Perfis getPerfis() {
		return perfis;
	}

	public void setPerfis(Perfis perfis) {
		this.perfis = perfis;
	}
	
	
	
}
