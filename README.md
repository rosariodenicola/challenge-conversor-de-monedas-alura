# challenge-conversor-de-monedas-alura

🚀 Características principales

Conversión de monedas usando tasas actualizadas.

Integración con la API:

https://v6.exchangerate-api.com


Menú interactivo por consola.

Conversión rápida entre pares de monedas frecuentes (USD, ARS, BRL, CLP, etc.)

Opción para convertir cualquier otro par de monedas ingresadas por el usuario.

Manejo de errores en caso de fallos en la API.

Proyecto estructurado en clases simples y organizadas.

Estructura del proyecto
src/
 ├── Principal.java
 ├── ConsultarMoneda.java
 └── ConvertirMoneda.java

Principal.java

Contiene el menú principal y controla el flujo general del programa.

ConsultarMoneda.java

Se encarga de realizar solicitudes HTTP a la API y obtener la tasa de conversión.

ConvertirMoneda.java

Procesa las conversiones y muestra los resultados al usuario.



🧠 ¿Cómo funciona?

El usuario selecciona una opción del menú.

El sistema consulta a la API el valor de conversión del par elegido.

El usuario ingresa la cantidad a convertir.

El programa devuelve el resultado final ya convertido.

🛠️ Tecnologías utilizadas

Java 17

HTTPClient (Java.net.http)

Gson para parsear JSON

IntelliJ IDEA (desarrollo)

Maven para la gestión del proyecto



🌎 API utilizada

Este proyecto utiliza la API “ExchangeRate API v6”.


🙌 Autor

Proyecto desarrollado por https://github.com/rosariodenicola Rosario, como parte del programa Alura + Oracle ONE.

📌 Más información:
https://www.exchangerate-api.com/
