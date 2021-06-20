package ids;

import java.util.ArrayList;
import java.util.List;

public class Dipartimento extends Dipendente {
    private List<Dipendente> listaDipendenti = new ArrayList<Dipendente>();
    private String nomeDipartimento;
    public Dipartimento(String nomeDipartimento) {
        this.nomeDipartimento = nomeDipartimento;
    }

    @Override
    public void aggiungiDipendente(Dipendente D) {
        listaDipendenti.add(D);
    }

    @Override
    public void rimuoviDipendente(Dipendente D) {
        listaDipendenti.remove(D);
    }
    /**
     * Il metodo displayDettagli() ha il compito di stampare
     * a video le informazioni principali rispetto ogni
     * Dipendente di un certo Dipartimento.
     */
    @Override
    public void displayDettagli() {
        System.out.println("\u27a6 " + nomeDipartimento + " ( " + getStipendio() + " )");
        listaDipendenti.stream().forEach(e -> e.displayDettagli());
    }
    /**
     * Il metodo getStipendio() ha il compito di ritornare la somma
     * degli stipendi rispetto ogni Dipendente di un certo Dipartimento.
     * @return Stipendio per dipartimento
     */
    @Override
    public float getStipendio() {
        return listaDipendenti.stream().map(e -> e.getStipendio()).reduce(0f, Float::sum);
    }
}
