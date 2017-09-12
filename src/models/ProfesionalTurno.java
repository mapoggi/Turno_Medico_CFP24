package models;

public class ProfesionalTurno {
  private Integer id;
  private PersonaGenero personaGeneroId;
  private Turno turnoId;
  private PersonaEspecialidad personaEspecialidadId;
  private Integer dia;
  private String horaIni;
  private String horaFin;
  private Integer fraccion;
  private Integer discontinuar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonaGenero getPersonaGeneroId() {
        return personaGeneroId;
    }

    public void setPersonaGeneroId(PersonaGenero personaGeneroId) {
        this.personaGeneroId = personaGeneroId;
    }

    public Turno getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(Turno turnoId) {
        this.turnoId = turnoId;
    }

    public PersonaEspecialidad getPersonaEspecialidadId() {
        return personaEspecialidadId;
    }

    public void setPersonaEspecialidadId(PersonaEspecialidad personaEspecialidadId) {
        this.personaEspecialidadId = personaEspecialidadId;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getFraccion() {
        return fraccion;
    }

    public void setFraccion(Integer fraccion) {
        this.fraccion = fraccion;
    }

    public Integer getDiscontinuar() {
        return discontinuar;
    }

    public void setDiscontinuar(Integer discontinuar) {
        this.discontinuar = discontinuar;
    }
  


    
}
