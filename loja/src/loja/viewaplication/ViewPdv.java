/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package loja.viewaplication;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static loja.Aplication.setStage;
import loja.controler.ControlePdv;
import loja.model.Produto;

/**
 *
 * @author Jair_home
 */
public class ViewPdv extends Application {
    
    private static Stage stage;
    private double widthSistema;
    private double heightSistema;
    private double width;
    private double heigth;
 
  
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("/loja/view/FXMLViewpdv.fxml"));
       
        
        Scene scene = new Scene(root);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        this.widthSistema = d.width;
        this.heightSistema = d.height;
        
        getResolucaoSystema();
        
        primaryStage.setWidth(width);
        primaryStage.setHeight(heigth);
        primaryStage.setScene(scene);
         primaryStage.setResizable(false);
        primaryStage.show();
        
        setStage(primaryStage);
    }
    
    public static void setStage(Stage stage){
        ViewPdv.stage = stage;
    }
    
    public Stage getStage(){
        return stage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void getResolucaoSystema(){

         System.out.printf("%s\n","o valor de width do sistem");
         System.out.printf("%f\n",widthSistema,heightSistema);
            System.out.printf("%s\n","o valor de hedth do sistem");
            System.out.printf("%f\n",heightSistema);
        
        if(widthSistema>=1367 && heightSistema>=768 && widthSistema<=1920 && heightSistema<=1080){
            this.width = widthSistema;
            this.heigth = heightSistema;
            System.out.printf("%s %s\n","o valo do w no if ", "o valor de h no if");
            System.out.printf("%f %f\n",width,heigth);
             
        }else{
            System.out.printf("%s %s\n","o valo do w no else", "o valor de h no else");
             System.out.printf("%f %f\n",width,heigth);
            this.width = 1366;
            this.heigth = 768;
            
        }

    }
    
}
