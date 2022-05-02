/*
 * Paso 1: Organizar el siguiente código en un proyecto Java.
 * Paso 2: Dar formato al código.
 * Paso 3: Subir el proyecto a GitHub.
 * Paso 4: Documentar para Javadoc.
 * Paso 5: Refactorizar.
 */
package refactorizacioncaso5tema4finalizadoo;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Collection;
import java.util.Iterator;

public class Matricula {

    private static final int COSTE_CREDITOS = 15;

    private long id = 0;
    private int curs = 0;
    private Collection assignatures;
    private Estudiante alumno1;

    /**
     * Contructor.
     */
    public Matricula() {
    }

    /**
     * Constructor con atributos.
     *
     * @param id atributo de tipo long.
     * @param curs atributo de tipo int.
     * @param assignatures atributo de tipo Collection.
     */
    public Matricula(long id, int curs, Estudiante alumno1, Collection assignatures) {
        this.id = id;
        this.curs = curs;
        this.assignatures = assignatures;
        this.alumno1 = alumno1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public Collection getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(Collection assignatures) {
        this.assignatures = assignatures;
    }

    public Estudiante getAlumno1() {
        return alumno1;
    }

    public void setAlumno1(Estudiante alumno1) {
        this.alumno1 = alumno1;
    }

    /**
     * Metodo para mostrar el coste de la matricula.
     *
     * @return Acumulador de tipo float que retorna el coste de la matricula
     */
    public float costMatricula() {
        float cost = 0;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.getCredits();
        }

        cost = credits * COSTE_CREDITOS;
        return cost;
    }
}
