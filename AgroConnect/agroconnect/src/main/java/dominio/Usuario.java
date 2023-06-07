package dominio;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String nome;
	
	@Column(length = 50)
	private String email;
	
	@Column(length = 20)
	private String senha;
	
	@Column
	private LocalDateTime dataCriacao;
	
	@Column
	private LocalDateTime dataAtualizacao;

	@OneToMany(mappedBy = "usuarioFk")
	private Set <Postagem> postagens;
	
	@ManyToMany(mappedBy = "usuarioFk")
	@JoinTable(name = "usuario_seguidor",
	joinColumns = @JoinColumn(name = "usuario_codigo"),
	inverseJoinColumns = @JoinColumn(name = "seguidor_codigo"))
	private Set <Seguidor> seguidores = new HashSet<Seguidor>();
	
	@OneToMany(mappedBy = "usuarioFk")
	private Set <Curtida> curtidas;
	
	@OneToMany(mappedBy = "usuarioFk")
	private Set <Comentario> comentarios;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String nome, String email, String senha, LocalDateTime dataCriacao, LocalDateTime dataAtualizacao,
			Set<Postagem> postagens, Set<Seguidor> seguidores, Set<Curtida> curtidas, Set<Comentario> comentarios) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
		this.postagens = postagens;
		this.seguidores = seguidores;
		this.curtidas = curtidas;
		this.comentarios = comentarios;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Set<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(Set<Postagem> postagens) {
		this.postagens = postagens;
	}

	public Set<Seguidor> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Set<Seguidor> seguidores) {
		this.seguidores = seguidores;
	}

	public Set<Curtida> getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Set<Curtida> curtidas) {
		this.curtidas = curtidas;
	}

	public Set<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", dataCriacao="
				+ dataCriacao + ", dataAtualizacao=" + dataAtualizacao + ", postagens=" + postagens + ", seguidores="
				+ seguidores + ", curtidas=" + curtidas + ", comentarios=" + comentarios + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comentarios, curtidas, dataAtualizacao, dataCriacao, email, id, nome, postagens, seguidores,
				senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Usuario))
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(comentarios, other.comentarios) && Objects.equals(curtidas, other.curtidas)
				&& Objects.equals(dataAtualizacao, other.dataAtualizacao)
				&& Objects.equals(dataCriacao, other.dataCriacao) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(postagens, other.postagens) && Objects.equals(seguidores, other.seguidores)
				&& Objects.equals(senha, other.senha);
	}

	
	
}
