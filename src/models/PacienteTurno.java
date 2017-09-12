package models;

public class PacienteTurno {
    private Integer id;
    private Integer personaId;
    private Integer profTurnoId;
    private String hora;
    private Integer cancelado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public Integer getProfTurnoId() {
        return profTurnoId;
    }

    public void setProfTurnoId(Integer profTurnoId) {
        this.profTurnoId = profTurnoId;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getCancelado() {
        return cancelado;
    }

    public void setCancelado(Integer cancelado) {
        this.cancelado = cancelado;
    }

    
}
