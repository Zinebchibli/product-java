import service.DBService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class menu_add extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton addButton;
    private JButton returnButton;
    private JPanel Panel;

    private String name;

    private  String  description;

    private String prix;
    private DBService dbService = new DBService();


//    public void Connection ()throws SQLException {
//        // Establish the database connection
//        String url = "jdbc:mysql://localhost:3306/produit";
//        String username = "username";
//        String password = "";
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void prepareStatement () throws SQLException {
//        String sql = "SELECT * FROM produit";
//        PreparedStatemen t statement = connection.prepareStatement(sql);
//    }

    public menu_add() {
        
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                designe designe = new designe();
                designe.frame();
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "INSERT INTO produit (name, description, prix) VALUES (?, ?, ?)";
                try {
                    dbService.insertProduct(textField1.getText().toString(), textField2.getText().toString(), Double.parseDouble(textField3.getText()));
                    JOptionPane.showMessageDialog(null,"produit ajouter");

                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        });
    }

    public void frame() {
        menu_add menu = new menu_add();
        menu.setContentPane(menu.Panel);
        menu.setSize(500, 500);
        menu.setTitle("menu");
        menu.setVisible(true);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLocationRelativeTo(null);

    }


}

