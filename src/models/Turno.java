package models;

public class Turno {
    private Integer id;
    private String nombre;
    private TurnoConsultorio turnoConsultorioId;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TurnoConsultorio getTurnoConsultorioId() {
        return turnoConsultorioId;
    }

    public void setTurnoConsultorioId(TurnoConsultorio turnoConsultorioId) {
        this.turnoConsultorioId = turnoConsultorioId;
    }
    

    
}
