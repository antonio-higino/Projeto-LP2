package br.ufrn.imd;

//import br.ufrn.imd.dao.Banco;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("visao/TelaPrincipal.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Tela de Boas-vindas");
		stage.setResizable(false);
		stage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Banco banco = Banco.getInstance();
		//banco.getCardapio().listarTudo();
		launch(args);
	}

}