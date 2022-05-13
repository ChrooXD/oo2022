package KT2;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeeniTest {

    @Test
    public void geeniTestPos() {
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("reesus","+");
        Geen g1=new Geen(a1,a2);
        assertEquals(true, g1.looGeen());
    }

    @Test
    public void geeniTestNeg() {
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("reesus","-");
        Geen g1=new Geen(a1,a2);
        assertEquals(false, g1.looGeen());
    }

    @Test
    public void geeniTestNimi() {
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("reesus","+");
        Geen g1=new Geen(a1,a2);
        assertEquals(false, g1.error);
    }
}

