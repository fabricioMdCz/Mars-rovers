Mars-rovers
===========

Software de Mars rovers

La siguiente aplicacion cuenta con dos main dentro de él.
El primero es el "Ejecutable" que al introducir los datos nos devuelve solamente los elementos de salida.
El segundo es el "Ejecutable_grafico" que este ademas de devolvernos los elementos de salida nos muestra una matriz y dentro de ella se ve en que posicion anda el rovers
la matriz basica es de 30*30 si se decea hacerla mas amplia solo se debe aumentar el tamaño en la clase llamada "Principal" ya que son valores estaticos

formas de introducir datos:

Paso 1.- Nos va a pedir introducir  el numero de rovers que introduciremos: podemos colocar de 1 en adelante.
Paso 2.- Nos pedira introducir la coordenada de entrada a la cual le pasaremos dos paramentros separados por un espacio por ejemplo de la siguiente manera ->5 5
Paso 3.- Nos dira que ingresemos el la Posicion Inicial del rovers que tomara como base la coordenada de entrada y debemos de ingresar los datos separdos por un 
espacio por ejemplo de la siguiente manera ->1 2 N
Paso 4.- Nos indicara que debemos ingresar los movientos los cual debemos hacer sin espacio por ejemplo de la siguiente manera->LMLMLMLMM.
Paso 5.- Si hemos colocado en el Paso 1 que introduciremos mas de 1 rovers, el programa hara un ciclo con los Pasos 2 y 3, caso contrario nos imprimara algo asi->1 3 N
