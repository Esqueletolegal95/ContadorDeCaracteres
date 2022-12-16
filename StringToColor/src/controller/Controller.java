package controller;

import java.net.URL;
import java.util.ResourceBundle;
import model.Palavra;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Controller implements Initializable{
	
	@FXML
	private Text contador = new Text();
	
	@FXML
	private TextArea texto = new TextArea();
	
	@FXML
	private Text cor = new Text();
	
	@FXML
	private Pane fundo = new Pane();
	

	@FXML
	public void botaopressionado() {
		Palavra palavra = new Palavra(texto.getText());
		if(palavra.getTamanho() == 0) {
			fundo.setStyle("-fx-background-color: white;");
			cor.setText("Color: white");}
		if(palavra.getTamanho() < 50 && palavra.getTamanho() != 0) {
			fundo.setStyle("-fx-background-color: red;");
			cor.setText("Color: red");}
		if(palavra.getTamanho() < 100 && palavra.getTamanho() >= 50) {
			fundo.setStyle("-fx-background-color: orangered;");
			cor.setText("Color: orange red");}
		if(palavra.getTamanho() < 150 && palavra.getTamanho() >= 100) {
			fundo.setStyle("-fx-background-color: darkorange;");
			cor.setText("Color: dark orange");}
		if(palavra.getTamanho() < 200 && palavra.getTamanho() >= 150) {
			fundo.setStyle("-fx-background-color: orange;");
			cor.setText("Color: orange");}
		if(palavra.getTamanho() < 250 && palavra.getTamanho() >= 200) {
			fundo.setStyle("-fx-background-color: yellow;");
			cor.setText("Color: yellow");}
		if(palavra.getTamanho() < 300 &&  palavra.getTamanho() >= 250) {
			fundo.setStyle("-fx-background-color: greenyellow;");
			cor.setText("Color: green yellow");}
		if(palavra.getTamanho() < 350 &&  palavra.getTamanho() >= 300) {
			fundo.setStyle("-fx-background-color: green;");
			cor.setText("Color: green");}
		if(palavra.getTamanho() < 400 &&  palavra.getTamanho() >= 350) {
			fundo.setStyle("-fx-background-color: lime;");
			cor.setText("Color: lime");}
		if(palavra.getTamanho() < 450 &&  palavra.getTamanho() >= 400) {
			fundo.setStyle("-fx-background-color: cyan;");
			cor.setText("Color: cyan");}
		if(palavra.getTamanho() < 500 &&  palavra.getTamanho() >= 450) {
			fundo.setStyle("-fx-background-color: blue;");
			cor.setText("Color: blue");}
		if(palavra.getTamanho() < 550 &&  palavra.getTamanho() >= 500) {
			fundo.setStyle("-fx-background-color: darkblue;");
			cor.setText("Color: dark blue");}
		if(palavra.getTamanho() < 600 &&  palavra.getTamanho() >= 550) {
			fundo.setStyle("-fx-background-color: indigo;");
			cor.setText("Color: indigo");}
		if(palavra.getTamanho() < 650 &&  palavra.getTamanho() >= 600) {
			fundo.setStyle("-fx-background-color: purple;");
			cor.setText("Color: purple");}
		if(palavra.getTamanho() < 700 &&  palavra.getTamanho() >= 650) {
			fundo.setStyle("-fx-background-color: deeppink;");
			cor.setText("Color: deep pink");}
		if(palavra.getTamanho() < 750 &&  palavra.getTamanho() >= 700) {
			fundo.setStyle("-fx-background-color: pink;");
			cor.setText("Color: pink");}
		if(palavra.getTamanho() >= 750) {
			fundo.setStyle("-fx-background-color: peru;");
			cor.setText("Color: peru");}
		contador.setText("Counter: " + Integer.toString(palavra.getTamanho()));;

		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
