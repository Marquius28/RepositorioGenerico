package repositories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Arma;
import model.Pack;
import model.Rareza;
import model.Skin;

public class Reader {

	public static BufferedReader b;
	private static final String PACK_FILE = "src/data/pack.dat";
	private static final String SKIN_FILE =  "src/data/skins.dat";
	private static final String ARMA_FILE =  "src/data/arma.dat";

	public static HashMap<String, Arma> cargarArmas() {
		List<String> lines = readFile(ARMA_FILE);
		HashMap<String, Arma> armas = new HashMap<>();
		for (String line : lines) {
			String[] data = line.split("@");
			long id = Long.parseLong(data[0]);
			String nombre = data[1];
			Rareza rareza = Rareza.valueOf(data[2]);
			int numBalas = Integer.parseInt(data[3]);
			float daño = Float.parseFloat(data[4]);
			float precio = Float.parseFloat(data[5]);
			String img = data[6];
			Arma arma = new Arma(id, nombre, rareza, numBalas, daño, precio,
					img);
			armas.put("" + id, arma);
		}
		return armas;
	}

	public static HashMap<String, Skin> cargarSkins() {
		List<String> lines = readFile(SKIN_FILE);
		HashMap<String, Skin> skins = new HashMap<>();
		for (String line : lines) {
			String[] data = line.split("@");
			long id = Long.parseLong(data[0]);
			String nombre = data[3];
			Rareza rareza = Rareza.valueOf(data[1]);
			float precio = Float.parseFloat(data[2]);
			String img = data[4];
			Skin skin = new Skin(id, rareza, precio, nombre, img);
			skins.put("" + id, skin);
		}
		return skins;
	}

	public static HashMap<String, Pack> cargarPacks() {
		List<String> lines = readFile(PACK_FILE);
		HashMap<String, Pack> packs = new HashMap<>();
		for (String line : lines) {
			String[] data = line.split("@");

			long id = Long.parseLong(data[0]);
			String nombre = data[4];
			long idSkins = Long.parseLong(data[1]);
			long idArma = Long.parseLong(data[2]);
			float precio = Float.parseFloat(data[3]);

			Pack pack = new Pack(id, idSkins, idArma, precio, nombre);
			packs.put("" + id, pack);
		}
		return packs;
	}

	private static List<String> readFile(String file) {
		List<String> lines = new ArrayList<>();
		try {
			b = new BufferedReader(new FileReader(file));
			while (b.ready()) {
				lines.add(b.readLine());
			}
		} catch (FileNotFoundException e) {
			System.out
					.println("El archivo fichero " + file + " no se encontro");
		} catch (IOException e) {
			new RuntimeException(
					"Error de entrada/salida con el fichero " + file);
		}
		return lines;
	}

}
