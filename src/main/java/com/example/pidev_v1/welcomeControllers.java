package com.example.pidev_v1;

import com.example.pidev_v1.entities.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class welcomeControllers {
    @FXML
    private BorderPane borderpane;
    @FXML
    private Label LabelUser;
    FXMLLoader fxmlLoader;
    private User currentUser;


    public void setUser(User user)
    {
        currentUser =user;
        LabelUser.setText(currentUser.getNomuser()+" "+currentUser.getPrenomuser());
        System.out.println("nomcurrentUser"+currentUser.getId_user());
    }


    @FXML
    void gestionAvis(ActionEvent event) throws IOException {
        AnchorPane view= FXMLLoader.load(getClass().getResource("interfaceAvis.fxml"));

        borderpane.setCenter(view);

    }

    @FXML
    void gestionReclamation(ActionEvent event) throws IOException {

        fxmlLoader = new FXMLLoader(getClass().getResource("interfaceReclamation.fxml"));
        Parent view = fxmlLoader.load();
        borderpane.setCenter(view);
        InterfaceReclamationController controller = fxmlLoader.getController();
        controller.setUser(currentUser);

    }
}
