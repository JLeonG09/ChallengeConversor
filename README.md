#  Conversor de Monedas en Java

Aplicación de consola desarrollada en **Java 17** que permite convertir montos entre distintas monedas en tiempo real utilizando una API de tasas de cambio.

##  Características

- Conversión en tiempo real usando ExchangeRate API
- Menú interactivo en consola
- Uso de Programación Orientada a Objetos (POO)
- Consumo de API con HttpClient
- Parseo JSON con Gson
- Arquitectura modular

##  Monedas soportadas

- USD — Dólar estadounidense
- CRC — Colón costarricense
- MXN — Peso mexicano
- VES — Bolívar venezolano

##  Conversiones disponibles

1. USD → CRC
2. CRC → USD
3. USD → MXN
4. MXN → USD
5. USD → VES
6. VES → USD

##  API utilizada

https://www.exchangerate-api.com/

Debes colocar tu propia API Key en el código:

https://v6.exchangerate-api.com/v6/TU_API_KEY/latest/USD

##  Cómo ejecutar

1. Tener Java 17 o superior
2. Agregar la librería Gson
3. Compilar:

javac src/*.java

4. Ejecutar:

java -cp src Principal

##  Ejemplo de uso

------------Menu del Conversor----------

1. De USD a Colon Costarricense
2. De Colon Costarricense a USD
3. De USD a Peso Mexicano
4. De Peso Mexicano a USD
5. De USD a Bolivar Venezolano
6. De Bolivar Venezolano a USD
7. Salir

Digite el monto: 100

Resultado: 53125.20 CRC

##  Autor

Josue Leon - Estudiante de Alura Latam e Ingenieria en sistemas

Uso educativo.
