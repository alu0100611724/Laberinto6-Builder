package main;

import producto.Laberinto;
import director.CreadorJuegosLab;


public class Main {

	public static void main(String[] args) {
		
		/* ------- HAY QUE HACER UN MENU PARA QUE EL CLIENTE ELIJA COMO SE CREARA EL LABERINTO -------- */
		
		CreadorJuegosLab fabricaLab = new CreadorJuegosLab();
		
		System.out.println("\nMortal Kombat Maze\n");
		Laberinto laberintoLucha = fabricaLab.CreaKombats();
		laberintoLucha.play();
		
		System.out.println("\nHogwarts Maze\n");
		Laberinto hogwarts = fabricaLab.CreaHogwarts();
		hogwarts.play();
		
	}

}

