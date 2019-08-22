package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CartuchoFormController implements Initializable {
	
	@FXML
	private TextField txtId;/*1*/
	
	@FXML
	private TextField txtCodigo;/*2*/
	
	@FXML
	private TextField txtCodigoSecundario;/*3*/
	
	@FXML
	private DatePicker dtEntrada;/*4*/
	
	@FXML
	private DatePicker dtSaida ;/*5*/
	
	@FXML
	private TextField txtRetiraNome;/*6*/
	
	@FXML
	private TextField txtMarca;/*7*/
	 
	@FXML
	private TextField txtModelo;/*8*/
	
	@FXML
	private CheckBox cBCor;/*9*/
	
	@FXML
	private CheckBox cBTipo;/*10*/
	
	@FXML
	private TextField txtPesoEntrada;/*11*/
	
	@FXML
	private TextField txtPesoSaida;/*12*/
	
	@FXML
	private CheckBox cBStatus;/*13*/
	
	@FXML
	private TextField txtIdCliente;/*14*/
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		
	}
	
	
}
