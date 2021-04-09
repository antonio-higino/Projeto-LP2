package br.ufrn.imd.controle;

import java.io.IOException;

import br.ufrn.imd.dao.Banco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaPagamentoController {
	
	private Stage pagamentoStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    private Button botaoPagar;

    @FXML
    private TextField textFieldIdDaComanda;

    @FXML
    private TextField textFieldAvisoPagamento;

    @FXML
    private TextArea textAreaExibicaoDaComanda;
    
    @FXML
    private Button botarMostrarConteudo;

    @FXML
    void efetuarPagamento(ActionEvent event) throws IOException {
    	try {
    		Banco banco = Banco.getInstance();
    		
    		int idDaComanda = Integer.parseInt(textFieldIdDaComanda.getText());
    		
    		if(banco.getBancoComandas().buscarComanda(idDaComanda)) {
    			
    			String output = banco.getBancoComandas().getComandaEspecifica(idDaComanda).listarPedidos();
    			
    			textAreaExibicaoDaComanda.setText(output);
    			
    			double valorPago = banco.getBancoComandas().getComandaEspecifica(idDaComanda).getValorTotal(); 
    			
    			banco.adicionarSaldo(valorPago);
    			banco.getBancoComandas().getComandaEspecifica(idDaComanda).setFoiPaga(true);
    			
    			abrirTelaSucessoPagamento();
    			pagamentoStage.close();
    		
    		}else {
    			textFieldAvisoPagamento.setText("Comanda não encontrada");
    		}
    		
    	} catch(NumberFormatException ex) {
    		textFieldAvisoPagamento.setText("Número inválido");
    	}
    }

    @FXML
    void fecharJanela(ActionEvent event) {
    	pagamentoStage.close();
    }
    
    @FXML
    void preencherConteudoDaComanda(ActionEvent event) {
    	try {
    		Banco banco = Banco.getInstance();
    		
    		int idDaComanda = Integer.parseInt(textFieldIdDaComanda.getText());
    		
    		if(banco.getBancoComandas().buscarComanda(idDaComanda)) {
    			
    			String output = banco.getBancoComandas().getComandaEspecifica(idDaComanda).listarPedidos();
    			
    			textAreaExibicaoDaComanda.setText(output);
    		
    		}else {
    			textFieldAvisoPagamento.setText("Comanda não encontrada");
    		}
    		
    	} catch(NumberFormatException ex) {
    		textFieldAvisoPagamento.setText("Número inválido");
    	}
    }
    
    private void abrirTelaSucessoPagamento() throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaSucessoPagamentoController.class.getResource("/br/ufrn/imd/visao/TelaSucessoPagamento.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage sucessoPagamentoStage = new Stage();
    	sucessoPagamentoStage.setTitle("Sucesso no pagamento");
    	sucessoPagamentoStage.setResizable(false);
    	Scene scene = new Scene(page);
    	sucessoPagamentoStage.setScene(scene);
    	
    	TelaSucessoPagamentoController controller = loader.getController();
    	controller.setSucessoPagamentoStage(sucessoPagamentoStage);
    	sucessoPagamentoStage.showAndWait();
    	pagamentoStage.close();
    }

	public void setPagamentoStage(Stage pagamentoStage) {
		this.pagamentoStage = pagamentoStage;
	}
}