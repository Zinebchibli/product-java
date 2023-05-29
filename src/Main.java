import service.DBService;
import model.Product;
import service.ProductService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*List<Product> produits = new ArrayList<>();
        DBService dbConfig = new DBService();
        ProductService productService = new ProductService();

        Product produits1 = new Product("sourie", "description", 60);
        Product produits2 = new Product("clavier",  "Ce clavier est un accessoire essentiel pour votre ordinateur,Les touches sont réactives et silencieuses.", 10);
        Product produits3 = new Product("clé",  "ggg", 70);
        Product produits4 = new Product("casque",  "jjjj", 40);
        Product produits5 = new Product("lol",  "kkkk", 20);
        Product produits6 = new Product("pubg",  "qqqqqqqq", 80);
        Product produits7 = new Product("fortnite",  "aaaaaaa", 30);
        Product produits8 = new Product("lol",  "llllllll", 20);
        Product produits9 = new Product("lol",  "llllllll", 20);

        produits.add(produits1);
        produits.add(produits2);
        produits.add(produits3);
        produits.add(produits4);
        produits.add(produits5);
        produits.add(produits6);
        produits.add(produits7);
        produits.add(produits8);
        produits.add(produits9);

        Product product = new Product();


      //  get product

        ResultSet produit = dbConfig.getProduct(8);
        while (produit.next()){
            System.out.println("id = " + produit.getDouble("id"));
            System.out.println("name = " + produit.getString("name"));
            System.out.println("description = " + produit.getString("description"));
            System.out.println("prix = " + produit.getDouble("prix"));
        }

        //ajouter

        dbConfig.insertProduct("zineb","tes", 111);
        System.out.println("le produit ajouter");

        //supprimer

        dbConfig.deleteProduct(35);
        System.out.println("le produit a ete suprimer");

        //update

        dbConfig.updateProduct(8, "test", "test",190);

        //getAllproducts

//        System.out.println("all products:");
//        productService.getAllProducts(produits);
//
//        System.out.println("Database applied : ");

      //getAllproduct

     List<Product> list= dbConfig.getAllProducts();
        for (Product p:list
             ) {
            System.out.println(p.toString());

        }

*/
        designe d = new designe();
        d.frame();


    }

    }













