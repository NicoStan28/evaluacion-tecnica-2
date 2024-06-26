package src.main.java.com.pil.moby.evaluacion_tecnica.pojo;

import java.util.Objects;

public class Tecnologia {

    private long id;
    private String nombre;

    public Tecnologia(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tecnologia that = (Tecnologia) o;
        return id == that.id && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "Tecnologia{" +
                "id = " + id +
                ", nombre = " + nombre + '\'' +
                '}';
    }
}
