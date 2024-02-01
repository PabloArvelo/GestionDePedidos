## ✏️ Actividad - Gestión de pedidos
Crea una aplicación de gestión de pedidos utilizando el patrón experto. Para ello, se requiere implementar un Enum llamado “EstadoPedido” que represente los posibles estados de un pedido. Los estados posibles son "pendiente",  "enviado" y "entregado". Para resolver esta actividad debes: 

- **CREA LA CLASE “PEDIDO**” que contenga los siguientes atributos: “numeroDePedido”, “cliente”, “listaDeProductos” y “estadoDelPedido”. El estado del pedido debe ser una constante de la enumeración "EstadoPedido". La lista de productos debe ser un array de Strings.

- **CREA LA CLASE “PEDIDOSERVICIO”** que se encargue de gestionar los pedidos. Esta clase debe tener métodos para crear un nuevo pedido, actualizar el estado de un pedido existente, buscar pedidos por estado, y obtener la lista completa de pedidos y realizar filtros sobre la misma.

- **CREA LA CLASE “MENUSERVICIO”** para interactuar con el usuario al inicio de la aplicación. El menú debe mostrar opciones para que el usuario pueda crear un nuevo pedido, actualizar el estado de un pedido, buscar pedidos por estado, mostrar lista de pedidos (también poder filtrarlos) y salir de la aplicación.
