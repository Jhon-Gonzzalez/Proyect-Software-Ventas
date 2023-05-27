/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import Clases.Inicio;
import Clases.Profesores;
import Vista_Profe.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN-10
 */
public class ProfesoresDAO implements CRUD {

    Connection acceso;

    Conexion enlazar = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Profesores> lista = new ArrayList<>();
        String sql = "select * from Tabla_profesores";
        try {

            acceso = enlazar.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profesores dat = new Profesores();
                dat.setId(rs.getInt(1));
                dat.setNombre(rs.getString(2));
                dat.setSexo(rs.getString(3));
                dat.setEdad(rs.getInt(4));
                dat.setCurso(rs.getString(5));
                dat.setTitulo(rs.getString(6));
                dat.setHorario(rs.getString(7));
                lista.add(dat);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {
        String sql = "insert into Tabla_profesores(Nombre,Sexo,Edad,Curso,Titulo,Horario)values(?,?,?,?,?,?)";
        int r = 0;
        try {

            acceso = enlazar.conectar();
            ps = acceso.prepareStatement(sql);

            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);

            r = ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return r;

    }

    @Override
    public int actualizar(Object[] o) {
       String sql = "update Tabla_profesores set Nombre=?,Sexo=?,Edad=?,Curso=?,Titulo=?,Horario=? where id=?";
        int r = 0;
        try {

            acceso = enlazar.conectar();
            ps = acceso.prepareStatement(sql);

            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);

            r = ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return r;

    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from Tabla_profesores where Id=?";
        
        try {

            acceso = enlazar.conectar();
            ps = acceso.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }

    }

}
