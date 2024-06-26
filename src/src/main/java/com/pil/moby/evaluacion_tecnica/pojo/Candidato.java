package src.main.java.com.pil.moby.evaluacion_tecnica.pojo;

import java.util.List;
import java.util.Objects;

public class Candidato {

    private long id;
    private String nombre;
    private String apellido;
    private int aniosExperiencia;
    private double salario;
    private List <Tecnologia> tecnologias;

    public Candidato(long id, String nombre, String apellido, int aniosExperiencia, double salario, List tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.salario = salario;
        this.tecnologias = tecnologias;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return id == candidato.id && aniosExperiencia == candidato.aniosExperiencia && Double.compare(salario, candidato.salario) == 0 && Objects.equals(nombre, candidato.nombre) && Objects.equals(apellido, candidato.apellido) && Objects.equals(tecnologias, candidato.tecnologias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, aniosExperiencia, salario, tecnologias);
    }

    @Override
    public String toString() {
        return "Candidato{" +
                ", nombre = " + nombre + '\'' +
                ", apellido = " + apellido + '\'' +
                ", aniosExperiencia = " + aniosExperiencia +
                ", salario = " + salario +
                ", tecnologias = " + tecnologias +
                '}';
    }


}
