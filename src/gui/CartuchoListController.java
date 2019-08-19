package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Cartucho;
import model.services.CartuchoService;

public class CartuchoListController implements Initializable {

	private CartuchoService service;
	
	@FXML
	private TableView<Cartucho> tableViewCartucho;
	
	@FXML
	private TableColumn<Cartucho, Integer> tableColumnId;/*1*/
	
	@FXML
	private TableColumn<Cartucho, Integer> tableColumnCodigo;/*2*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnCodigoSecundario;/*3*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnDataEntrada;/*4*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnDataSaida;/*5*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnRetiradaNome;/*6*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnMarca;/*7*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnModelo;/*8*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnCor;/*9*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnTipo;/*10*/

	@FXML
	private TableColumn<Cartucho, Double> tableColumnPesoEntrada;/*11*/

	@FXML
	private TableColumn<Cartucho, Double> tableColumnPesoSaida;/*12*/

	@FXML
	private TableColumn<Cartucho, String> tableColumnStatus;/*13*/

	@FXML
	private TableColumn<Cartucho, Integer> tableColumnIdCliente;/*14*/
	
	@FXML
	private Button btNovo;
	
	private ObservableList<Cartucho> obsList;
	
	@FXML
	public void onBtNovoAction() {
		System.out.println("onBtNovoAction");
	}
	
	public void setCartuchoService(CartuchoService service) {
		this.service = service;
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("idcartucho"));/*1*/
		tableColumnCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));/*2*/
		tableColumnCodigoSecundario.setCellValueFactory(new PropertyValueFactory<>("codigo_secundario"));/*3*/
		tableColumnDataEntrada.setCellValueFactory(new PropertyValueFactory<>("data_entrada"));/*4*/
		tableColumnDataSaida.setCellValueFactory(new PropertyValueFactory<>("data_saida"));/*5*/
		tableColumnRetiradaNome.setCellValueFactory(new PropertyValueFactory<>("retirada_nome"));/*6*/
		tableColumnMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));/*7*/
		tableColumnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));/*8*/
		tableColumnCor.setCellValueFactory(new PropertyValueFactory<>("cor"));/*9*/
		tableColumnTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));/*10*/
		tableColumnPesoEntrada.setCellValueFactory(new PropertyValueFactory<>("peso_entrada"));/*11*/
		tableColumnPesoSaida.setCellValueFactory(new PropertyValueFactory<>("peso_saida"));/*12*/
		tableColumnStatus.setCellValueFactory(new PropertyValueFactory<>("status"));/*13*/
		tableColumnIdCliente.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));/*14*/
		
		/*para o tableView acompanhar o tamanho da janela*/
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewCartucho.prefHeightProperty().bind(stage.heightProperty());
	}

	public void updateTableView() {
		if(service == null) {
			throw new IllegalStateException("Sevice was null");
		}
		List<Cartucho> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewCartucho.setItems(obsList);
		}
}











