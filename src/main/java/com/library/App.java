package com.library;

import java.util.ArrayList;
import java.util.Scanner;


public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static boolean VerificarRango(int min, int max, int x) {
		if (x <= max && x >= min) {
			return true;
		}else {
			return false;
		}
	}
    public static int Verificar(int min, int max) {
		int  x = 0;
		int y;
		boolean z;
		do {
            Scanner input = new Scanner(System.in);
			try {
				y = input.nextInt();
				z=VerificarRango(min,max,y);
				while (z==false) {
					System.out.println("Valor fuera de rango, ingrese un nuevo valor.");
					y=input.nextInt();
					z=VerificarRango(min,max,y);
				}
				x=1;
				return y;
			}catch (Exception e) {
				System.out.println("Ingrese un valor numérico: ");
                continue;
			}
		}
		while(x==0);
		return x;
	}
    public static void main(String[] args) {
		Library library = new Library();
		System.out.println("0. Salir. \n1. Registrar un libro. \n2. Buscar un libro. \n3. Editar un libro. \n4. Eliminar registro de libro. \n5. Cambiar estado de un libro. \n");
		System.out.println("Elige una opcion a realizar: ");
        int x = Verificar(0,5);
        System.out.println("Opción elegida: "+x);
		if(x==1){
			Scanner in = new Scanner(System.in);
			System.out.println("Ingrese la información del libro a continuación: \n");
			System.out.println("Título: ");
			String title = in.nextLine();
			System.out.println("Autor(es): ");
			String authors = in.nextLine();
			System.out.println("Fecha edición (en formato dd/MM/yyyy): ");
			String date = in.nextLine();
			System.out.println("Cantidad de páginas: "); 
			String pages = in.nextLine();
			System.out.println("Editorial: ");
			String editorial = in.nextLine();
			System.out.println("Género: ");
			String genre = in.nextLine();
			System.out.println("ISBN: ");
			String isbn = in.nextLine();
			System.out.println("Ubicación: ");
			String location = in.nextLine();
			System.out.println("Estado (Prestado, Disponible o Extraviado): ");
			String state = in.nextLine();
			// System.out.println("1. Prestado. \n2. Disponible. \n3. Extraviado.\n");
			// int int_state = in.nextInt();
			// String state = "";
			// if (int_state==1){
			// 	state = "Prestado";
			// }else if (int_state ==2){
			// 	state = "Disponible";
			// }else{
			// 	state = "Extraviado";
			// }
			System.out.println("Descripción: ");
			String description = in.nextLine();
			Book b = new Book(title, authors, date, pages, editorial, genre, isbn, location, state, description);
			library.addbook(b);
			b.showBook();
			in.close();
		}
    }
}
