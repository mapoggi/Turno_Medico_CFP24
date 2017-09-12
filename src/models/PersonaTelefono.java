package models;


public class PersonaTelefono {
    private Integer id;
    private Persona personaId;
    private TipoTel tipoTelId;
    private String tel;

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

    public TipoTel getTipoTelId() {
        return tipoTelId;
    }

    public void setTipoTelId(TipoTel tipoTelId) {
        this.tipoTelId = tipoTelId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
    
}
