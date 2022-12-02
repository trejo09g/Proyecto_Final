 /*
-
 */
package solucion;

public class vector {
    
    int longitud;
    int[] arreglo;
    int[] arrtemp;
    //Get y Set solo para mostrar o modificar el los valores
    //Longitud
    public int getlongitud(){
        return longitud;
    }
    public void setlongitud(int longitud){
        this.longitud = longitud; //this para hacer referencia al metodo o propiedad del objeto actual 
    }
    //Arreglo
    public int[] getArreglo(){
        return arreglo;
    }
    public void setArreglo(int[] arreglo){
        this.arreglo = arreglo;
    }
    //Constructores
    public vector()
    {
        this.longitud = 0;
        this.arreglo = null;
    }
    
    public vector(int l)
    {
       this.longitud=1;
       this.arreglo= new int [this.longitud];
    }
    
    public void inicializarvector(){
    if (this.arreglo == null){
        this.arreglo = new int[this.longitud];
    }
    
}
    public void insertar (int pos, int val)
    {
        if (this.arreglo != null){
            this.arreglo[pos] = val;
        }
    }
    
    public String imprimir ()
    {
        String datos = "";
        for(int i=0 ; i<longitud;i++)
        {
           datos = datos + " " + String.valueOf(arreglo[i]);
        }
        return datos;
    }
    public String imprimir(int[] arreglo)
    {
        String datos = " ";
        for (int i=0; i<arreglo.length;i++)
        {
            datos = datos + " " + String.valueOf(arreglo[i]);
        }
        return datos;
    }
    //Algoritmo de ordenamiento 
    //Metodo: QuickSort
    /*
    Se divide el arreglo en tres partes 
    -Se eligue un numero pivote del arreglo
    -La primer parte contiene todos los elementos del arreglo excecto el pivote que sean menores o iguales al pivote
    -La otra parte que contiene al pivote 
    -Y la ultima parte que contiene todos los elementos del arreglo exepto el pivote que sean mayores o iguales al pivote 
    */
    
    public int [] quicksort (int[] arreglo, int primero, int ultimo)
    {
        int i,j,pivote,auxiliar;
        
        i=primero;
        j=ultimo;
        pivote= arreglo[(primero+ultimo)/2];
        do{
            while(arreglo[i]<pivote){
                i++;
            }
            while(arreglo[j]>pivote){
                j--;
            }
            //para hacer el intercambio
            if(i<=j)
            {
                auxiliar=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=auxiliar;
                i++;
                j++;
            }
        //Aplicando recursividad 
        }while(i<=j);
        if(primero<j){
            this.quicksort(arreglo,primero,j);
        }
        if(i<ultimo){
            this.quicksort(arreglo,i,ultimo);
        }
        return arreglo;
    }
    //Algoritmo de ordenamiento 
    //Metodo: MergeSort
    /*
    Se divide en mitades de arreglo 
    -Se utiliza el metodo mege sort para la primera mitad 
    -Se utiliza el metodo mege sort para la segunda mitad 
    =se combinan las dos mitades ordenadas
    el arreglo se va a dividir recursivamente en mitades hasta ser del tamaño de 1
    */
    
    //metodo merge sort para implementado en todo el arreglo 
    public void mergesort(int[] arrordenado)
    {
        this.arreglo=arrordenado;
        this.longitud=arrordenado.length;
        this.arrtemp=new int [longitud];
        Merge_Sort(0,longitud-1);
    }
    //metodo para combinar las dos mitades ordenadas
    private void Merge_Sort(int primero,int ultimo)
    {
        if(primero<ultimo){
        int med= primero+(ultimo-primero)/2;
        Merge_Sort(primero,med);
        Merge_Sort(med+1,ultimo);
        Merge(primero,med,ultimo);  
        }
       }
    //metodo para dividir y realizar el ordenamiento de las mitades 
    private void Merge(int primero,int med,int ultimo){
        for(int i=primero;i<=ultimo;i++)
        {
            arrtemp[i]=arreglo[i];
        }
        
        int i=primero;
        int j=med+1;
        int k=primero;
        
        while(i<=med && j<=ultimo)
        {
            if(arrtemp[i]<= arrtemp[j])
            {
                arreglo[k]=arrtemp[i];
                i++;
            }
            else
            {
                arreglo[k]=arrtemp[j];
                j++;
            }
            k++;
        }
        while (i<=med)
        {
            arreglo[k]=arrtemp[i];
            i++;
            k++;
        }
    }
    //Algoritmo de Busqueda
    //Busqueda secuencial
    /*
    Comenzando por el primer valor de la lista,simplemente se traslada de un valor a otro hasta siguiendo el orden secuencial
    hasta que se encuentre lo que se buscaba 
    */
    public String busquedasecuencial (int dato)
    {
        String datos=" ";
        if (this.longitud>0){
            for (int i=0; i<this.longitud ; i++){
                if (this.arreglo[i]==dato){
                    datos = datos + "Posición: " + i + "\n";
                }
            }
        }
        if(datos.length()==0){
            return "No se encontró el dato: " + dato + " en el vector ";
        }
        else
        {
            return datos;
        }
    }
    //Algoritmo de busqueda
    //Busqueda binaria
    /*
    La búsqueda binaria solo funciona en arreglos ordenados
    La búsqueda binaria comienza por comparar el elemento del medio arreglo con el valor buscado.
    Si el valor buscado es igual al elemento del medio su posicion del arreglo es retornada.
    Si el valor buscado es menor o mayor que el elemento del medio, la búsqueda continua en la primera o segunda mitad, 
    respectivamente dejando la otra mitad fuera de consideración f
    */
    public int busquedabinaria(int[] arreglo,int dato){
        int centro,primero,ultimo,valorcentro;
        
        primero=0;
        ultimo=arreglo.length;
        
        while(primero<=ultimo){
            
            centro=(primero+ultimo)/2;
            valorcentro=arreglo[centro];
            
            if(dato==valorcentro){
                return centro;
                
            }else if(dato<valorcentro){
                ultimo=centro-1;//desplazo hacia la izquierda 
            }else{
                primero=centro+1;//desplazo hacia la derecha 
            }
        }
        return -1;
    }
    /*
    Metodo para comprobar si el dato ingresado es letra o número resibe un string y lo intenta convertir en double, si lo logra 
    devuelve un true por lo tanto es un número, caso contrario con una letra 
    */
    public boolean esnumero(String cadena){
        try{
            Double.parseDouble(cadena);
            return true;
        } catch(NumberFormatException nfe){
            return false;
        }
    }
}
