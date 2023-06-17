
package lab9p1_diegoalberto;

/**
 *
 * @author 50432
 */
public class Libros {
     
    private String titulo;
    private String nombre_a;
    private String gen;
    private int edamin;
    
    public Libros(){
    }
    public Libros(String titulo2 ,String nombre_a2,String gen2,int edamin2){
        
        this.titulo = titulo2;
        this.nombre_a = nombre_a2;
        this.gen = gen2;
        this.edamin = edamin2;
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNombre_a() {
        return nombre_a;
    }

    public String getGen() {
        return gen;
    }

    public int getEdamin() {
        return edamin;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNombre_a(String nombre_a) {
        this.nombre_a = nombre_a;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setEdamin(int edamin) {
        this.edamin = edamin;
    }
    
}
