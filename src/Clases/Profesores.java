
package Clases;

public class Profesores {
     private  int id;
     private String nombre;
     private String sexo;
     private String curso;
     private String titulo;
     private int edad;

      private String Horario;
    public Profesores() {
    }

    public Profesores(int id, String nombre, String sexo, int edad, String curso, String titulo,String Horario) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.curso = curso;
        this.titulo = titulo;
        this.Horario = Horario;
    }

    // metodos sety get
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getHorario() {
        return Horario;
    }
    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
     
}
