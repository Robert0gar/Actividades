Este proyecto implementa estructuras de datos clásicas (Pila y Cola) utilizando listas ligadas en Java.
Se simula un sistema básico de gestión de comandos y procesos.
Actividad2ED/
Node.java         # Nodo genérico.
LinkedList.java   # Lista ligada simple.
Stack.java        # Implementación de pila (LIFO).
Queue.java        # Implementación de cola (FIFO).
Main.java         # Menú principal e interacción con el usuario.

El menú principal ofrece las siguientes opciones:
1. Agregar comando
2. Agregar proceso
3. Ver comandos y procesos agregados
4. Ejecutar comandos como pila
5. Ejecutar procesos como cola
6. Salir

Agregar comandos:
Ejemplos de ejecución:
Ingresa un comando: lb
¿Deseas agregar otro comando? (si/no): si.
Ingresa un comando: ls
¿Deseas agregar otro comando? (si/no): no.
Estado de la pila: ls -> lb -> null

Ejecutar comandos como pila:
Siguiente comando:  ls
¿Deseas ejecutarlo? (si/no): si.
Ejecutando: ls

Siguiente comando: lb
¿Deseas ejecutarlo? (si/no): si.
Ejecutando: lb

Agregar procesos:
Ingresa un proceso: alt
¿Deseas agregar otro proceso? (si/no): si.
Ingresa un proceso: rt
¿Deseas agregar otro proceso? (si/no): no.
Estado de la cola: alt -> rt -> null

Ejecutar comandos como cola:
Siguiente proceso: alt
¿Deseas ejecutarlo? (si/no): si.
Ejecutando: alt

Siguiente proceso: rt
¿Deseas ejecutarlo? (si/no): si.
Ejecutando: rt

Conclusión
Se muestra la utilidad de las pilas (LIFO) para manejar comandos y de las colas (FIFO) para gestionar procesos.

Para poder ejecutarlo necesitas tener un editor por ejemplo Visual Studio y tener los archivos guardados en la carpeta Actividad 2 del repositorio Actividades, ya con los archivos en VS podrás correr el código correctamente.


