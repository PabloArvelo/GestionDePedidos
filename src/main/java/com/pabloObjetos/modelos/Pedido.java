package com.pabloObjetos.modelos;

import com.pabloObjetos.enums.EstadoPedido;


public class Pedido {
  private int numeroPedido;
  private String cliente;
  public static String[] listaDeProductos = new String[]{"agua", "galletas", "cafe", "caramelos", "chocolate"};
  private String pedidoRealizado;
  private EstadoPedido estP;

  //--------------------------------CONSTRUCTORES
  public Pedido() {
  }

  public Pedido(String cliente, String pedidoRealizado) {
    this.cliente = cliente;
    this.pedidoRealizado = pedidoRealizado;
  }


  //--------------------------------GETTER SETTER
  public int getNumeroPedido() {
    return numeroPedido;
  }

  public void setNumeroPedido(int numeroPedido) {
    this.numeroPedido = numeroPedido;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public String[] getListaDeProductos() {
    return listaDeProductos;
  }

  public String getPedidoRealizado() {
    return pedidoRealizado;
  }

  public void setPedidoRealizado(String pedidoRealizado) {
    this.pedidoRealizado = pedidoRealizado;
  }

  public EstadoPedido getEstP() {
    return estP;
  }

  public void setEstP(EstadoPedido estP) {
    this.estP = estP;
  }
}
