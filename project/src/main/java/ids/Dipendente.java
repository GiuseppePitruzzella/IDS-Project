package ids;

/**
 * Dipendente svolge il ruolo di Component
 * all'interno del patter Composite.
 * I metodi definiti al suo interno verranno implementati 
 * dalle classi che implementano l'interfaccia.
 */
public abstract class Dipendente {
    /**
     * Il metodo aggiungiDettagli() ha il compito di aggiungere
     * un elemento semplice all'interno di una lista; ciò permetterà
     * la loro gestione.
     * Si noti che il seguente metodo, insieme al suo speculare, forniscono un
     * implementazione base per chi non farà Override dei metodi, ovvero le leaf,
     * le quali non avranno bisogno di quest'ultimi metodi.
     * Se chiamati a partire da una Leaf, sarà generata un exception.
     */
    public void aggiungiDipendente(Dipendente D) {
        throw new UnsupportedOperationException();
    }
    /**
     * Il metodo rimuoviDipendente() ha il compito di rimuovere
     * un elemento semplice all'interno di una lista; ciò permetterà
     * la loro gestione.
     * Si noti che il seguente metodo, insieme al suo speculare, forniscono un
     * implementazione base per chi non farà Override dei metodi, ovvero le leaf,
     * le quali non avranno bisogno di quest'ultimi metodi.
     * Se chiamati a partire da una Leaf, sarà generata un exception.
     */
    public void rimuoviDipendente(Dipendente D) {
        throw new UnsupportedOperationException();
    }
    abstract void displayDettagli();
    abstract float getStipendio();
}
