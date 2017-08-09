/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.res;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import piiiutscuaca.dao.CuacaDao;
import piiiutscuaca.model.Cuaca;

/**
 *
 * @author Regyma
 */
public class Service {
    private CuacaDao cuacaDao;
    //private MataKuliahDAO matakuliahDAO;
    //private NilaiDAO nilaiDAO;
    private Connection connection;
    
    public void setDataSource(DataSource dataSource){
        try {
            connection = dataSource.getConnection();
            cuacaDao = new CuacaDao();
            
           
            cuacaDao.setConnection(connection);
            //cuacaDao.setConnection(connection);
            //cuacaDao.setConnection(connection);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Cuaca save(Cuaca t_cuaca){
        try {
            connection.setAutoCommit(false);
            cuacaDao.save(t_cuaca);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return t_cuaca;
    }
    public Cuaca update(Cuaca mahasiswa){
        try {
            connection.setAutoCommit(false);
            cuacaDao.update(mahasiswa);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return mahasiswa;
    }
    /*public Mahasiswa delete(Mahasiswa mahasiswa) {
        try {
            connection.setAutoCommit(false);
            mahasiswaDAO.delete(mahasiswa);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return mahasiswa;
    }*/
    public Cuaca getCuaca(int id){
        try {
            return cuacaDao.getById(id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Cuaca> getAllMahasiswa() {
        try {
            return cuacaDao.getAll();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    /*public MataKuliah save(MataKuliah matakuliah){
        try {
            connection.setAutoCommit(false);
            matakuliahDAO.save(matakuliah);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return matakuliah;
    }
    
   public MataKuliah update(MataKuliah matakuliah) {
        try {
            connection.setAutoCommit(false);
            matakuliahDAO.update(matakuliah);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return matakuliah;
    }

    public MataKuliah delete(MataKuliah matakuliah) {
        try {
            connection.setAutoCommit(false);
            matakuliahDAO.delete(matakuliah);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return matakuliah;
    }

    public MataKuliah getMataKuliah(int kode_mk) {
        try {
            return matakuliahDAO.getByKode_mk(kode_mk);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<MataKuliah> getAllMataKuliah() {
        try {
            return matakuliahDAO.getAll();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static class cuacaDao extends CuacaDao {

        public cuacaDao() {
        }
    }*/
}
