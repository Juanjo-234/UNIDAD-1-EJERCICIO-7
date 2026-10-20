Este programa está diseñado para modelar y gestionar el control de la colección de **tomos de manga** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `TomoManga`:** Modela un volumen de manga específico conteniendo los atributos principales: el título de la obra (`tituloObra`), el número de volumen (`numeroVolumen`), el precio de compra (`precioCompra`) y un indicador lógico de lectura (`leido`).
* **Valida los datos a través del constructor:** Cuenta con un constructor completo que inicializa el estado de lectura en falso (`false`) por defecto y aplica validaciones lógicas para evitar que el número de volumen o el precio de compra admitan valores negativos.
* **Actualiza el estado (`marcarComoLeido`):** Implementa un método que permite cambiar el estado del indicador booleano a leído.
* **Informa el progreso (`estadoLectura`):** Muestra por consola si el tomo se encuentra pendiente de lectura o si ya ha sido finalizado.
* **Ejecuta la prueba (`main`):** Crea un objeto de tipo `TomoManga` (por ejemplo, el volumen 3 de una obra), invoca el método para marcarlo como leído y muestra su estado actualizado por consola.
