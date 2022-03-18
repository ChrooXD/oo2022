package isikukood;

import kujundid.Kolmnurk;
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

    }

    @Test
    public void kontrolli_kas_on_synniaasta_1951_kui_isikukoodi_keskel_on_51() {
        IsikukoodLV lv = new IsikukoodLV("120388-51237");
        assertEquals(1988,lv.getBirthYear());

    }

    @Test
    public void kontrolli_kas_kujundi_pindala_arvutatakse_korrektselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18.0,kolmnurk.arvutaYmbermoot(), 0.1);

    }
}
