/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmdamtrue;

import dao.FilmDao;
import java.util.Date;
import java.util.List;
import obj.Film;
import obj.Like;
import obj.User;

/**
 *
 * @author DAM
 */
public class FilmDamTrue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilmDao filmDam = new  FilmDao();
        
       try{
            System.out.println("Conectando a la base de datos...");
            filmDam.conectar();
            System.out.println("Conexion establecida.");
       }catch(Exception e){
           System.out.println(e.getMessage());
       } 
       
       try{
           System.out.println("Testeando metodo que da alta un usuario(1)");
           User u = new User("kelvinlt", "123", 22);
           filmDam.insertarUser(u);
           
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       
        try{
           System.out.println("Testeando metodo que da alta un usuario(2)");
           User u = new User("aleix", "123", 22);
           filmDam.insertarUser(u);
           
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       
       try{
           System.out.println("Testeando metodo que da alta un film");
           Film f = new Film("Recus", 2018, "kelvin", 1);
           filmDam.insertarFilm(f);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       
        try{
           System.out.println("Testeando metodo que da alta un like(valoracion)");
           User u = new User("aleix", "123", 22);
           Film f = new Film("Recus", 2018, "kelvin", 1);
           Date date = new Date();
           Like l = new Like(u.getUsername(), f.getTitle(), 10, date);
           filmDam.insertarLike(l);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
        
       try{
           System.out.println("Testeando metodo que elimina un usuario");
           User u = new User("kelvinlt", "123", 22);
           filmDam.eliminacionUser(u);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       
       try{
           System.out.println("Testeando metodo que modifica un mark de un like");
           User u = new User("aleix", "123", 22);
           Film f = new Film("Recus", 2018, "kelvin", 1);
           Like l = new Like(u.getUsername(), f.getTitle(), 20);
           filmDam.modificarMarkValoracion(l);
           
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       
       
        try{
           System.out.println("Testeando metodo que muestra todos los likes de un user");
           User u = new User("aleix", "123", 22);
           List<Like> likes =filmDam.getAllValoracionesFromUser(u);
           for(Like l : likes) {
               System.out.println(l);
           }
           
       }catch(Exception e){
           System.out.println(e.getMessage());
       }       
               
       try{
           System.out.println("Desconectando de la base de datos...");
           filmDam.desconectar();
           System.out.println("Conexion cerrada correctamente.");
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
        
    }
    
}
