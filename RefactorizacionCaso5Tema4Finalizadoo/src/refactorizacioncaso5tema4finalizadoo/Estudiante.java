/*
 * Paso 1: Organizar el siguiente código en un proyecto Java.
 * Paso 2: Dar formato al código.
 * Paso 3: Subir el proyecto a GitHub.
 * Paso 4: Documentar para Javadoc.
 * Paso 5: Refactorizar.
 */
package refactorizacioncaso5tema4finalizadoo;

/**
 *
 * @author carpui
 */
public class Estudiante {

    private long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";

    /**
     * Construcot con atributos.
     *
     * @param nom Atributo de tipo String.
     * @param cognoms Atributo de tipo String.
     * @param dni Atributo de tipo String.
     */
    public Estudiante(long id, String nom, String cognoms, String dni) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Metodo toString para mostrar los datos de Estudiante.
     *
     * @return Retorna los datos del estudiante.
     */
    public String toString() {
        return "ID: " + id + "\n"
                + "Nombre del estudiante: " + nom + "\n"
                + "Apellidos del estudiante: " + cognoms + "\n"
                + "DNI: " + dni + "\n";
    }
}
