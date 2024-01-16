package org.example.chapter3;

public class Example {
    public static void main(String[] args) {
    /*
        Los corchetes se pueden colocar de dos formas:
            • A continuación del tipo de datos.
            • A continuación del nombre del array.
        Así, la sintaxis de declaración de variables array en Java es:
        tipo [] identificador;
        tipo identificador[];
        El primer formato indica que todos los identificadores son arrays del tipo. En el segundo formato, array es sólo el identificador al que le siguen los [].
     */
        //Ejemplo
        char cad[], p;
        //cad es un array de tipo char. p es una variable de tipo char.
        int [] v, w;
        //tanto v como w son declarados arrays unidimensionales de tipo int.
        //Sin embargo falta inicializarlo
        cad = new char[12];  //Array de tipo char con 12 elementos

    }
}
