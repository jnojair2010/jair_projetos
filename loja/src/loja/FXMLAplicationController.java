/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package loja;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import loja.viewaplication.ViewPdv;

/**
 *
 * @author Jair_home
 */
public class FXMLAplicationController implements Initializable {
    
         Aplication Aplication = new Aplication();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        
        login();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void login(){
  
        ViewPdv vPdv = new ViewPdv();  
             try {
                 vPdv.start(new Stage());
             } catch (IOException ex) {
                 Logger.getLogger(FXMLAplicationController.class.getName()).log(Level.SEVERE, null, ex);
                 
                 System.out.println("entrou no catch ao chamar a view pdv!");
             }
        
        closeJanelaPrincipal();
   
    }
    
    private void closeJanelaPrincipal(){
        Aplication.getStage().close();  
    }
    
}
