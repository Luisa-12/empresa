package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.viewController.ClienteViewController;
import co.edu.uniquindio.poo.viewController.PrimaryController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    public static Empresa empresa = new Empresa("UQ");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Gestion de Clientes");
        openViewPrincipal();
    }

    private void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("primary.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            PrimaryController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void openCrudReserva() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudReserva.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ReservaViewController reservaViewController = loader.getController();
            if (reservaViewController != null) {
                reservaViewController.setApp(this);
                reservaViewController.setClientes(empresa.getClientes()); // Establece los clientes en el controlador
                reservaViewController.setVehiculos(empresa.getVehiculos()); // Establece los vehículos en el controlador
            } else {
                System.out.println("El controlador reservaViewController es nulo");
            }

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //Ingreso de datos quemados

    public void inicializarData(){
        empresa.agregarCliente = new Cliente("12233", "juan","juan@", "324" );
        empresa.agregarCliente = new Cliente("1878", "Luisa","Lu@", "322" );
        empresa.agregarCliente = new Cliente("7897", "Migue","Miguelo@", "316" );
    }
}



