/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author edher
 */

@Entity
@Table (name="Tabla", catalog="mydb")
public class Tabla {
    
    @Id @GeneratedValue
    @Column(name="idTabla")
    private int idTabla;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="asunto")
    private String asunto;
    
    @Column (name="comentario")
    private String comentario;
    
    @Column (name="email")
    private String email;

    /**
     * @return the idTabla
     */
    public int getIdTabla() {
        return idTabla;
    }

    /**
     * @param idTabla the idTabla to set
     */
    public void setIdTabla(int idTabla) {
        this.idTabla = idTabla;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
