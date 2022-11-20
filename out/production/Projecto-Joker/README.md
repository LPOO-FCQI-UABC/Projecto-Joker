# Projecto-Joker
Prototipo de proyecto de LPOO

Aqui se encuentra la explicación de nuestra primera versión de biblioteca de código para el desarrollo de juegos 2D colaborativos, para el diseño de módulos educativos e interactivos en museos para niños.


CLASE MAPA:

En esta clase se puede crear un nuevo panel donde se desarrollara el juego. 
Un objeto tipo Obstaculo para crear un obstaculo y un arreglo de obstáculos para guardar la cnatidad de obstáculos que se verán en el mapa.
Contine los setters y getters apropiados por cada uno de sus atributos, así como los siguiente métodos:

-public void dimenisonesAleatorias(int nivel): Dependiendo del nivel ingresado por el desarrollador, se le asignara las dimensiones del mapa de forma aleatoria.
   
-public void dimenisonesFijas(int x, int y): Aqui se le asigna las dimensiones del mapa establecidas por el desarrollador.

-public void setBackgroundImage(Image bg):Aqui se le asigna la imagen de fondo del mapa, establecido por el desarrollador.
       
-public void addObstaculosAleatoriamente(int nivel):  Dependiendo del nivel ingresado por el desarrollador, se agregaran obstaculos aleaotriamente en el mapa y se van a agregando al atributo arreglo.

-public void addObstaculos(int cant,int x,int y): El desarrolladro puede agregar una cantidad fija de obstáculos en cualquier posicion, y se van a agregando al atributo arreglo.

-public void setPointMetaAleatorio(int nivel): El desarrollador tendrá que haber creado las dimensiones del mapa anteriormente para la función de este método. Dependiendo del nivel, se pondrá en una coordenada aleatoria la meta del juego.

-public void setPointMetaFijo(int x, int y): El desarrollador dará por parámetros la coordenada de la meta puesta en el mapa.

-public void setNumeroJugadores(int nivel): El desarrollador podrá obtener el mínimo y máximo de jugadores que pueden jugar en la partida dependiendo del nivel introducido.


CLASE OBSTACULO:

Esta clase representa el obstaculo que se crea en el juego  a desarrollar.
El obstaculo es una imagen con altura, ancho y diametro fijo al principio que luego puede ser modificado por el desarrollador.
Tambien contiene variable que represenan su posicion inicial, asi como los metodos getters y setters de sus atributos.
Contine para cambiar el ancho y alto de la imagen, asi como un metodo para cambiar la imagen que se utiliza para representar el obstaculo.


CLASE META:
Esta clase proporciona la configuración completa para la personalización de la meta final de la partida. La meta es una imagen con altura, anchura y diámetro, cuyas especificaciones pueden ser manipuladas por el desarrollador.

CLASE TECLADO:
En esta clase se propoorciona un lienzo en donde se probara la manipulacion del personaje por medio de control del teclado, quiens era manipulado por el usuario. 

CLASE LIENZO: 
En esta clase se porporciona la confirguracion para mover el personaje pornmedio de las teclas "w", W, "a", "A", "d", "D", "s", "S", para que e usuario pueda mover al personaje a arriba, abajo, derecha e izquierda. 
       
