package practica11.manueldemendoza;

public class Deportista extends Persona {
    private float peso;
    private float estatura;

    // Constructor
    public Deportista(int id, String nombre, float sueldo, float peso, float estatura) {
        super(id, nombre, sueldo);
        this.peso = peso;
        this.estatura = estatura;
    }

    // Getters and Setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
        // toString method
    @Override
    public String toString() {
        return "Deportista{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", sueldo=" + getSueldo() +
                ", peso=" + peso +
                ", estatura=" + estatura +
                '}';
    }
}
