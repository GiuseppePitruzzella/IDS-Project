package ids;

public class Designer extends Dipendente {
    private String nome;
    private float stipendio;
    public Designer(String nome, float stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }
    /**
     * Il metodo displayDettagli() ha il compito di stampare
     * a video le informazioni principali rispetto il dipendente
     */
    @Override
    public void displayDettagli() {
        System.out.println("| \t | 🎨 Designer = " + nome);
    }
    /**
     * Il metodo getStipendio() ha il compito di ritornare lo stipendio
     * rispetto un Dipendente dell'azienda
     */
    @Override
    public float getStipendio() {
        return stipendio + ((stipendio * targetBonus()) / 100);
    }
    /**
     * Il metodo targetBonus() ha il compito di ritornare
     * il bonus assegnato in base all'insieme in cui il
     * dipendente rientra. E' utile al calcolo dello stipendio totale.
     * @return Bonus
     */
    private int targetBonus() {
        return 5;
    }
}
