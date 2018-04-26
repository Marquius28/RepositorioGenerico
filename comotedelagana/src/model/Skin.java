package model;

public class Skin {
	private long id;
	private Rareza rareza;
	private float precio;
	private String nombre;
	private String img;

	public Skin(long id, Rareza rareza, float precio, String nombre,
			String img) {
		super();
		this.id = id;
		this.rareza = rareza;
		this.precio = precio;
		this.nombre = nombre;
		this.img = img;
	}

	@Override
	public String toString() {
		return "Skin [id=" + id + ", rareza=" + rareza + ", precio=" + precio
				+ ", nombre=" + nombre + ", img=" + img + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Skin other = (Skin) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Rareza getRareza() {
		return rareza;
	}

	public void setRareza(Rareza rareza) {
		this.rareza = rareza;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
