package dominio;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String usuarioFk;
	
	@Column(length = 40)
	private String titulo;
	
	@Lob
	@Column(length = 500)
	private String conteudo;
	
	@Column (length = 10)
	private String tipoPost;
	
	@Column
	private LocalDate dataCriacao;
	
	@Column
	private LocalDate dataAtualizacao;
	
	@ManyToOne
    private Usuario usuario;
	
	@OneToMany(mappedBy = "postagemFk")
	private Set <Comentario> comentarios;

	public Postagem() {
		super();
	}

	public Postagem(Long id, String usuarioFk, String titulo, String conteudo, String tipoPost, LocalDate dataCriacao,
			LocalDate dataAtualizacao, Usuario usuario) {
		super();
		this.id = id;
		this.usuarioFk = usuarioFk;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.tipoPost = tipoPost;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuarioFk() {
		return usuarioFk;
	}

	public void setUsuarioFk(String usuarioFk) {
		this.usuarioFk = usuarioFk;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getTipoPost() {
		return tipoPost;
	}

	public void setTipoPost(String tipoPost) {
		this.tipoPost = tipoPost;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
		result = prime * result + ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipoPost == null) ? 0 : tipoPost.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((usuarioFk == null) ? 0 : usuarioFk.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Postagem other = (Postagem) obj;
		if (conteudo == null) {
			if (other.conteudo != null)
				return false;
		} else if (!conteudo.equals(other.conteudo))
			return false;
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null)
				return false;
		} else if (!dataAtualizacao.equals(other.dataAtualizacao))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipoPost == null) {
			if (other.tipoPost != null)
				return false;
		} else if (!tipoPost.equals(other.tipoPost))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (usuarioFk == null) {
			if (other.usuarioFk != null)
				return false;
		} else if (!usuarioFk.equals(other.usuarioFk))
			return false;
		return true;
	}
	
}
