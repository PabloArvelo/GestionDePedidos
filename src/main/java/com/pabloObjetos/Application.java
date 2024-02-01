package com.pabloObjetos;

import com.pabloObjetos.modelos.Pedido;
import com.pabloObjetos.servicios.MenuServicio;

import java.util.ArrayList;

public class Application {
    public static ArrayList<Pedido> listadoDePedidos = new ArrayList<>();

    public static void main(String[] args) {
        MenuServicio.opcionMenu();
    }
}
