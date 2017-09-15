/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Persona;

public class Consulta {
   
   public Persona recuperarPersonaUsuClave(Connection conexion, String pUsu, String pClave) throws SQLException {
      Persona unaPersona = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, genero, dni from persona where usuario = ? and  contrasena = md5(?)");
         consulta.setString(1, pUsu);
         consulta.setString(2, pClave);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             unaPersona = new Persona(resultado.getInt("id"), null, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni"));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return unaPersona;
   }
   
   public ArrayList<Persona> ListadoPersonas(Connection conexion) throws SQLException {
          ArrayList<Persona> listaPersonas = new ArrayList();
        try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, genero, dni from persona");
       
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             listaPersonas.add(new Persona(resultado.getInt("id"), null, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni")));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return listaPersonas;
   }
 
}
