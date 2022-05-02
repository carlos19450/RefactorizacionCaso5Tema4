/*
 * Paso 1: Organizar el siguiente código en un proyecto Java.
 * Paso 2: Dar formato al código.
 * Paso 3: Subir el proyecto a GitHub.
 * Paso 4: Documentar para Javadoc.
 * Paso 5: Refactorizar.
 */
package refactorizacioncaso5tema4finalizadoo;

public class Assignatura {

    private long id = 0;
    private String nom = "";
    private int hores = 0;
    private int credits = 0;
    private boolean disponible = false;

    /**
     * Contructor con atributos.
     * @param id Atributo de tipo long.
     * @param nom Atributo de tipo String.
     * @param hores Atributo de tipo int.
     * @param credits Atributo de tipo int.
     * @param disponible Atributo de tipo boolean
     */
    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    /**
     * Metodo para mostrar los datos de la Assignatura.
     * @return retorna los datos de la Asiggnatura.
     */
    public String toString() {
        return "ID: " + id + "\n"
             + "Nombre: "+ nom +"\n"
             + "Horas: "+ hores +"\n"
             + "Creditos: "+ credits +"\n"
             + "Disponible? "+ disponible +"\n";
    }
}

