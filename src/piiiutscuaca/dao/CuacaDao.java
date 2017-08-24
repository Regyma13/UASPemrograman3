/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import piiiutscuaca.model.Cuaca;

/**
 *
 * @author Regyma
 */
public class CuacaDao {
    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getAllStatement;
    private PreparedStatement getByIdStatement;

    private final String insertQuery = "insert into t_cuaca(date,nama_kota,suhu,suhu_maks,suhu_min,kecepatan_angin,kelembapan,tekanan_udara) "
            + " values(?,?,?,?,?,?,?,?)";
    private final String updateQuery = "update t_cuaca set date=?, nama_kota, suhu=?, suhu_maks=?, suhu_min=?, kecepatan_angin=?, kelembapan=?, "
                                     + " tekanan_udara=?, where id=?";
    private final String deleteQuery = "delete from t_cuaca where id=?";
    private final String getByIdQuery = "select * from t_cuaca where id=?";
    private final String getAllQuery = "select * from t_cuaca";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);
    }
    
    public Cuaca save(Cuaca t_cuaca) throws SQLException{
        if (t_cuaca.getId() == 0) {
            insertStatement.setDate(1, t_cuaca.getTanggal());
            insertStatement.setString(2, t_cuaca.getNamaKota());
            insertStatement.setDouble(3, t_cuaca.getSuhu());
            insertStatement.setDouble(4, t_cuaca.getSuhuMaks());
            insertStatement.setDouble(5, t_cuaca.getSuhuMin());
            insertStatement.setDouble(6, t_cuaca.getKecepatanAngin());
            insertStatement.setDouble(7, t_cuaca.getKelembapan());
            insertStatement.setDouble(8, t_cuaca.getTekanan());
            int id = (int) insertStatement.executeUpdate();
            t_cuaca.setId(id);
        } else {
            updateStatement.setDate(1, t_cuaca.getTanggal());
            updateStatement.setString(2, t_cuaca.getNamaKota());
            updateStatement.setDouble(3, t_cuaca.getSuhu());
            updateStatement.setDouble(4, t_cuaca.getSuhuMaks());
            updateStatement.setDouble(5, t_cuaca.getSuhuMin());
            updateStatement.setDouble(6, t_cuaca.getKecepatanAngin());
            updateStatement.setDouble(7, t_cuaca.getKelembapan());
            updateStatement.setDouble(8, t_cuaca.getTekanan());
            updateStatement.setInt(9, t_cuaca.getId());
            updateStatement.executeUpdate();
        }
        return t_cuaca;
    }
    
    public Cuaca update(Cuaca t_cuaca) throws SQLException {
        updateStatement.setDate(1, t_cuaca.getTanggal());
            updateStatement.setString(2, t_cuaca.getNamaKota());
            updateStatement.setDouble(3, t_cuaca.getSuhu());
            updateStatement.setDouble(4, t_cuaca.getSuhuMaks());
            updateStatement.setDouble(5, t_cuaca.getSuhuMin());
            updateStatement.setDouble(6, t_cuaca.getKecepatanAngin());
            updateStatement.setDouble(7, t_cuaca.getKelembapan());
            updateStatement.setDouble(8, t_cuaca.getTekanan());
            updateStatement.setInt(9, t_cuaca.getId());
        updateStatement.executeUpdate();
        return t_cuaca;
    }
    
    public Cuaca delete(Cuaca t_cuaca) throws SQLException {
        deleteStatement.setInt(1, t_cuaca.getId());
        deleteStatement.executeUpdate();
        return t_cuaca;
    }
    
    public Cuaca getById(int id) throws SQLException{
        getByIdStatement.setInt(1, id);
        ResultSet rs = getByIdStatement.executeQuery();
        //proses mapping dari relational ke object
        if (rs.next()) {
            Cuaca cuaca = new Cuaca();
            cuaca.setId(rs.getInt("id"));
            cuaca.setTanggal(rs.getDate("tanggal"));
            cuaca.setNamaKota(rs.getString("namakota"));
            cuaca.setSuhu(rs.getDouble("suhu"));
            cuaca.setSuhuMaks(rs.getDouble("suhumaks"));
            cuaca.setSuhuMin(rs.getDouble("suhumin"));
            cuaca.setKecepatanAngin(rs.getDouble("kecepatanangin"));
            cuaca.setKelembapan(rs.getDouble("kelembapan"));
            cuaca.setTekanan(rs.getDouble("tekananudara"));
            
            return cuaca;
        }
        return null;
    }
    
    public List<Cuaca> getAll() throws SQLException{
        List<Cuaca> cuacaR = new ArrayList<>();
        ResultSet rs = getAllStatement.executeQuery();
        while(rs.next()){
            Cuaca cuaca = new Cuaca();
            cuaca.setId(rs.getInt("id"));
            cuaca.setTanggal(rs.getDate("tanggal"));
            cuaca.setNamaKota(rs.getString("namakota"));
            cuaca.setSuhu(rs.getDouble("suhu"));
            cuaca.setSuhuMaks(rs.getDouble("suhumaks"));
            cuaca.setSuhuMin(rs.getDouble("suhumin"));
            cuaca.setKecepatanAngin(rs.getDouble("kecepatanangin"));
            cuaca.setKelembapan(rs.getDouble("kelembapan"));
            cuaca.setTekanan(rs.getDouble("tekananudara"));
            cuacaR.add(cuaca);
        }
        return cuacaR;
    }
}
