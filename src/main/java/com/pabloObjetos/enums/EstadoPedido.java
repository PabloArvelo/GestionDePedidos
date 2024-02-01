package com.pabloObjetos.enums;

public enum EstadoPedido {
  PENDIENTE("el pedido está pendiente"),
  ENVIADO("el pedido está enviado"),
  ENTREGADO("el pedido está entregado");

  private String descripcion;

  EstadoPedido(String descripcion) {
    this.descripcion = descripcion;
  }
  public String getDescripcion() {
    return descripcion;
  }
}
