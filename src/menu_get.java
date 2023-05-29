import service.DBService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class menu_get extends JFrame {

    private static String Nom;
    private static String description ;
    private static String prix;
    private JTextField text1;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;
    private JButton getButton;
    private JButton returnButton;
    private javax.swing.JPanel JPanel;

    private DBService dbService = new DBService();

    private String id ;

    public String getId() {
        return id;
    }

    public void setId(double id) {
        this.id = String.valueOf(id);
    }

    public static String getNom() {
        return Nom;
    }

    public static void setNom(String nom) {
        Nom = nom;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        menu_get.description = description;
    }

    public static String getPrix() {
        return prix;
    }

    public static void setPrix(String prix) {
        menu_get.prix = prix;
    }

    public menu_get() {
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                designe designe = new designe();
                designe.frame();
                dispose();
            }
        });
        getButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultSet resultSet = dbService.getProduct(Double.parseDouble(text1.getText()));

                    while (true) {
                        try {

                            if (resultSet.next()) {
                                text2.setText(resultSet.getString("name"));
                                text3.setText(resultSet.getString("description"));
                                text4.setText(resultSet.getString("prix"));
                            } else break;
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);

                        }
                    }
                }

        });
    }
    public void frame() {
        menu_get get = new menu_get();
        get.setContentPane(get.JPanel);
        get.setSize(500, 500);
        get.setTitle("menu");
        get.setVisible(true);
        get.text1.setText(getId());
        get.text2.setText(getNom());
        get.text3.setText(getPrix());
        get.text4.setText(getDescription());
        get.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        get.setLocationRelativeTo(null);


    }
//    public void getproduct(long id) {
//        try {
//            dbService.getProduct(text1.getText().toString(),text2.getText().toString(), Double.parseDouble(text3.getText().toString()));
//           JOptionPane.showMessageDialog(null,"produit modifier");
//        }catch (Exception ey){
//            ey.printStackTrace();
//
//        }
//    }

}

