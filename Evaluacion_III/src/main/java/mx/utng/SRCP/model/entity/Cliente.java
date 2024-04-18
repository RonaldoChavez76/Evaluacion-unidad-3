package mx.utng.SRCP.model.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import jakarta.validation.constraints.NotEmpty;

@Entity
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(length = 30)
    private String nombre;
    
    @Column(length = 30)
    private String correo;
    
    @NotEmpty
    @Column(length = 30)
    private String telefono;
    
    
    
    @Temporal(TemporalType.DATE)
    private Date recordAt;
    
    @PrePersist
    public void prePersist(){
        recordAt = new Date();
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getRecordAt() {
        return recordAt;
    }
    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
                 + ", recordAt=" + recordAt + "]";
    }

    



}


