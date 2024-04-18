package mx.utng.SRCP.model.entity;


import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Publicacion {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(length = 90)
    private String titulo;

    @NotEmpty
    @Column(length = 90)
    private String contenido;

    @Temporal(TemporalType.DATE)
    private Date recordAt;
    
    @PrePersist
    public void prePersist(){
        recordAt = new Date();
    }

   
    @Column(length = 90)
    private String autor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getRecordAt() {
        return recordAt;
    }

    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    

   

   

    
}
