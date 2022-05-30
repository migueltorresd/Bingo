# Headline H1
## Headline H2
### Headline H3
#### Headline H4 
##### Headline H5
###### Headline H6

## Table of Contents
1. [Informacion General](#informacion-general)
2. [Requerimientos](#requerimientos)
3. [Instalacion](#instalacion)
4. [Tecnologias](#tecnologias)
5. [Estado](#estado)

### Informacion General
En este proyecto cree un juego de bingo utilizando todos los conocimientos adquridos tanto como de la cantera 1 y la 2, es gratificante saber que apesar de que no selogro el 100% del objetivo se adquirio muchisimo conocimiento.

Acontinuacion una breve descripcion del funcionamiento del juego:

El juego se compone de una pantalla inicial donde tenemos un login por usuario y contraseña donde si el usuario no posee estos debe pasar por un registro que encontrara en la parte inferior o se puede dirigir en la parte superior derecha donde esta la opcion "Registrate".

luego de registrase y loguarse determinara si hay mas jugadores o de lo contrario espera un par de minutos para continuar.

por ultimo encontramos el juego donde tendra su tarjeton con numeros aleatorios y a medida que va transcurriendo el tiempo van saliendo las balotas, el usuario debe estar muy atento para ir llenando su tarjeton al finalizar debe dar click en el boton !!BINGO!!.

### Requerimientos
La empresa "El Gran Buda", una casa de juegos de apuestas y azar, requiere desarrollar un Bingo Virtual, bajo los siguientes requerimientos.

    Cada persona deberá ser un usuario del sistema, usted puede usar lo que más le convenga como por ejemplo:
        El clásico usuario y contraseña.
        Identificación con cualquier red social.
        Identificación con cuentas de correo como por ejemplo de Gmail, Outlook, entre otros.
        Identificación por medio alguna wallet como por ejemplo MetaMask (web 3.0)
    Los usuarios (backend) serán manejados con NodeJS + MongoDB.
    El frontend puede ser desarrollado en Angular, ReactJS, VueJS o cualquier otro framework y/o librería, como también lo puede hacer en HTML puro producido desde NodeJS bajo la tecnología que usted desee escoger.
    La comunicación entre el frontend y el backend, debe ser de forma exclusiva por medio de fetch, axios o cualquier otro método que use la tecnología AJAX; si desea usar websockets también lo puede hacer, no hay problema.
    El backend, es decir, quien maneja la lógica del negocio, deberá ser escrita en Java con Spring Boot.
    La base debe principal debe usar MySQL, PostgreSQL, Oracle o MSSQL.
    Aplique todos los conocimientos adquiridos en Cantera Nivel 2.
    El backend en Java, sí requiere información de un usuario, el sistema deberá solicitarlo a NodeJS a través del consumo de un API.

### Screenshot


### Tecnologias

El taller fue desarrollado usando.
   - Backend1: Visual Studio code y Nodejs.
   - Backend2: IntelliJ Ultimate y Spring Boot.
   - Frontend: Visual Studio code y HTML, CSS, JS.
   - Bases de datos: MongoDB y MySQL Workbench 8.0.

   ## Estado
>En revisión para el administrador.   
>Última actualización 29/05/2022.   
>No se Logra conexion entre el backend2 y el frontend.


## Autor  
 Miguel Angel Torres Diaz




 public class Bingo {

    ArrayList Lb = new ArrayList();
    ArrayList Li = new ArrayList();
    ArrayList Ln = new ArrayList();
    ArrayList Lg = new ArrayList();
    ArrayList Lo = new ArrayList();

    boolean bingo = false; //ternimar juego

    public void ilistas() {
        this.Lb.add("B");
        this.Li.add("I");
        this.Ln.add("N");
        this.Lg.add("G");
        this.Lo.add("O");
public void glista() {
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            this.Lb.add(rd.nextInt(15));
            this.Li.add(rd.nextInt(15) + 15);
            this.Ln.add(rd.nextInt(15) + 30);
            this.Lg.add(rd.nextInt(15) + 45);
            this.Lo.add(rd.nextInt(15) + 60);
        }
    }

    public void bolillas() {
        String[] bolillas = new String[5];
        bolillas[0] = "B";
        bolillas[1] = "I";
        bolillas[2] = "N";
        bo
   switch (bolilla) {
            case "B":
                this.xcartilla(Lb, numero);
                break;
            case "I":
                numero += 15;
                this.xcartilla(Li, numero);
                break;
            case "N":
                numero += 30;
                this.xcartilla(Ln, numero);
                break;
            case "G":
                numero += 45;