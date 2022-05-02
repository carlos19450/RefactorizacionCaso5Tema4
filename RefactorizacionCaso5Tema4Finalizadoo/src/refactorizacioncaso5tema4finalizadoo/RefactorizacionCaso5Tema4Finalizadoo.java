/*
 * Paso 1: Organizar el siguiente código en un proyecto Java.
 * Paso 2: Dar formato al código.
 * Paso 3: Subir el proyecto a GitHub.
 * Paso 4: Documentar para Javadoc.
 * Paso 5: Refactorizar.
 */
package refactorizacioncaso5tema4finalizadoo;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author carpui
 */
public class RefactorizacionCaso5Tema4Finalizadoo {

    public static void main(String[] args) {

//MatriculaDB matriculaDB = new MatriculaDB();
//Matricula matricula = matriculaDB.getMatricula(2);
// TODO: pasar parámetros al contructor de Matricula
        ArrayList listaAsignaturas = new ArrayList();
        Estudiante alumno1 = new Estudiante(4235, "Pepe", "Roberto", "20463856G");
        Assignatura asig1 = new Assignatura(4321, "Programacion", 8, 2, true);
        Assignatura asig2 = new Assignatura(4444, "Entornos", 4, 1, true);
        listaAsignaturas.add(asig1);
        listaAsignaturas.add(asig2);
        Matricula matricula1 = new Matricula(1234, 2, alumno1, listaAsignaturas);

        System.out.println(alumno1.toString());
        System.out.print("Cost de la matricula " + matricula1.costMatricula() + "\n");
    }
}
