package colas;

public class Metodos {

    int numE = 0;
    Object cola[] = new Object[10];
    int bola = 0;

    public void push(String x) {
        if (bola < 10) {
            cola[bola] = x;
            bola++;

        }
    }
    public void Pop(){
        if(bola>0){
            cola[0] = null;
            for(int z=1;z<bola;z++)
                cola[z-1]=cola[z];
        }
        bola--;
    }
    public String VerCola(){
        String v="";
        if(bola==0){
            v="Elemento:";
            
        }
        else{
            for(int o=0;o<bola;o++)
                v+=("Elemento:"+(o+1)+" "+cola[o]+"\n");
        }
        return v;
    }
    public String Elementos(){
        String elementos ="";
        elementos = (""+bola);
        return elementos;
    }
    public String EstaLlena(){
        String llena="";
        if(bola==0){
            llena="Vacia";
        }
        else{
            llena="No esta llena";
        }
        return llena;
    }
    public String EstaVacia(){
        String vacia="";
        if(bola==10){
            vacia="Vacia";
        }
        else{
            vacia=" No esta Vacia";
        }
        return vacia;
    }
    public String Primero(){
        String pri="";
        if(cola[0]!=null){
            pri=(""+cola[0]);
        }
        else{
            pri=(" No hay Elementos");
        }
        return pri;
    }
     public String Ultimo(){
        String ul="";
        if(cola[0]!=null){
            ul=(""+cola[bola-1]);
        }
        else{
            ul=(" No hay Elementos");
        }
        return ul;
    }
     public void VaciarCola(){
         for(int t=bola-1;t>=0;t--)
             cola[t]=null;
         bola=0;
     }
}
