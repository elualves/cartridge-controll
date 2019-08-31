package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.entities.Cartucho;

public class CartuchoFormController implements Initializable {
	
	private Cartucho entity;
	
	//private CartuchoService service;
	
	//private List<DataChangeListener> dataChangeListeners = new ArrayList<>();
	
	@FXML
	private TextField txtId;/*1*/
	
	@FXML
	private TextField txtCodigo;/*2*/
	
	@FXML
	private TextField txtCodigoSecundario;/*3*/
	
	@FXML
	private TextField txtEntrada;/*4*/
	
	@FXML
	private TextField txtSaida;/*5*/
	
	@FXML
	private TextField txtRetiraNome;/*6*/
	
	@FXML
	private TextField txtMarca;/*7*/
	 
	@FXML
	private TextField txtModelo;/*8*/
	
	@FXML
	private TextField txtCor;/*9*/
	
	@FXML
	private TextField txtTipo;/*10*/
	
	@FXML
	private TextField txtPesoEntrada;/*11*/
	
	@FXML
	private TextField txtPesoSaida;/*12*/
	
	@FXML
	private TextField txtStatus;/*13*/
	
	@FXML
	private TextField txtIdCliente;/*14*/
	
	@FXML
	private Button btSalvar;
	
	@FXML
	private Button btCancelar;
	
	public void setCatucho(Cartucho entity) {
		this.entity = entity;
	}
	
	@FXML
	public void onBtSalvarAction() {
		System.out.println("onBtSalvarAction");
	}
	
	@FXML
	public void onBtCancelarAction() {
		System.out.println("onBtCancelarAction");
	}
	
	/*

	public void setCartuchoService(CartuchoService service) {
		this.service = service;
	}
	*/
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		 
	}
	
	public void updateFormData() {
		txtId.setText(String.valueOf(entity.getIdcartucho()));
		txtCodigo.setText(String.valueOf(entity.getCodigo()));
		txtCodigoSecundario.setText(entity.getCodigo_secundario());
		txtEntrada.setText(entity.getData_entrada());
		txtSaida.setText(entity.getData_saida());
		txtRetiraNome.setText(entity.getRetirada_nome());
		txtMarca.setText(entity.getMarca());
		txtModelo.setText(entity.getModelo());
		txtCor.setText(entity.getCor());
		txtTipo.setText(entity.getTipo());
		txtPesoEntrada.setText(String.valueOf(entity.getPeso_entrada()));
		txtPesoSaida.setText(String.valueOf(entity.getPeso_saida()));
		txtStatus.setText(entity.getStatus());
		txtIdCliente.setText(String.valueOf(entity.getId_cliente()));
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
