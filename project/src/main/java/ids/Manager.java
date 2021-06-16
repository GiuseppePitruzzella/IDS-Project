package ids;

public class Manager implements Dipendente {
    private String nome;
    private float stipendio;
    public Manager(String nome, float stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }
    /**
     * Il metodo getDettagli() ha il compito di stampare
     * a video le informazioni principali rispetto ogni
     * Dipendente di un certo Dipartimento.
     */
    @Override
    public void getDettagli() {
        System.out.println("\t 💸 Manager = " + nome);
    }
    /**
     * Il metodo getStipendio() ha il compito di ritornare la somma
     * degli stipendi rispetto ogni Dipendente di un certo Dipartimento.
     */
    @Override
    public float getStipendio() {
        return stipendio + ((stipendio * targetBonus()) / 100);
    }
    /**
     * Il metodo targetBonus() ha il compito di ritornare
     * il bonus assegnato in base all'insieme a cui il
     * dipendente fa parte. E' utile al calcolo dello stipendio totale.
     * @return Bonus
     */
    private int targetBonus() {
        return 20;
    }
}
