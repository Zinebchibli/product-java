import service.DBService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class menu_delete extends JFrame{
    private JPanel Panel2;
    private JTextField text1;
    private JButton supprimerButton;
    private JButton returnButton;
    private JLabel id;
    private DBService dbService = new DBService();

    public menu_delete() {
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                designe designe=new designe();
                designe.frame();

            }
        });
        supprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (text1.equals("")) {
//                    JOptionPane.showMessageDialog(null, "Remplir d'abord !");
//                } else {

                    String sql = "DELETE FROM produit WHERE id = ?";
                    dbService.deleteProduct(Double.parseDouble(text1.getText().toString()));
                    JOptionPane.showMessageDialog(null, "produit supprimer");
                }
//            }
        });
    }


        public static void frame () {
            menu_delete supp = new menu_delete();
            supp.setContentPane(supp.Panel2);
            supp.setSize(500, 500);
            supp.setTitle("menu");
            supp.setVisible(true);
            supp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            supp.setLocationRelativeTo(null);

        }
    }





