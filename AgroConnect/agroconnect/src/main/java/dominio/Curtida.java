package dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Curtida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String usuarioFK;
	
	@Column(length = 100)
	private String postagemFk;
	
	@Column
	private LocalDateTime dataCriacao;
	
	@Column
	private Boolean curtida;
	
	@Column
	private LocalDate dataAtualizacao;
	
	@Column
	private LocalDateTime ultimaCurtida;
	
	@ManyToOne
    private Usuario usuario;
	
	@ManyToOne
    private Postagem postagem;

	public Curtida() {
		super();
	}

	public Curtida(Long id, String usuarioFK, String postagemFk, LocalDateTime dataCriacao, Boolean curtida,
			LocalDate dataAtualizacao, LocalDateTime ultimaCurtida, Usuario usuario, Postagem postagem) {
		super();
		this.id = id;
		this.usuarioFK = usuarioFK;
		this.postagemFk = postagemFk;
		this.dataCriacao = dataCriacao;
		this.curtida = curtida;
		this.dataAtualizacao = dataAtualizacao;
		this.ultimaCurtida = ultimaCurtida;
		this.usuario = usuario;
		this.postagem = postagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuarioFK() {
		return usuarioFK;
	}

	public void setUsuarioFK(String usuarioFK) {
		this.usuarioFK = usuarioFK;
	}

	public String getPostagemFk() {
		return postagemFk;
	}

	public void setPostagemFk(String postagemFk) {
		this.postagemFk = postagemFk;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Boolean getCurtida() {
		return curtida;
	}

	public void setCurtida(Boolean curtida) {
		this.curtida = curtida;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public LocalDateTime getUltimaCurtida() {
		return ultimaCurtida;
	}

	public void setUltimaCurtida(LocalDateTime ultimaCurtida) {
		this.ultimaCurtida = ultimaCurtida;
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
		return "Curtida [id=" + id + ", usuarioFK=" + usuarioFK + ", postagemFk=" + postagemFk + ", dataCriacao="
				+ dataCriacao + ", curtida=" + curtida + ", dataAtualizacao=" + dataAtualizacao + ", ultimaCurtida="
				+ ultimaCurtida + ", usuario=" + usuario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(curtida, dataAtualizacao, dataCriacao, id, postagem, postagemFk, ultimaCurtida, usuario,
				usuarioFK);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Curtida))
			return false;
		Curtida other = (Curtida) obj;
		return Objects.equals(curtida, other.curtida) && Objects.equals(dataAtualizacao, other.dataAtualizacao)
				&& Objects.equals(dataCriacao, other.dataCriacao) && Objects.equals(id, other.id)
				&& Objects.equals(postagem, other.postagem) && Objects.equals(postagemFk, other.postagemFk)
				&& Objects.equals(ultimaCurtida, other.ultimaCurtida) && Objects.equals(usuario, other.usuario)
				&& Objects.equals(usuarioFK, other.usuarioFK);
	}

	
	
	
}
