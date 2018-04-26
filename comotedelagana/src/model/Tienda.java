package model;

import java.util.HashMap;

import repositories.Reader;

public class Tienda {
	HashMap<String, Arma> armas= new HashMap<>();
	HashMap<String, Skin> skins= new HashMap<>();
	HashMap<String, Pack> packs= new HashMap<>();
	public Tienda() {
		super();
		armas=Reader.cargarArmas();
		skins=Reader.cargarSkins();
		packs=Reader.cargarPacks();
	}
	public HashMap<String, Arma> getArmas() {
		return armas;
	}
	public void setArmas(HashMap<String, Arma> armas) {
		this.armas = armas;
	}
	public HashMap<String, Skin> getSkins() {
		return skins;
	}
	public void setSkins(HashMap<String, Skin> skins) {
		this.skins = skins;
	}
	public HashMap<String, Pack> getPacks() {
		return packs;
	}
	public void setPacks(HashMap<String, Pack> packs) {
		this.packs = packs;
	}
	

}
