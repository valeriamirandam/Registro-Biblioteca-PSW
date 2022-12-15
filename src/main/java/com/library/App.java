package com.library;

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
                input.close();
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
		System.out.println("0. Salir. \n1. Registrar un libro. \n2. Buscar un libro. \n3. Editar un libro. \n4. Eliminar registro de libro. \n5. Cambiar estado de un libro. \n");
		System.out.println("Elige una opcion a realizar: ");
        int x = Verificar(0,5);
        System.out.println("Opción elegida: "+x);
    }
}
