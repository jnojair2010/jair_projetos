/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loja.viewcontroller;

//import com.sun.beans.util.Cache;
import com.sun.javafx.collections.ElementObservableListDecorator;
import java.awt.Font;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import loja.model.Produto;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import loja.controler.ControlePdv;
import loja.model.ProdutosVenda;
import loja.model.Venda;


public class FXMLViewpdvController implements Initializable {
   
    @FXML
    private TableColumn<ProdutosVenda,String> tableColumnItem = new TableColumn<>();
    @FXML
    private TableColumn<ProdutosVenda,String> tableColumnCodInterno = new TableColumn<>();
    @FXML
    private TableColumn<ProdutosVenda,String> tableColumnCodigoBarra = new TableColumn<>();
    @FXML
    private TableColumn<ProdutosVenda,String> tableColumnQuantidade = new TableColumn<>();
    @FXML
    private TableColumn<ProdutosVenda, String> tableColumnDescricao = new TableColumn<>();
     @FXML
    private TableColumn<ProdutosVenda, String> tableColumnPreco = new TableColumn<>();
    @FXML
    private TableColumn<ProdutosVenda, String> tableColumnTotal = new TableColumn<>(); 
    @FXML
    private TableView<ProdutosVenda> tableviewProdutos =  new TableView<>();
    @FXML
    private TextField txtCodigo = new TextField();
    @FXML
    private TextField txtQuantidade = new TextField();
    @FXML
    private TextField txtPesquisa = new TextField();
    @FXML
    private TextField edtValorProduto = new TextField();
    @FXML
    private Button btnPesquisar = new Button();
    @FXML
    private Button btnIncluir = new Button();
    @FXML
    private Label labelaplicardesconto = new Label();
    @FXML
    private Label lbDescricao = new Label();
    
    
    
    private int contadodeClick = 0;
    private Venda venda = new Venda();
    private ProdutosVenda proSelecVenda = new ProdutosVenda();
    private  ArrayList<ProdutosVenda> listProduto = new ArrayList(); 
    ControlePdv controlePdv = new ControlePdv();
    private ObservableList<ProdutosVenda> listObservableProduto;
    private int quantidade;
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
      controlePdv.getListaProtudo(); 
      
      labelaplicardesconto.setOnMouseClicked(e->{
            aplicarDesconto();   
      });
      
      btnIncluir.setOnMouseClicked(e->{
          addProdutoAVenda();
      });
      
