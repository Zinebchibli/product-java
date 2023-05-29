import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class designe extends JFrame {
    private JPanel PanelMain;
    private JButton addProductButton;
    private JButton supprimerButton;
    private JButton updateProductButton;
    private JButton getProductButton;
    private JButton getAllProductButton;


    public designe() {
        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            menu_add menu = new menu_add();
            menu.frame();
                dispose();

            }
        });
        getProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               menu_get get =new menu_get();
               get.frame();
               dispose();

            }
        });
        updateProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               menu_update update=new menu_update();
               update.frame();
                dispose();

            }
        });
        supprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu_delete supp=new menu_delete();
                supp.frame();
                dispose();

            }

        });
        getAllProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu_allproduct all=new menu_allproduct();
                all.frame();
                dispose();
            }
        });
    }

    public void frame() {

            designe d = new designe();
            d.setContentPane(d.PanelMain);
//            d.setBounds(500,500,1000,500);
            d.setSize(500, 500);
            d.setTitle("hello");
            d.setVisible(true);
            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            d.setLocationRelativeTo(null);


    }


}

