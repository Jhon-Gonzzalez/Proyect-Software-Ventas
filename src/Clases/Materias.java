
package Clases;

public class Materias {
    
    private String id_Materia;
    private String id_Horario;
    private String Materia;
    private String Semestre;
    private String Calendario;
    private String Hora_inicial;
    private String Hora_Final;

    public Materias() {
    }

    public Materias(String id_Materia, String id_Horario,String Materia, String Semestre, String Calendario, String Hora_inicial, String Hora_Final) {
        this.id_Materia = id_Materia;
        this.id_Horario = id_Horario;
          this.Materia = Materia;
        this.Semestre = Semestre;
        this.Calendario = Calendario;
        this.Hora_inicial = Hora_inicial;
        this.Hora_Final = Hora_Final;
    }

    //Metodos set y get
    public String getId_Materia() {
        return id_Materia;
    }
    public void setId_Materia(String id_Materia) {
        this.id_Materia = id_Materia;
    }
    public String getId_Horario() {
        return id_Horario;
    }
    public void setId_Horario(String id_Horario) {
        this.id_Horario = id_Horario;
    }
    public String getSemestre() {
        return Semestre;
    }
    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }
    public String getCalendario() {
        return Calendario;
    }
    public void setCalendario(String Calendario) {
        this.Calendario = Calendario;
    }
    public String getHora_inicial() {
        return Hora_inicial;
    }
    public void setHora_inicial(String Hora_inicial) {
        this.Hora_inicial = Hora_inicial;
    }
    public String getHora_Final() {
        return Hora_Final;
    }
    public void setHora_Final(String Hora_Final) {
        this.Hora_Final = Hora_Final;
    }
    public String getMateria() {
        return Materia;
    }
    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
}
