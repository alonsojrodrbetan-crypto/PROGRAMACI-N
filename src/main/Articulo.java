//Clase Articulo
//Representa un articulo que se puede añadir a un pedido del
//restaurante

public class Articulo {

//Nombre del articulo (Pizza, Refresco etc...)
    private String nombre;
    private String descripcion;

//Cantidad de unidades    
    private int cantidad;

//Precio de cada unidad    
    private double precioUnitario; 

    
//Constructor de la clase
//Utilizado para crear articulos con datos basicos    
    
    public Articulo(String nombre, String descripcion, int cantidad,
                    double precioUnitario, int tiempoPreparacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.tiempoPreparacion = tiempoPreparacion;
    }

//Subtotal del articulo que se calcula multiplicando la cantidad 
// por el precio de unidad
    public double getSubtotal() {
        return cantidad * precioUnitario;
    }
} 