package service;

import model.Product;

import javax.swing.text.DefaultEditorKit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductService {


    //get produit

    public Product getProduct(  double produitId, List<Product> produits) {
        System.out.println("le produit d 'id = "+produitId+" est:");
        for (Product p : produits) {
            if (p.getId() == produitId) {
                return p;
            }
        }

        return null;
    }

    //getAllproducts

    public void getAllProducts(List<Product>produits) {
        for (Product p : produits) {
            System.out.println(p.toString());
        }
    }
    private double getAllProducts () {
        return 0;
    }



}
