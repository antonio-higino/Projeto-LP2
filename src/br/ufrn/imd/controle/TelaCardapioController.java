package br.ufrn.imd.controle;

import java.io.IOException;

import br.ufrn.imd.dao.Banco;
import br.ufrn.imd.dao.Cardapio;
import br.ufrn.imd.modelo.Pedido;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaCardapioController {
	
	private Stage cardapioStage;
	
	@FXML
    private TextArea textAreaPratos;

    @FXML
    private CheckBox checkBoxFrango;

    @FXML
    private CheckBox checkBoxCarne;

    @FXML
    private CheckBox checkBoxPeixe;

    @FXML
    private CheckBox checkBoxHamburger;

    @FXML
    private TextField textFieldQntFrango;

    @FXML
    private TextField textFieldQntCarne;

    @FXML
    private TextField textFieldQntPeixe;

    @FXML
    private TextField textFieldQntHamburger;

    @FXML
    private TextArea textAreaBebidas;

    @FXML
    private CheckBox checkBoxAgua;

    @FXML
    private CheckBox checkBoxSuco;

    @FXML
    private CheckBox checkBoxCoca;

    @FXML
    private CheckBox checkBoxGuarana;

    @FXML
    private TextField textFieldQntAgua;

    @FXML
    private TextField textFieldQntSuco;

    @FXML
    private TextField textFieldQntCoca;

    @FXML
    private TextField textFieldQntGuarana;

    @FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    private Button botaoFinalizarPedido;

    @FXML
    private TextField textFieldIdDaComanda;

    @FXML
    private TextField textFieldAvisoCardapio;

    @FXML
    void fecharJanela(ActionEvent event) {
    	cardapioStage.close();
    }

    @FXML
    void finalizarPedido(ActionEvent event) throws IOException {
    	try {
    		Banco banco = Banco.getInstance();
    		//String input = textFieldIdDaComanda.getText();
    		int idDaComanda = Integer.parseInt(textFieldIdDaComanda.getText());
    		
    		if(banco.getBancoComandas().buscarComanda(idDaComanda)) {
    			
    			if(!checarPedidoVazio()) {
	        		Pedido pedido = new Pedido();
	        		int idDoPedido = banco.getFilaDaCozinha().getContadorParaId();
	        		String nome = banco.getBancoComandas().getComandaEspecifica(idDaComanda).getNomeDoCliente();
	        		
	        		pedido.setId(idDoPedido);
	        		pedido.setNomeDoCliente(nome);
	        		
	        		if(checkBoxFrango.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntFrango.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(1);
	        			}
	        		}
	        		
	        		if(checkBoxCarne.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntCarne.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(2);
	        			}
	        		}
	        		
	        		if(checkBoxPeixe.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntPeixe.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(3);
	        			}
	        		}
	        		
	        		if(checkBoxHamburger.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntHamburger.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(4);
	        			}
	        		}
	        		
	        		if(checkBoxAgua.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntAgua.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(5);
	        			}
	        		}
	        		
	        		if(checkBoxSuco.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntSuco.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(6);
	        			}
	        		}
	        		
	        		if(checkBoxCoca.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntCoca.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(7);
	        			}
	        		}
	        		
	        		if(checkBoxGuarana.isSelected()) {
	        			int quantidade = Integer.parseInt(textFieldQntGuarana.getText());
	        			for(int i = 0; i < quantidade; i++) {
	        				pedido.adicionarItem(8);
	        			}
	        		}
	        		
	        		banco.getBancoComandas().getComandaEspecifica(idDaComanda).adicionarPedido(pedido);
	        		banco.getFilaDaCozinha().adicionarPedidoNaFila(pedido);
	        		
	        		abrirTelaMostrarPedidoRealizado(pedido);
	        		cardapioStage.close();
	        		
    			}else {
    				textFieldAvisoCardapio.setText("Pedido vazio (inválido)");
    			}
        	}else {
        		textFieldAvisoCardapio.setText("Comanda não encontrada");
        	}
    		
    	} catch(NumberFormatException ex){
    		textFieldAvisoCardapio.setText("Número inválido");
    	}
    }
    
    public void preencherTextAreas() {
    	Cardapio cardapio = new Cardapio();
    	
    	textAreaPratos.setText(cardapio.listarPratos());
    	textAreaBebidas.setText(cardapio.listarBebidas());
    }
    
    private boolean checarPedidoVazio() {
    	if(checkBoxFrango.isSelected()) {
    		if(Integer.parseInt(textFieldQntFrango.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else if(checkBoxCarne.isSelected()){
    		if(Integer.parseInt(textFieldQntCarne.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else if(checkBoxPeixe.isSelected()){
    		if(Integer.parseInt(textFieldQntPeixe.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else if(checkBoxHamburger.isSelected()){
    		if(Integer.parseInt(textFieldQntHamburger.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else if(checkBoxAgua.isSelected()){
    		if(Integer.parseInt(textFieldQntAgua.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else if(checkBoxSuco.isSelected()){
    		if(Integer.parseInt(textFieldQntSuco.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else if(checkBoxCoca.isSelected()){
    		if(Integer.parseInt(textFieldQntCoca.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else if(checkBoxGuarana.isSelected()){
    		if(Integer.parseInt(textFieldQntGuarana.getText()) > 0) {
    			return false;
    		}
    		return true;
    	}else {
    		return true;
    	}
    }
    
    private void abrirTelaMostrarPedidoRealizado(Pedido pedido) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaMostrarPedidoRealizadoController.class.getResource("/br/ufrn/imd/visao/TelaMostrarPedidoRealizado.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage pedidoStage = new Stage();
    	pedidoStage.setTitle("Pedido Realizado");
    	pedidoStage.setResizable(false);
    	Scene scene = new Scene(page);
    	pedidoStage.setScene(scene);
    	
    	TelaMostrarPedidoRealizadoController controller = loader.getController();
    	controller.setPedidoStage(pedidoStage);
    	controller.preencherTextAreaMostrarPedido(pedido.listarItens());
    	pedidoStage.showAndWait();
    }

	public void setCardapioStage(Stage cardapioStage) {
		this.cardapioStage = cardapioStage;
	}
}