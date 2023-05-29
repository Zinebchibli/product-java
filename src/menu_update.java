import service.DBService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class menu_update extends JFrame {

    JTextField textField1;
    private JButton updateButton;
    private JButton returnButton;
    private JPanel panel11;

    private DBService dbService = new DBService();
    public menu_update() {
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultSet resultSet = dbService.getProduct(Double.parseDouble(textField1.getText()));
                update1.setId(textField1.getText());
//
                while (true){
                    try {
                        if (resultSet.next()){
                            update1.setNom(resultSet.getString("name"));
                            update1.setDesc(resultSet.getString("description"));
                            update1.setPrix(String.valueOf(resultSet.getDouble("prix")));
                        } else break;
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }

                update1.frame();
                 dispose();

            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
                 public void actionPerformed(ActionEvent e) {
                    dispose();
                        designe designe = new designe();
                             designe.frame();

            }
        });

    }

    public void frame() {
        menu_update update = new menu_update();
        update.setContentPane(update.panel11);
        update.setSize(500, 500);
        update.setTitle("menu");
        update.setVisible(true);
        update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        update.setLocationRelativeTo(null);

    }
}
