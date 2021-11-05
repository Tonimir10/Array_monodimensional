package com.company;

public class Main {

    public static void main(String[] args) {

        int [] array ={6,4,10,3,7};

            imprimirArray(array);
            valorMayor(array);
            valorMenor(array);
            calcularMedia(array);
            //ordenarBurbuja(array);
            //ordenarSeleccion(array);
           ordenarInserccion(array);
            buscarBinario(array,10);
           //buscarSecuencial(array,7);

    }

    private static int buscarSecuencial(int[] array, int dato) {
        int longitud = array.length;
        int pos = -1;
        for (int i = 0; (i < longitud)&&(pos==-1); i++) {
            if (array[i] == dato){
                pos=i;
            }
        }
        System.out.println("el elemento se encuentra en la posicion : "+(pos));
        return pos;
    }

    private static int buscarBinario(int[] array, int buscado) {

        int izq = 0;
        int der = array.length-1;
        int centro =(izq+der)/2;

        while ((izq<=der) && (array[centro] != buscado)){
            if(buscado<array[centro]){
                der = centro -1;
            } else {
                izq = centro+1;
                centro = (izq+der)/2;
            }
        }
        if (izq>der){
            System.out.println("No se encuentra en el array");
            return -1;
        } else {
            System.out.println("El elemnto se encuentra en la posición  en busqueda binaria: "+centro);
            return centro;
        }
    }

    private static void ordenarInserccion(int[] array) {
        int j;
        int aux;
        int TAM = array.length;

        for (int i = 1; i < TAM; i++) {
            aux=array[i];
            j = i-1;
            while((j >=0)&& (aux < array[j])){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = aux;
            System.out.println("La ordenación por insercción sería: ");
            imprimirArray(array);
        }

    }

    private static void ordenarSeleccion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int posMin = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[posMin]){
                    posMin = j;
                }
            }
            int tmp = array[i];
            array[i] = array[posMin];
            array[posMin]=tmp;
        }
        System.out.println("La ordenación por Selección sería: ");
        imprimirArray(array);
    }

    private static void ordenarBurbuja(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("El array ordenado por el método de la burbuja");
        imprimirArray(array);
    }


    public static void imprimirArray(int [] array){

        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }




    }

    public static void valorMayor(int[] vector){

        int numeroMax;
        numeroMax = vector[0];
            for (int i=0; i< vector.length;i++){
                if(vector[i]>numeroMax){
                    numeroMax=vector[i];
                }
            }
        System.out.println("El numero maximo es: " + numeroMax);
    }


    public static void valorMenor(int[] vector){

        int numeroMin;
        numeroMin = vector[0];
        for (int i=0; i< vector.length;i++){
            if(vector[i]<numeroMin){
                numeroMin=vector[i];
            }
        }
        System.out.println("El numero minimo es: " + numeroMin);
    }


    public static void calcularMedia(int[] vector){

        int acumulador = 0;
        for (int i =0; i< vector.length;i++){
            acumulador= acumulador+vector[i];

        }

        System.out.println("El acumulado es: "+acumulador);
        int media = acumulador/ vector.length;
        System.out.println("La media del array es: "+media);

    }


}
