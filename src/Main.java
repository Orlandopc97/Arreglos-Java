public class Main {
    public static void main(String[] args) {

        //Arreglos : Estructuras de datos que tienen varios valores del mismo tipo y se utiliza el mismo nombre del arreglo
        //arreglo int, arreglo char, ect
        //Estos valores se distribuyen secuencialmenete en la memoria
        //Se puede acceder a ellos a travez de un indice
        // LOS ARREGLOS SON TAMBIEN LLAMADOS VECTORES O MATRICES

        //DATO: Los indices en java se inician por 0 y no por 1

        //int[] numeros  = new int[5]; // se puede inicializar asi el arreglo
        //int i = 0;

        //tambien se puede inicializar asi

        //tipodato
              //nombre variable
                //indice  0  1 2  3  4
        int[] numeros  = {10,20,30,40,50};

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        //- Aqui tiene el indice para poder manipularlo que en el foreach no

        numeros[2] = 70; // cambio de valor en indice 2
        for (int i = 0; i < numeros.length ; i++) { //length de arreglo va sin parentesis funcion de un arreglo
            System.out.println(numeros[i]);
        }

        //aqui el lenght llava parentesis por que es una funcion
        String palabra = "canserbero";
        System.out.println("la palabra canserbero tiene " + palabra.length() + " letras");

        int indice = 0;
        //forEach int
            //elemento de arreglo
        for (int variableeach: numeros){ //no tiene indice
            System.out.println(variableeach);
            System.out.println(indice);
            indice++;
        }



        //for each string

        String[] nombres =  {"Alondra",  "Javier", "Saul", "Ramon"};

        for ( String aveztruz: nombres){
            System.out.println(aveztruz);
        }

        //Recorrer arreglo con while

        while (i < numeros.length){
            //for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);

            i++;
        }

        //System.out.println(arreglo); // direccion de memoria que utilizara

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);// le asigna el valor cero por default
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

        System.out.println(numeros.length);// largo o longitud del arreglo




    }

}