package ejercicio;

public class ejercicio_tema3 {
public static void main(String[] args) {
    
    String nombre0 = "";
    String[] nombres = {"Hola ", "mi ", "Nombre ", "es ","Java "};
    for (String nombre : nombres) {
        nombre0 = nombre0 + nombre;
        System.out.println(nombre0);
    }
}
}
