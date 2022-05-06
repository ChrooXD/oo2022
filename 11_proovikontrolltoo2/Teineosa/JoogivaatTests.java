package Teineosa;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

public class JoogivaatTests {

    @Test
    public void t2idapPudelKuiSaab() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);

        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        boolean isT2idetud = joogivaat.t2idaJoogipudel(joogiPudel);
        assertTrue(isT2idetud);
    }

    @Test
    public void t2idaPudelKuiSaab() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);

        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        boolean isT2idetud = joogivaat.t2idaJoogipudel(joogiPudel);
        assertFalse(isT2idetud);

    }

    @Test
    public void villidaSaabNull() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);

        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        boolean pudeliteArv = joogivaat.t2idaJoogipudel(joogiPudel);
        assertEquals(0, pudeliteArv);
    }

    @Test
    public void villidaSaab() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);

        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        boolean isT2idetud = joogivaat.t2idaJoogipudel(joogiPudel);
        assertFalse(isT2idetud);

    }
}