      txtCodigo.setOnKeyTyped(e->{

                if(e.getCharacter().equals("\r")){
                       
                    if(contadodeClick==0){
                        
                        System.out.println(" /// o codigo antes do metodo atribuir valores aos campos é: "+ txtCodigo.getText());
                        atribuiValoresAosCampos(txtCodigo.getText());
                        contadodeClick = 1;
                    }
                }
                
            });

   
    }
    
    private void addProdutoAVenda(){
  
        atribuirQuantidade();
        
        this.venda.setProduto(proSelecVenda, this.quantidade);
        carregarProduto();
        
    }
    
    private void atribuiValoresAosCampos(String codigo){

        System.out.println(" ////// o codigo no metodo atribuir valores aos campos é: "+codigo);
        ProdutosVenda p = new ProdutosVenda();
         
            if(txtQuantidade.getText().equals("")){  // verifica de o campor TextFild quantidade recebeu valores e trata
                    quantidade =1;
            }else{
                   quantidade = Integer.parseInt(txtQuantidade.getText());
                }       // fim do if do textfild quantidade

             p = controlePdv.getProdutoParaVendaPorCodigoInterno(codigo);
              if(p!=null){
                    lbDescricao.setText(p.getNome().toUpperCase()+" "+p.getMarca().toUpperCase()+" "+p.getModelo().toUpperCase()+" ");
                    String valor =   Double.toString(p.getpVenda());
                    edtValorProduto.setText(  "R$ "+valor);
                    proSelecVenda = p;  
                }else{

                }
    }
    
    
    public void getProdutoCodInterno(String codigo){
          int quantidade;
        ProdutosVenda p = new ProdutosVenda();

            
        p = controlePdv.getProdutoParaVendaPorCodigoInterno(codigo);
        
         if(p!=null){
                System.out.println(" produto encontrado");
                
                    if(p.getCodInterno().equals(codigo) ){

                            venda.setProduto(p,this.quantidade);
                            this.listProduto = (ArrayList<ProdutosVenda>) venda.getListaProduto();

                            System.out.println("3º entrou no metodo setProdutoVenda da ViewPdvController com codBarr: "+p.getCodBarra());
                          // carregarProduto();
                    }else{ 
                            System.out.println("Produto não registrado!");
                    }
                  
            }else{
              System.out.println("Produto não encontrado codigo interno é "+codigo);
            }
            
    
  
        //  txtCodigo.setText(""); 
        //  txtQuantidade.setText("");
    }
    
    public void getProdutoCodBarra(String codBarra){
        
        ProdutosVenda p = new ProdutosVenda();
        
            int quantidade;

            if(txtQuantidade.getText().equals("")){  // verifica de o campor TextFild quantidade recebeu valores e trata
                quantidade =1;
            }else{
               quantidade = Integer.parseInt(txtQuantidade.getText());
            }       // fim do if do textfild quantidade
            
            
            txtCodigo.setText(""); 
          txtQuantidade.setText("");
        
    }

    public void carregarProduto(){
        this.listProduto = (ArrayList<ProdutosVenda>) venda.getListaProduto();

          tableColumnDescricao.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ProdutosVenda, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ProdutosVenda, String> p) {
                try{
                     if(p!=null){
                    
                    return new SimpleStringProperty(p.getValue().getNome().toUpperCase()+" "+p.getValue().getMarca().toUpperCase()+" "+p.getValue().getModelo().toUpperCase());
                }
                    
                }catch(UnsupportedOperationException e){
                     System.out.println(" ////////////// Não foi possível acessa a variével!  ");
                }
            
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        tableColumnCodigoBarra.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ProdutosVenda, String>, ObservableValue<String>>(){
        
            @Override
            public ObservableValue<String> call (TableColumn.CellDataFeatures<ProdutosVenda, String> p){
                if(p!=null){
                    return new SimpleObjectProperty(p.getValue().getCodBarra());
                }
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        
        });
         tableColumnCodInterno.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ProdutosVenda, String>, ObservableValue<String>>(){
             
             @Override
            public ObservableValue<String> call (TableColumn.CellDataFeatures<ProdutosVenda, String> p){
                if(p!=null){
                    return new SimpleObjectProperty(p.getValue().getCodInterno());
                }
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
         });
         tableColumnQuantidade.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ProdutosVenda, String>, ObservableValue<String>>(){
              @Override
              public ObservableValue<String> call(TableColumn.CellDataFeatures<ProdutosVenda, String> param) {
                  if(param!=null){
                      // System.out.println(" ////////////// a quantidade na celula é  "+param.getValue().getQuantidade());
                      return new SimpleObjectProperty(param.getValue().getQuantidade());
                  }else{
                     // System.out.println(" ////////////// entrou no else do param  ");
                  }
                  
                  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
              }
         
         });
        
       tableColumnItem.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ProdutosVenda, String>, ObservableValue<String>>(){
             
             @Override
            public ObservableValue<String> call (TableColumn.CellDataFeatures<ProdutosVenda, String> param){
                if(param!=null){
                        return new SimpleObjectProperty(param.getValue().getPosicao());
                }
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
         });  
       
       tableColumnPreco.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ProdutosVenda, String>, ObservableValue<String>>(){
              @Override
              public ObservableValue<String> call(TableColumn.CellDataFeatures<ProdutosVenda, String> param) {
                  if(param!=null){
                        return new SimpleObjectProperty(param.getValue().getpVenda());
                }
                  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
              }
           
       });
       tableColumnTotal.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ProdutosVenda, String>, ObservableValue<String>>(){
              @Override
              public ObservableValue<String> call(TableColumn.CellDataFeatures<ProdutosVenda, String> param) {
                  
                   if(param!=null){
                        return new SimpleObjectProperty(param.getValue().getpVenda()*param.getValue().getQuantidade());
                }
                  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
              }
       
       });
                
        listObservableProduto = FXCollections.observableArrayList(listProduto);
         tableviewProdutos.setItems(listObservableProduto);

    }
    
    private void aplicarDesconto(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Desconto");
        alert.setHeaderText("Aplicar desconto: ");
       // alert.setContentText();
        alert.show();
        
        double decontoCenter = 5;
        
        desconto(decontoCenter);
    }
    private void desconto(double desconto){
         double pvenda =  proSelecVenda.getpVenda();
         double valorASubritrair = proSelecVenda.getpVenda()*desconto/100;
         double valorfinal = pvenda - valorASubritrair;
         String valorDescontado = String.valueOf(valorfinal);
         proSelecVenda.setpVenda(valorfinal);
         edtValorProduto.setText(  "R$ "+proSelecVenda.getpVenda());

       
    }
    private int atribuirQuantidade(){
         if(txtQuantidade.getText().equals("")){  // verifica de o campor TextFild quantidade recebeu valores e trata
                this.quantidade =1;
            }else{
               this.quantidade = Integer.parseInt(txtQuantidade.getText());
            } 
         
         return  this.quantidade;
    }
    

   

}
