package semana07.ejercicio_UFPSO.model;

public class Proyecto {
    private final String titulo;
    private final Estudiante autor;

    public Proyecto(String titulo, Estudiante autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Estudiante getAutor() {
        return autor;
    }


    @Override
    public String toString(){
        return "Proyecto {"+titulo+"}"+",autor{"+autor.getNombre()+"}";
    }
}
