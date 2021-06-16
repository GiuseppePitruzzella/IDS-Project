package ids;

import java.util.ArrayList;
import java.util.List;

public class Dipartimento implements Dipendente {
    private List<Dipendente> listaDipendenti = new ArrayList<Dipendente>();
    /**
     * Il metodo aggiungiDettagli() ha il compito di aggiungere
     * un elemento semplice all'interno di una lista; ciò permetterà
     * la loro gestione.
     * Si noti che il seguente metodo, insieme al suo speculare, sono stati
     * definiti esclusivamente all'interno di Composite, favorendo la sicurezza.
     */
    public void aggiungiDipendente(Dipendente D) {
        listaDipendenti.add(D);
    }
    /**
     * Il metodo aggiungiDettagli() ha il compito di rimuovere
     * un elemento semplice all'interno di una lista; 
     */
    public void rimuoviDipendente(Dipendente D) {
        listaDipendenti.remove(D);
    }
    /**
     * Il metodo getDettagli() ha il compito di stampare
     * a video le informazioni principali rispetto ogni
     * Dipendente di un certo Dipartimento.
     * @implNote Potrebbe non essere corretto.
     */
    @Override
    public void getDettagli() {
        listaDipendenti.stream().forEach(e -> e.getDettagli());
    }
    /**
     * Il metodo getStipendio() ha il compito di ritornare la somma
     * degli stipendi rispetto ogni Dipendente di un certo Dipartimento.
     */
    @Override
    public float getStipendio() {
        return listaDipendenti.stream().map(e -> e.getStipendio()).reduce(0f, Float::sum);
    }
}
