import service.DBService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class update1 extends JFrame {
    JTextField TEXT2;
    JTextField TEXT3;

    private static String nom;
    private static String desc;
    private static String prix;
    private JButton updateButton;
    private JButton returnButton;
    private JPanel Jpanel;
    JTextField TEXT1;
    private JLabel id_label;

    private static String id;

    private static DBService dbService = new DBService();

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        update1.id = id;
    }

    public static void setNom(String nom) {
        update1.nom = nom;
    }

    public static String getNom()
    {
        return nom;
    }

    public static String getDesc() {
        return desc;
    }

    public static void setDesc(String desc) {
        update1.desc = desc;
    }

    public static String getPrix() {
        return prix;
    }

    public static void setPrix(String prix) {
        update1.prix = prix;
    }

    public update1() {
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
               menu_update update = new menu_update();
                update.frame();

            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(update1.getId());
                update(Long.parseLong(update1.getId()));
            }
        });

    }

    public static void frame() {
        update1 update2 = new update1();
        menu_update update = new menu_update();
        update2.setContentPane(update2.Jpanel);
        update2.setSize(500, 500);
        update2.setTitle("menu");
        update2.setVisible(true);
        update2.TEXT1.setText(getNom());
        update2.TEXT2.setText(getDesc());
        update2.TEXT3.setText(getPrix());
        update2.id_label.setText(getId());
//        update2.TEXT2.setText(getDes);
        update2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        update2.setLocationRelativeTo(null);

    }

    public void update(long id) {
        try {
            dbService.updateProduct(id,TEXT1.getText().toString(),TEXT2.getText().toString(), Double.parseDouble(TEXT3.getText().toString()));
            JOptionPane.showMessageDialog(null,"produit modifier");
        }catch (Exception a){
            a.printStackTrace();

        }
    }

}