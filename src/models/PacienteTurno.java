package models;

public class PacienteTurno {
    private Integer id;
    private Persona personaId;
    private ProfesionalTurno profTurnoId;
    private Integer hora;
    private Integer cancelado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public ProfesionalTurno getProfTurnoId() {
        return profTurnoId;
    }

    public void setProfTurnoId(ProfesionalTurno profTurnoId) {
        this.profTurnoId = profTurnoId;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getCancelado() {
        return cancelado;
    }

    public void setCancelado(Integer cancelado) {
        this.cancelado = cancelado;
    }

}
