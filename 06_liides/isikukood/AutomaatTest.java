package isikukood;

import kujundid.Kolmnurk;
<<<<<<< HEAD
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {
// alt + enter --> classpath 4 / 5.8

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("4513112313");
        assertEquals(false,ee.isMale());
=======
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//alt + enter --> classpath 4 / 5.8
// junit download
// maven repository --> kõige uuem -> jar download > insert into package

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("451332313");
        assertEquals(false,ee.isMale());

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }

    @Test
    public void kontrolli_kas_on_synniaasta_1951_kui_isikukoodi_keskel_on_51() {
<<<<<<< HEAD
        IsikukoodLV lv = new IsikukoodLV("120351-51237");
        assertEquals(1951,lv.getBirthYear());
    }

    @Test
    public void kontrolli_kas_kujundi_ymbermoot_arvutatakse_korretselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18,kolmnurk.arvutaYmbermoot(),0.1);
=======
        IsikukoodLV lv = new IsikukoodLV("120388-51237");
        assertEquals(1988,lv.getBirthYear());

    }

    @Test
    public void kontrolli_kas_kujundi_pindala_arvutatakse_korrektselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18.0,kolmnurk.arvutaYmbermoot(), 0.1);

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }
}
