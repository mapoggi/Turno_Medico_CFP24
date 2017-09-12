package models;

public class PacienteHistorial {
    private Integer id;
    private PacienteTurno pacienteTurnoId;
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PacienteTurno getPacienteTurnoId() {
        return pacienteTurnoId;
    }

    public void setPacienteTurnoId(PacienteTurno pacienteTurnoId) {
        this.pacienteTurnoId = pacienteTurnoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
