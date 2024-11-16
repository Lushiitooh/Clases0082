package m4s17.ejercicio3.menus;

import m4s17.ejercicio3.model.Categoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubMenuCategorias {
    private List<Categoria> categoriaList = new ArrayList<>();

    public SubMenuCategorias() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("--- Listar Categorias ---");
            System.out.println("1. agregar categoria");
            System.out.println("2. Listar categoria");
            System.out.println("3. eliminar categoria");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingresar Categoria");
                    categoriaList.add(new Categoria(sc.nextLine()));
                    break;
                case 2:
                    System.out.println("Lista de productos:");
                    if(categoriaList.isEmpty()){
                        System.out.println("Categoria no disponible");
                    }else {
                        for (int i = 0; i < categoriaList.size(); i++) {
                            System.out.println((i + 1) + ". " + categoriaList.get(i).getNombre());
                        }
                    }
                    break;
                case 3:
                    System.out.println("ingrese el nombre de la categoria a eliminar");
                    categoriaList.remove((new Categoria(sc.nextLine())));
                    break;
                case 4:
                    System.out.println("Salir");
                };
            }while(opcion != 4);

        }
    }

