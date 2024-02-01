package com.pabloObjetos.servicios;

import com.pabloObjetos.Application;
import com.pabloObjetos.enums.EstadoPedido;
import com.pabloObjetos.modelos.Pedido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PedidoServicio {

  public static int numeraPedido = 100;
  private static int opc1, opc2;
  private static Scanner ingresa = new Scanner(System.in);

  public static void crearPedido() {

    Scanner ingresa = new Scanner(System.in);
    System.out.print("ingrese nombre cliente: ");
    String cliente = ingresa.next();
    System.out.println("seleccione item: ");

    for (int i = 0; i < Pedido.listaDeProductos.length; i++) {
      System.out.println("Nro Item: " + (i + 1) + " - " + Pedido.listaDeProductos[i]);
    }
    int item = ingresa.nextInt();
    String pedidoRealizado = Pedido.listaDeProductos[item - 1];

    Pedido nuevoPedido = new Pedido(cliente, pedidoRealizado);
    nuevoPedido.setNumeroPedido(numeraPedido++);

    nuevoPedido.setEstP(EstadoPedido.PENDIENTE);
    Application.listadoDePedidos.add(nuevoPedido);
  }

  public static void muestraPedidos() {
    for (int i = 0; i < Application.listadoDePedidos.size(); i++) {
      System.out.println("ID : " + (i+1)+
              "         órden Nº: " + Application.listadoDePedidos.get(i).getNumeroPedido()+
              " cliente: "+Application.listadoDePedidos.get(i).getCliente()+
              " pedido: "+Application.listadoDePedidos.get(i).getPedidoRealizado()+
              " estado: "+Application.listadoDePedidos.get(i).getEstP());
    }
  }

  public static void actualizarEstado() {

    EstadoPedido[] estados = EstadoPedido.values();

    System.out.println("elija el pedido a actualizar:");
    muestraPedidos();
    opc1 = ingresa.nextInt();

    System.out.print("\n SELECCIONE NUEVO ESTADO" +
            "\n 1 - pendiente" +
            "\n 2 - enviado" +
            "\n 3 - entregado" +
            "\n ► ");
    opc2 = ingresa.nextInt();
    Application.listadoDePedidos.get(opc1 - 1).setEstP(estados[opc2 - 1]);
  }

  public static void buscarPedidoPorEstado() {
    EstadoPedido[] estados = EstadoPedido.values();
    Pedido[] lp = Application.listadoDePedidos.toArray(new Pedido[0]);  // convierto el listArray a Array comun

    System.out.print("\n SELECCIONE FILTRO ESTADO " +
            "\n 1 - pendiente" +
            "\n 2 - enviado" +
            "\n 3 - entregado" +
            "\n ► ");
    opc2 = ingresa.nextInt();

    Pedido[] pedidosPorEstado = Arrays.stream(lp)
            .filter(est -> est.getEstP() == estados[opc2-1])
            .toArray(Pedido[]::new);

    for (int i = 0; i < pedidosPorEstado.length; i++) {
      System.out.println("ID : " + (i+1)+
              "         órden Nº: " + pedidosPorEstado[i].getNumeroPedido()+
              " cliente: "+pedidosPorEstado[i].getCliente()+
              " pedido: "+pedidosPorEstado[i].getPedidoRealizado()+
              " estado: "+pedidosPorEstado[i].getEstP());
    }
  }
}

