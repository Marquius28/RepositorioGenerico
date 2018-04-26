package model;

public class Arma {
	private long id;
	private String nombre;
	private Rareza rareza;
	private int numBalas;
	private float daño;
	private float precio;
	private String img;

	public Arma(long id, String nombre, Rareza rareza, int numBalas, float daño,
			float precio, String img) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rareza = rareza;
		this.numBalas = numBalas;
		this.daño = daño;
		this.precio = precio;
		this.img = img;
	}

	@Override
	public String toString() {
		return "Arma [id=" + id + ", nombre=" + nombre + ", rareza=" + rareza
				+ ", numBalas=" + numBalas + ", daño=" + daño + ", precio="
				+ precio + ", img=" + img + "]";
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
		Arma other = (Arma) obj;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Rareza getRareza() {
		return rareza;
	}

	public void setRareza(Rareza rareza) {
		this.rareza = rareza;
	}

	public int getNumBalas() {
		return numBalas;
	}

	public void setNumBalas(int numBalas) {
		this.numBalas = numBalas;
	}

	public float getDaño() {
		return daño;
	}

	public void setDaño(float daño) {
		this.daño = daño;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
