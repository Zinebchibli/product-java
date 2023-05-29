package service;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {
    private Connection connection;

    public DBService() {
        String url = "jdbc:mysql://localhost:3306/produit"; // Replace "mydatabase" with your database name
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //ajouter
    public void insertProduct(String name, String description, double prix) {
        String sql = "INSERT INTO produit (name, description, prix) VALUES (?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setDouble(3, prix);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //supprimer

    public void deleteProduct(double id) {
        String sql = "DELETE FROM produit WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //update
    public void updateProduct(double id, String name, String description, double prix) {
        System.out.println("Update method is called:");
        String sql = "UPDATE produit SET name = ?, description = ?, prix = ? where id=" + id;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setDouble(3, prix);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //getproduct
    public  ResultSet getProduct(double id) {
        System.out.println("Le produit numero : " + id + " est :");
        ResultSet rs = null;
        String sql = "Select * from produit where id=" + id;
        try {
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    //get all product
    public List<Product> getAllProducts() {
        System.out.println("all products");
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM produit";
        Product product=null;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                product=new Product();
                product.setId(resultSet.getDouble("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrix(resultSet.getDouble("prix"));
                products.add(product);
            }
            return products;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//
//    public void updateProduct(String toString, String toString1, String toString2) {
//
//    }



    public void getProduct(String toString, String toString1, double parseDouble) {
    }
}






