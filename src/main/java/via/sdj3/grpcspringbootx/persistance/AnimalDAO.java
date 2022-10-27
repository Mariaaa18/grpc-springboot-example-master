package via.sdj3.grpcspringbootx.persistance;

import via.sdj3.grpcspringbootx.model.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnimalDAO {
    private static final Map<Integer, Animal> animals= new HashMap<>();

    static {
        initDataSource();
    }

    private static void initDataSource() {
        Animal a1= new Animal(new via.sdj3.grpcspringbootx.model.Date(2022,3,1), 8888.555,4,"lalaland",78);
        Animal a2= new Animal(new via.sdj3.grpcspringbootx.model.Date(2021,4,21), 8856,5,"lalaland",43);
        Animal a3= new Animal(new via.sdj3.grpcspringbootx.model.Date(2022,3,1), 8888.555,3,"lalalanden",78);
        Animal a4= new Animal(new via.sdj3.grpcspringbootx.model.Date(2022,3,2), 8888.555,7,"lalalandin",43);

        animals.put(a1.getRegistrationNumber(),a1);
        animals.put(a2.getRegistrationNumber(),a2);
        animals.put(a3.getRegistrationNumber(),a3);
        animals.put(a4.getRegistrationNumber(),a4);
    }

    public ArrayList<String> getAnimalsByProduct(int product_ref){
        ArrayList<String> a=new ArrayList<>();
        for(int i=0; i< animals.size();i++){
            if (animals.get(i).getProd_ref()==product_ref){
                a.add(String.valueOf(animals.get(i).getRegistrationNumber()));
            }
        }
        return a;
    }
    /*private String getAnimalListByProduct= "SELECT * FROM \"slautherhouse\".animal_product where product_ref=?";
    private static AnimalDAO instance;

    private AnimalDAO() throws SQLException {
        DriverManager.registerDriver(new org.postsgresql.Driver());
    }

    public static synchronized AnimalDAO getInstance() throws SQLException {
        if (instance==null){
            instance=new AnimalDAO();
        }
        return instance;
    }
    // connect to  my database
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://tai.db.elephantsql.com/naeoxool",
                "naeoxool", "1eiSjWkSFVXj15hc0j47p_js1irgaDWr");
    }

    public ArrayList<String> getAnimalsByProduct(String product_ref) throws SQLException {
        Connection connection= getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(getAnimalListByProduct);
            statement.setString(1,product_ref);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String> result = new ArrayList<>();
            while (resultSet.next()) {
                String animal_ref = resultSet.getString("animal_ref");
                result.add(animal_ref);
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
