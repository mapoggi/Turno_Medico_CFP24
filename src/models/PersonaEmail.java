package models;

public class PersonaEmail {
    private Persona personaId; 
    private TipoEmail tipoEmailId; 
    private String email; 

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public TipoEmail getTipoEmailId() {
        return tipoEmailId;
    }

    public void setTipoEmailId(TipoEmail tipoEmailId) {
        this.tipoEmailId = tipoEmailId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
}
