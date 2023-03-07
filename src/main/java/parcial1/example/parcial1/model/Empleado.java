package parcial1.example.parcial1.model;

public class Empleado {

    @NotEmpty
    private int id;

    @NotEmpty
    @Size(min = 3, max = 8)
    private String nombre;

    @NotEmpty
    @Size(min = 3, max = 8)
    private String apellido;

    @NotEmpty
    @Email
    private String correo;

    @NotEmpty
    private String direccion;

    @NotEmpty
    private Long telefono;

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
}
