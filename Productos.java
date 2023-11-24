public class Productos {
    private String nombre;
    private String codigo;
    private String fechaCaducidad;
    private String fechaCompra;
    private double precio;
    private int cantidadProducto ;

    public Productos(String nombre, String codigo, String fechaCaducidad, String fechaCompra, double precio, int cantidadProducto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


}
