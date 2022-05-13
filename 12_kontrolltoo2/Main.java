package KT2;

//* Lisa geenile käsklus juhusliku alleeli väljastamiseks.
// Koosta funktsioon kahe geeni ühinemisel tekkivast uuest geenist, kus kummastki algsest geenist võeti juhuslik alleel.
// Koosta klass, kuhu sisestatakse alleeli nimetus ning kummagi vanema alleelide +/- väärtused. Väljastatakse lapsel tekkinud geen ning salvestatakse see faili.
//* Kasutaja saab otsida geeni nimetuse järgi.
// Kasutaja saab valida, millised kuvatud geeniga inimesed omavahel järglase saavad ning järglasel tekkinud vastav geen talletatakse samuti faili.


import java.io.*;

public class Main{
    public static void main(String[] arg)throws IOException{
        Alleel a1=new Alleel("Reesus =","-");
        Alleel a2=new Alleel("Reesus =","+");
        Alleel a3=new Alleel("Reesus =","-");
        Alleel a4=new Alleel("Reesus =","-");
        Geen g1=new Geen(a1,a2);
        Geen g2=new Geen(a3,a4);
        Geen uusGeen=g1.looUusGeen(g1,g2);
        g1.lapseGeen(a1,a4);
        if(g1.error==false){
            System.out.println("Uus geen = " + g1.looGeen());
        }
        else{
            System.out.println("Erinevad alleelid");
        }
        g1.valiSuvalineAlleel();
        System.out.println("Suvaline geen = " + uusGeen.posneg);
    }


}
