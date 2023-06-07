package dominio;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String usuarioFk;
	
	@Column(length = 30)
	private String postagemFk;
	
	@Lob
	@Column
	private String conteudo;
	
	@Column
	private LocalDate dataCriacao;
	
	@Column
	private LocalDate dataAtualizacao;
	
	@ManyToOne
    private Usuario usuario;
	
	@ManyToOne
    private Postagem postagem;

	public Comentario() {
		super();
	}

	public Comentario(Long id, String usuarioFk, String postagemFk, String conteudo, LocalDate dataCriacao,
			LocalDate dataAtualizacao, Usuario usuario, Postagem postagem) {
		super();
		this.id = id;
		this.usuarioFk = usuarioFk;
		this.postagemFk = postagemFk;
		this.conteudo = conteudo;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
		this.usuario = usuario;
		this.postagem = postagem;
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

	public String getPostagemFk() {
		return postagemFk;
	}

	public void setPostagemFk(String postagemFk) {
		this.postagemFk = postagemFk;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
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
	
	public Postagem getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}

	

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", usuarioFk=" + usuarioFk + ", postagemFk=" + postagemFk + ", conteudo="
				+ conteudo + ", dataCriacao=" + dataCriacao + ", dataAtualizacao=" + dataAtualizacao + ", usuario="
				+ usuario + ", postagem=" + postagem + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudo, dataAtualizacao, dataCriacao, id, postagem, postagemFk, usuario, usuarioFk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Comentario))
			return false;
		Comentario other = (Comentario) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(dataAtualizacao, other.dataAtualizacao)
				&& Objects.equals(dataCriacao, other.dataCriacao) && Objects.equals(id, other.id)
				&& Objects.equals(postagem, other.postagem) && Objects.equals(postagemFk, other.postagemFk)
				&& Objects.equals(usuario, other.usuario) && Objects.equals(usuarioFk, other.usuarioFk);
	}
	
	
	
}
