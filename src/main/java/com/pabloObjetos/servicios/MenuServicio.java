package com.pabloObjetos.servicios;

import com.pabloObjetos.Application;

import java.util.Scanner;

public class MenuServicio {
  private static Scanner ingresa = new Scanner(System.in);
  private static int opc;

  public static void opcionMenu() {

    do {
      System.out.print("\n ELIJA UNA OPCION" +
              "\n 1 - crear un nuevo pedido" +
              "\n 2 - actualizar el estado de un pedido" +
              "\n 3 - buscar pedidos por estado" +
              "\n 4 - mostrar lista de pedidos" +
              "\n 5 - salir" +
              "\n ► ");
      opc = ingresa.nextInt();
      switch (opc) {
        case 1: //crear un nuevo pedido
          PedidoServicio.crearPedido();
          break;
        case 2: //actualizar el estado de un pedido
          PedidoServicio.actualizarEstado();
          break;
        case 3: //buscar pedidos por estado
          PedidoServicio.buscarPedidoPorEstado();
          break;
        case 4: //mostrar lista de pedidos
          PedidoServicio.muestraPedidos();
          break;
        case 5: //salir
          break;
        default:
          System.out.println("opción no válida");
          break;
      }
    } while (opc != 5);

  }
}
