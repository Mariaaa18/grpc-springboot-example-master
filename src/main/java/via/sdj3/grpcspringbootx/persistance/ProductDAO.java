package via.sdj3.grpcspringbootx.persistance;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductDAO {


    /*private String getProductListByAnimal= "SELECT * FROM \"slautherhouse\".animal_product where animal_ref=?";
    private static ProductDAO instance;

    private ProductDAO() throws SQLException {
        DriverManager.registerDriver(new org.postsgresql.Driver());
    }

    public static synchronized ProductDAO getInstance() throws SQLException {
        if (instance==null){
            instance=new ProductDAO();
        }
        return instance;
    }
    // connect to  my database
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://tai.db.elephantsql.com/naeoxool",
                "naeoxool", "1eiSjWkSFVXj15hc0j47p_js1irgaDWr");
    }

    public ArrayList<String> getProductsByAnimal(String animal_ref) throws SQLException {
        Connection connection= getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(getProductListByAnimal);
            statement.setString(1,animal_ref);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String> result = new ArrayList<>();
            while (resultSet.next()) {
                String prod_ref = resultSet.getString("prod_ref");
                result.add(prod_ref);
            }
            connection.commit();
            return result;
        }
        catch (SQLException e){
            connection.rollback();
            throw e;
        }finally
        {
            connection.close();
        }

    }*/
}
