package dominio;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Seguidor implements Set<Seguidor> {
	@Id
	@Column(length = 30)
	private String usuarioFk;
	
	@Column(length = 30)
	private String seguidorFk;
	
	@ManyToMany(mappedBy = "seguidor")
	private Set<Usuario> usuarios = new HashSet<Usuario>();

	public Seguidor() {
		super();
	}

	public Seguidor(String usuarioFk, String seguidorFk) {
		super();
		this.usuarioFk = usuarioFk;
		this.seguidorFk = seguidorFk;
	}

	public String getUsuarioFk() {
		return usuarioFk;
	}

	public void setUsuarioFk(String usuarioFk) {
		this.usuarioFk = usuarioFk;
	}

	public String getSeguidorFk() {
		return seguidorFk;
	}

	public void setSeguidorFk(String seguidorFk) {
		this.seguidorFk = seguidorFk;
	}

	@Override
	public String toString() {
		return "Seguidor [usuarioFk=" + usuarioFk + ", seguidorFk=" + seguidorFk + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(seguidorFk, usuarioFk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seguidor other = (Seguidor) obj;
		return Objects.equals(seguidorFk, other.seguidorFk) && Objects.equals(usuarioFk, other.usuarioFk);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Seguidor> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Seguidor e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Seguidor> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	
}
