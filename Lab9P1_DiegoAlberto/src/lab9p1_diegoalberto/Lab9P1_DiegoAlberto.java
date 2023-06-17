package lab9p1_diegoalberto;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab9P1_DiegoAlberto {

    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);
    static ArrayList<Libros> libros = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        System.out.println("Ingrse una opcion");
        System.out.println("1.Libros y más Libros REMASTERED");
        System.out.println("2. Salir");
        opcion = sc.nextInt();
        int validacion = 0;
        while (opcion != 2) {
            switch (opcion) {

                case 1: {
                    System.out.println("1. Agregar Libro");
                    System.out.println("2. Listar libros");
                    System.out.println("3. Modificar libro");
                    System.out.println("4. Eliminar libro");
                    System.out.println("5. Buscar libro por titulo");
                    System.out.println("6. Buscar libros según autor");
                    System.out.println("7. Búsqueda con filtro de genero");
                    System.out.println("8. Volver al menu principal");
                    int op = sc.nextInt();
                    while (op != 9) {
                        switch (op) {
                            case 1:
                                agregarLibro();
                                validacion++;
                                break;
                            case 2:
                                if (validacion <= 0) {
                                    System.out.println("Primero debe agregar un libro.");
                                } else {
                                    listarLibros();
                                }
                                break;
                            case 3:
                                if (validacion <= 0) {
                                    System.out.println("Primero debe agregar un libro.");
                                } else {
                                    modificarLibro();
                                }
                                break;
                            case 4:
                                if (validacion <= 0) {
                                    System.out.println("Primero debe agregar un libro.");
                                } else {
                                    eliminarLibro();
                                }
                                break;
                            case 5:
                                if (validacion <= 0) {
                                    System.out.println("Primero debe agregar un libro.");
                                } else {
                                    buscarLibroPorTitulo();
                                }
                                break;
                            case 6:
                                if (validacion <= 0) {
                                    System.out.println("Primero debe agregar un libro.");
                                } else {
                                    buscarLibrosPorAutor();
                                }
                                break;
                            case 7:
                                if (validacion <= 0) {
                                    System.out.println("Primero debe agregar un libro.");
                                } else {
                                    buscarLibrosPorGenero();
                                }
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                                break;
                        }

                        
                        System.out.println("2. Listar libros");
                        System.out.println("3. Modificar libro");
                        System.out.println("4. Eliminar libro");
                        System.out.println("5. Buscar libro por título");
                        System.out.println("6. Buscar libros según autor");
                        System.out.println("7. Búsqueda con filtro de género");
                        System.out.println("8. Volver al menú principal");
                        opcion = sc.nextInt();
                    }
                }

                break;
                case 2: {
                    System.out.println("Adios :v");

                    break;
                }
                default:

            }

        }
    }//fin de mrtodo main

    public static void agregarlibro() {
        sc.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el título del libro:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el nombre del autor:");
        String nombre_a = sc.nextLine();
        System.out.println("Ingrese el género del libro:");
        String gen = sc.nextLine();
        System.out.println("Ingrese la edad mínima para leer el libro:");
        int edadm = sc.nextInt();

        Libros libro = new Libros(titulo, nombre_a, gen, edadm);
        libros.add(libro);

        System.out.println("Se ah agregado el libro");

    }

    public static void listarLibros() {

        for (Libros libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getNombre_a());
            System.out.println("Género: " + libro.getGen());
            System.out.println("Edad mínima: " + libro.getEdamin());
        }

    }public static void agregarLibro() {
        System.out.println("\nIngrese un libro");
        System.out.println("Título del libro:");
        String titulo = scs.nextLine();
        System.out.println("Nombre del autor:");
        String nombreAutor = scs.nextLine();
        System.out.println("Género del libro:");
        String genero = scs.nextLine();
        System.out.println("Edad mínima para el libro:");
        int edadMinima = sc.nextInt();

        Libros libro = new Libros(titulo, nombreAutor, genero, edadMinima);
        libros.add(libro);
        
        System.out.println("Libro agregado con éxito.");
    }

    public static void listarLibros() {
        System.out.println("Listado de libros:");
        for (Libros libro : libros) {
            System.out.println(libro);
        }
    }


    public static void modificarLibro() {
        System.out.println("\nIngrese el título del libro a modificar:");
        String titulo = scs.nextLine();

        boolean encontrado = false;
        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Ingrese el nuevo título:");
                String nuevoTitulo = scs.nextLine();
                System.out.println("Ingrese el nuevo nombre del autor:");
                String nuevoNombreAutor = scs.nextLine();
                System.out.println("Ingrese el nuevo género:");
                String nuevoGenero = scs.nextLine();
                System.out.println("Ingrese la nueva edad mínima:");
                int nuevaEdadMinima = sc.nextInt();

                libro.setTitulo(nuevoTitulo);
                libro.setNombre_a(nuevoNombreAutor);
                libro.setGen(nuevoGenero);
                libro.setEdamin(nuevaEdadMinima);

                encontrado = true;
                System.out.println("Libro modificado con éxito.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }

    public static void eliminarLibro() {
        System.out.println("\nIngrese el título del libro a eliminar:");
        String titulo = scs.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                libros.remove(i);
                encontrado = true;
                
                System.out.println("Libro eliminado con éxito.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }

    public static void buscarLibroPorTitulo() {
        System.out.println("\nIngrese el título del libro a buscar:");
        String titulo = scs.nextLine();

        boolean encontrado = false;
        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(libro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }

    public static void buscarLibrosPorAutor() {
        System.out.println("\nIngrese el nombre del autor a buscar:");
        String nombreAutor = scs.nextLine();

        boolean encontrado = false;
        for (Libros libro : libros) {
            if (libro.getNombre_a().equalsIgnoreCase(nombreAutor)) {
                System.out.println(libro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros del autor especificado.");
        }
    }

    public static void buscarLibrosPorGenero() {
        System.out.println("\nIngrese el género a buscar:");
        String genero = scs.nextLine();

        boolean encontrado = false;
        for (Libros libro : libros) {
            if (libro.getGen().equalsIgnoreCase(genero)) {
                System.out.println(libro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros del género especificado.");
        }
    }
}


