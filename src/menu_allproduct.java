import model.Product;
import service.DBService;

import javax.management.ObjectName;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class menu_allproduct extends JFrame {
    private JButton allProductButton;
    private JTable table;
    private JPanel paneL;
    private JButton returnButton;
    private DBService dbService = new DBService();


    public  menu_allproduct() {

    }
   /* public void frame(){

      menu_allproduct  all = new menu_allproduct();
        all.setContentPane(all.paneL);
        all.setSize(500, 500);
        all.setTitle("menu");
        all.add(table);
        all.pack();
        all.setVisible(true);
        all.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        all.setLocationRelativeTo("null");

    }*/
   public void frame(){
       DefaultTableModel model = new DefaultTableModel();
       JTable table;
       JButton returnButton = new JButton("Return");
       JPanel panel = new JPanel();
       DBService dbService1 = new DBService();
       model.addColumn("Id");
       model.addColumn("Nom");
       model.addColumn("Description");
       model.addColumn("Prix");
       List<Product> products = dbService.getAllProducts();
       for (Product p: products
       ) {
           Object[] row = {p.getId(), p.getName(), p.getDescription(), p.getPrix()};
           model.addRow(row);
       }

       table = new JTable(model);

       JScrollPane jScrollPane = new JScrollPane(table);
       panel.add(jScrollPane, BorderLayout.CENTER);
       JFrame jFrame = new JFrame("Product table");
       returnButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               designe designe=new designe();
               jFrame.dispose();
               designe.frame();
           }
       });
       panel.add(returnButton, BorderLayout.SOUTH);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.add(panel);
       jFrame.pack();
       jFrame.setVisible(true);
       jFrame.setSize(500, 500);
       jFrame.setLocationRelativeTo(null);
       panel.setBackground(Color.pink);
       table.setBackground(Color.white);

       returnButton.setBackground(Color.WHITE);
   }
}
