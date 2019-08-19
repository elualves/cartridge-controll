package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.CartuchoService;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemPesquisaCartucho;
	
	@FXML
	private MenuItem menuItemCadastroCartucho;
	
	@FXML
	private MenuItem menuItemCadastroCliente;
	
	@FXML
	private MenuItem menuItemCadastroMercadoria;
	
	@FXML
	private MenuItem menuItemRelatorioCartucho;
	
	@FXML
	private MenuItem menuItemAjudaSistema;
	
	@FXML
	public void onMenuItemPesquisaCartuchoAction() {
		
	}
	
	@FXML
	public void onMenuItemCadastroCartuchoAction() {
		loadView("/gui/CartuchoList.fxml", (CartuchoListController controller) -> {
			controller.setCartuchoService(new CartuchoService());
			controller.updateTableView();
		});
	}
	
	@FXML
	public void onMenuItemCadastroClienteAction() {
		System.out.println("onMenuItemCadastroClienteAction");
	}
	
	@FXML
	public void onMenuItemCadastroMercadoriaAction() {
		System.out.println("onMenuItemCadastroMercadoriaAction");
	}
	
	@FXML
	public void onMenuItemRelatorioCartuchoAction() {
		System.out.println("onMenuItemRelatorioCartuchoAction");
	}
	
	@FXML
	public void onMenuItemAjudaSistemaAction() {
		loadView("/gui/Ajuda.fxml", x -> {});
	}
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}
	
	private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initializingAction.accept(controller);
		}
		
		catch(IOException e) {
			Alerts.showAlerts("ERROR", "Erro ao carregar a página", e.getMessage(), AlertType.ERROR);
		}
	}
}















