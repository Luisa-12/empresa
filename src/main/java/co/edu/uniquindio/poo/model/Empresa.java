package co.edu.uniquindio.poo.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Empresa {

    private String nombre;
    private ObservableList<Cliente> clientes;
    private ObservableList<Vehiculo> vehiculos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.clientes = FXCollections.observableArrayList();
        this.vehiculos = FXCollections.observableArrayList();
    }

    /**
     * Método para agregar un cliente
     * @param cliente
     */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Método para agregar un vehículo
     * @param vehiculo
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Obtener la lista de clientes
     * @return
     */
    public ObservableList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Obtener la lista de vehículos
     * @return
     */
    public ObservableList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClientes(ObservableList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVehiculos(ObservableList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    
}