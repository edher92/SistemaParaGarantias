/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Tabla;

/**
 *
 * @author edher
 */
public class tablaDao {
    Session session;
    
    public tablaDao() {
        session = HibernateUtil.getLocalSession();
}
    
    public boolean saveTabla(String nombre, String asunto, String comentario, String email){
        Tabla datosTabla = new Tabla();
        
        datosTabla.setNombre(nombre);
        datosTabla.setAsunto(asunto);
        datosTabla.setComentario(comentario);
        datosTabla.setEmail(email);
        
        try {
            Transaction transaccion = session.beginTransaction();
            session.save(datosTabla);
            System.out.println("lo logre");
            transaccion.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeLocalSession();
        }
        return true;
        
    }
}
