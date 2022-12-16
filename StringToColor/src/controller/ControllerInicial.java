package controller;

import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ControllerInicial implements Initializable{
	@FXML
	private Pane fundo = new Pane();
	
	
	@FXML
	private Button botao = new Button();
	
	@FXML
	public void click() {
		try {

			Pane a = (Pane) FXMLLoader.load(getClass().getResource("/view/ContadorDeCaracters.fxml")); // Chamando o fxml
			fundo.getChildren().setAll(a);
			} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Tentativa de mudar a cena para a tela de simulacao \n" + e.getMessage());
			}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
