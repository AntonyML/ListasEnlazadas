
package model.business;

/**
 *
 * @author Tony ML
 */
public class Estudiante {
    private int id;
    private String name;
    private boolean state;
    private String carrera;
    private int edad;

    public Estudiante(int id, String name, boolean state, String carrera, int edad) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.carrera = carrera;
        this.edad = edad;
    }

    
    public int compareTo(Estudiante otroEstudiante) {
        // Comparar por un atributo relevante para el ordenamiento, como el ID o el nombre
        // Supongamos que se compara por el ID
        return Integer.compare(this.getId(), otroEstudiante.getId());
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", name=" + name + ", state=" + state + ", carrera=" + carrera + ", edad=" + edad + '}';
    }
    
    
}
