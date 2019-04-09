/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

/**
 * FXML Controller class
 *
 * @author casanova
 */
public class FXMLToolBarController implements Initializable {

    @FXML
    private Button addContact;
    
    @FXML
    private Button clear;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        addContact.setOnAction(new EventHandler<ActionEvent> () {
            public void handle(ActionEvent event) {
                System.out.println("Event open contact panel");
                /*try {
                    Parent root = FXMLLoader.load(getClass().getResource("FXMLContactPanel.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
        
                    stage.setScene(scene);
                    stage.setTitle("Create a contact");
                    stage.show();
                    
                } catch(Exception e) {
                    e.printStackTrace();
                }*/
            }
        });
        
        /*clear.setOnAction(new EventHandler<ActionEvent>() {
           public void handle(ActionEvent event) {
               System.out.println("Clear event");
               Object result = DialogDisplayer.getDefault().notify(new NotifyDescriptor.Confirmation("Êtes vous sure de vouloir supprimer ce contact?", NotifyDescriptor.YES_NO_OPTION, NotifyDescriptor.WARNING_MESSAGE));
               System.out.println(result);
               if(result.equals(NotifyDescriptor.YES_OPTION)) {
                   DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Le contact a été supprimé", NotifyDescriptor.INFORMATION_MESSAGE));
               } else {
                   System.out.println("No");
               }
           } 
        });*/
    }    
    
}
