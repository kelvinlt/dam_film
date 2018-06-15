/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import obj.Film;
import obj.Genre;
import obj.Like;
import obj.User;

/**
 *
 * @author DAM
 */
public class FilmDao {
    
    private Connection conexion;
    
    public void conectar() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/dam_film";
        String user = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url, user, pass);
    }
    
    public void desconectar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
    
    public void insertarUser(User u) throws SQLException{
        String insert="INSERT INTO dam_film.user (username,pass,age) values(?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPass());
        ps.setInt(3, u.getAge());
        ps.executeUpdate();
        ps.close();
    }
    
    public void insertarFilm(Film f) throws SQLException{
        String insert="insert into film values(?,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setString(1, f.getTitle());
        ps.setInt(2, f.getYear());
        ps.setString(3, f.getDirector());
        ps.setInt(4, f.getGenre());
        ps.executeUpdate();
        ps.close();
    }
    
    public void insertarGenre(Genre g) throws SQLException{
        String insert="insert into genre (name) values(?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setString(1, g.getName());
        ps.executeUpdate();
        ps.close();
    }
    
    public void insertarLike(Like l) throws SQLException{
        String insert="insert into dam_film.like values(?,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        
        ps.setString(1, l.getUser());
        ps.setString(2, l.getFilm());
        ps.setInt(3, l.getMark());
        java.sql.Date sqlDate = new java.sql.Date(l.getDate().getTime());
        ps.setDate(4, sqlDate);
        ps.executeUpdate();
        ps.close();
        
    }
    
    public void mediaValoracionesPelicula(Film f) throws SQLException{
        String select = "select * from dam_film.like";
    }
    
    public void modificarMarkValoracion(Like l) throws SQLException{
        String modificar="update dam_film.like set mark=? where user=? and film=?";
        PreparedStatement ps = conexion.prepareStatement(modificar);
        ps.setInt(1, l.getMark());
        ps.setString(2, l.getUser());
        ps.setString(3, l.getFilm());
        ps.executeUpdate();
        ps.close();
        
    }
    
    public List<Like> getAllValoracionesFromUser(User u) throws SQLException{
        List<Like> valoraciones = new ArrayList<>();
        
        String select="select * from dam_film.like where user=?";
        PreparedStatement ps = conexion.prepareStatement(select);
        ps.setString(1, u.getUsername());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Like l = new Like();
            l.setUser(rs.getString("user"));
            l.setFilm(rs.getString("film"));
            l.setMark(rs.getInt("mark"));
            l.setDate(rs.getDate("date"));
            valoraciones.add(l);
        }
        return valoraciones;
    }
    
    public void eliminacionUser(User u) throws SQLException{
        String eliminar = "delete from user where username=?";
        PreparedStatement ps = conexion.prepareStatement(eliminar);
        ps.setString(1, u.getUsername());
        ps.executeUpdate();
        ps.close();
    }
    
}
