package com.example.pidev_v1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class NavigationControler {



    public static void changeAddproductPage(MouseEvent event, String fxmlFile){
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(NavigationControler.class.getResource(fxmlFile));
            root = loader.load();
            AjouterProduit Addproduct = loader.getController();
            //Addproduct.setInformation(P);
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.setTitle("Arya Management TooL : Ajouter Un Nouveau Produit");
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void OpenAffichageProduitsBack(MouseEvent event, String fxmlFile)
    {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(NavigationControler.class.getResource(fxmlFile));
            root = loader.load();
            AfficherProduitBack Addproduct = loader.getController();
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.setTitle("Arya Management TooL : Liste des Produits");
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void OpenInterfaceCategories(MouseEvent event , String fxmlFile)
    {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(NavigationControler.class.getResource(fxmlFile));
            root = loader.load();
            DetailsCategorie Addproduct = loader.getController();
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.setTitle("Arya Management TooL : Management des Categories");
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void OpenInterfaceUpdateProduct(MouseEvent event , String fxmlFile)
    {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(NavigationControler.class.getResource(fxmlFile));
            root = loader.load();
            ModifierProduit Addproduct = loader.getController();
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.setTitle("Arya Management TooL : Modifier Un Produit");
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }







    }








}
