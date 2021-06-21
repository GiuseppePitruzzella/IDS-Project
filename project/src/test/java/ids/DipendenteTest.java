package ids;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
class DipendenteTest {
    Dipendente Sviluppo = new Dipartimento("Dipartimento di Sviluppo");
    Dipendente A = new Sviluppatore("Martin Fowler", 1000);
    Dipendente B = new Sviluppatore("Robert Martin", 1000);
    @BeforeEach
    public void reset() {
        Sviluppo.aggiungiDipendente(A);
        Sviluppo.aggiungiDipendente(B);
    }

    @Test
    public void testLeafStipendio() {
        assertEquals(A.getStipendio(), 1100);
    }
    @Test
    public void testCompositeStipendio() {
        assertEquals(Sviluppo.getStipendio(), 2200);
    }
}
