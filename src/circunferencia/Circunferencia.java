/*
13. Un profesor de geometría de una escuela necesita que usted le desarrolle un programa orientado a objetos 
que permita manejar dos (2) circunferencias en el plano cartesiano. 
El programa debe leer la información de la coordenada x y la coordenada y, del centro de cada circunferencia, 
así como su radio. 
También debe tener la posibilidad de mostrar la información de cada circunferencia después de que ha sido ingresada. 
Igualmente debe estar en la capacidad de calcular y mostrar el área de cada circunferencia e 
indicar cuál es la que tiene mayor área. 
De manera similar debe calcular, mostrar y comparar las longitudes de las dos (2) circunferencias. 
El programa también debe tener una opción a través de la cual indique al usuario 
si las dos circunferencias se intersectan, es decir, si se solapan en el plano cartesiano.

El programa debe mostrar un menú con las siguientes opciones:
1 - Mostrar información de las dos Circunferencias
2 - Calcular, Mostrar y Comparar las Áreas de las dos Circunferencias
3 - Calcular, Mostrar y Comparar las Longitudes de las dos Circunferencias
4 - Indicar si las dos circunferencias se intersectan
5 - Salir
 */
package circunferencia;
    
import static java.lang.Math.pow;
import java.util.Scanner;

public class Circunferencia {
    //atributos
    double coordenadaX=0;
    double coordenadaY=0;
    double radio=0;
    double Pi = 3.141592;
    
    //iniciamos el constructor
    public Circunferencia() {
        this.coordenadaX = 0;
        this.coordenadaY = 0;
    }

    //metodos modificadores y selectores
    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double Pi) {
        this.Pi = Pi;
    }
    
    //calcular longitud de la circunferencia
    public double Area(double rad){
        double areaC=0;
        areaC = getPi() * pow(getRadio(),2);//Pi x r^2
        return areaC;
    }
    
    //calcular area de la circunferencia
    public double Longitud(double rad){
        double LongC=0;
        LongC = 2 * getPi() * getRadio();//2 x Pi x r
        return LongC;
    }
    
    public void mostrarInfoCircunferencia(int Circf, double x, double y, double radio, double a, double l){
        String infoCirc="";
        infoCirc = "CIRCUNDERENCIA #"+Circf+": \nCoordenada X = "+x+" \nCoordenada Y = "+y+" \nRadio = "+radio+"\nArea = "+a+"\nLongitud = "+l;
        System.out.println(infoCirc);
    }
    
    //mostrar datos de la longirud
    public void mostrarLongitud(int circulo, double radL) {
        System.out.println("Longitud Circunferencia "+circulo+" = "+Longitud(radL));
    }
    
    //mostrar datos del area 
    public void mostrarArea(int circulo, double radA) {
        System.out.println("Area Circunferencia "+circulo+" = "+Area(radA));
    }
        
    //comparar area y longitud
    public void Comparar(double param1, double param2, String form){
        String mensaje="";
        if (param1 == 0 && param2 == 0) {
            mensaje="Datos vacios";
            System.out.println(mensaje);
        }
        if (param1 != param2) {
            mensaje = "Las " + form +" son diferentes";
            System.out.println(mensaje);
        }
        if (param1 == param2) {
            mensaje = "Las " + form +" son iguales";
            System.out.println(mensaje);
        }
    }
    
    //hallamos la distancia entre 2 circunferencias
    public double distanciaCirc(double x1, double y1, double x2, double y2){
        double distancia=0;
        distancia =  Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return distancia;
    }
    
    //validar interseccion entre ambas circunferencias
    public void validarInterseccion(double distancia, double radioT){
        if (radioT >= distancia) {
            System.out.println("Se Intersectan");
        }else {
            System.out.println("No Se Intersectan");
        }
    }
    
    public static void main(String[] args) {
        double A1=0, A2=0, L1=0, L2=0, r1=0, x1=0, y1=0, r2=0, x2=0, y2=0, radioTotal=0, distancia=0;
        int opc=0;
        Circunferencia circulo = new Circunferencia();
        // capturar informacion del usuario por teclado
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("CIRCUNDERENCIA #1:");
        //no hay que capturar mas coordenadas, pues estamos obteniendo el punto centro de ambas circunferencias
        System.out.print("Ingrese Coordenada X1: ");
        x1=teclado.nextDouble();
        circulo.setCoordenadaX(x1);
        System.out.print("Ingrese Coordenada Y1: ");
        y1=teclado.nextDouble();
        circulo.setCoordenadaY(y1);
        System.out.print("Ingrese Radio 1: ");
        r1=teclado.nextDouble();
        circulo.setRadio(r1);
        System.out.println("");
        System.out.println("CIRCUNDERENCIA #2:");
        System.out.print("Ingrese Coordenada X2: ");
        x2=teclado.nextDouble();
        circulo.setCoordenadaX(x2);
        System.out.print("Ingrese Coordenada Y2: ");
        y2=teclado.nextDouble();
        circulo.setCoordenadaY(y2);
        System.out.print("Ingrese Radio 2: ");
        r2=teclado.nextDouble();
        circulo.setRadio(r2);
        System.out.println("");
        A1 = circulo.Area(1);
        A2 = circulo.Area(r2);
        L1 = circulo.Longitud(r1);
        L2 = circulo.Longitud(r2);
        //armamos el Menu
        System.out.println("MENU:");
        System.out.println("1. Mostrar información de las dos Circunferencias");
        System.out.println("2. Calcular, Mostrar y Comparar las Áreas de las dos Circunferencias");
        System.out.println("3. Calcular, Mostrar y Comparar las Longitudes de las dos Circunferencias");
        System.out.println("4. Indicar si las dos circunferencias se intersectan");
        System.out.println("5. Salir\n");
        //validar opcion a elegir
        System.out.print("Ingrese opción elegida: ");
        opc = teclado.nextInt();
        System.out.println("");
        switch(opc){
            case 1:
                circulo.mostrarInfoCircunferencia(1, x1, y1, r1, A1, L1);
                System.out.println("");
                circulo.mostrarInfoCircunferencia(2, x2, y2, r2, A2, L2);
                break;
            case 2:
                circulo.mostrarArea(1, r1);
                circulo.mostrarArea(2, r2);
                circulo.Comparar(A1, A2, "Areas");
                break;
            case 3:
                circulo.mostrarLongitud(1, r1);
                circulo.mostrarLongitud(2, r2);
                circulo.Comparar(A1, A2, "Longitudes");
                break;
            case 4:
                distancia = circulo.distanciaCirc(x1, y1, x2, y2);
                radioTotal = r1 + r2;
                circulo.validarInterseccion(distancia, radioTotal);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }
        
    }
    
}
