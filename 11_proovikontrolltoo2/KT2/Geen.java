package KT2;

import java.io.*;

public class Geen{
    Alleel a1;
    Alleel a2;
    boolean posneg;
    boolean error=false;
    int suvalineAlleel;
    Alleel valitudAlleel;
    Geen uusGeen;
    Geen lapseGeen;
    Alleel lapseAlleel;

    public Geen(Alleel a1,Alleel a2){
        if(a1.name.equals(a2.name)){
            this.a1=a1;
            this.a2=a2;
        }
        else{
            boolean error=true;
        }
    }

    public boolean looGeen(){

        if(a1.posneg==true||a2.posneg==true){
            posneg=true;
        }
        else{
            posneg=false;
        }

        return posneg;
    }

    public Alleel valiSuvalineAlleel(){
        suvalineAlleel =(int)(Math.random()*2);
        if(suvalineAlleel ==0){
            System.out.println(a1.name+" "+a1.posneg);
            valitudAlleel =a1;
        }
        else if(suvalineAlleel ==1){
            System.out.println(a2.name+" "+a2.posneg);
            valitudAlleel =a2;
        }
        return valitudAlleel;
    }

    public Geen looUusGeen(Geen g1, Geen g2){
        uusGeen=new Geen(g1.valiSuvalineAlleel(),g2.valiSuvalineAlleel());
        return uusGeen;
    }

    public Geen lapseGeen(Alleel emaAlleel, Alleel isaAlleel)throws IOException{
        lapseAlleel=emaAlleel;
        lapseGeen=new Geen(emaAlleel,isaAlleel);
        PrintWriter pw1=new PrintWriter(
                new FileWriter("geenid.txt")
        );
        pw1.println("lapse " + lapseAlleel.name+" "+lapseGeen.posneg);
        pw1.close();
        return lapseGeen;
    }

}