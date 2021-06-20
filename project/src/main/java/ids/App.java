package ids;

public final class App {
    private App() {}
    public static void main(String[] args) {
        Dipendente Sviluppo = new Dipartimento("Dipartimento di Ricerca e Sviluppo");
        Dipendente Maps = new Dipartimento("Google Maps Division");
        Dipendente Sales = new Dipartimento("Reparto vendite");
        Dipendente managerSviluppo = new Manager("Emiliano Tramontana", 2000);
        Dipendente frontendDev = new Sviluppatore("Giuseppe Pitruzzella", 1500);
        Dipendente backendDev = new Sviluppatore("Giuseppe Vitale", 1300);
        Sviluppo.aggiungiDipendente(frontendDev);
        Sviluppo.aggiungiDipendente(backendDev);
        Sviluppo.aggiungiDipendente(Maps);
        Maps.aggiungiDipendente(Sales);
        Sales.aggiungiDipendente(managerSviluppo);
        Sviluppo.displayDettagli();
        System.out.println("\n");
        Sales.displayDettagli();
        /**
         * TODO
         * Trasformare il metodo getSalary in void (come getDetails)?
         */
        System.out.println(Sviluppo.getStipendio());
        System.out.println(managerSviluppo.getStipendio());
        managerSviluppo.displayDettagli();
        managerSviluppo.aggiungiDipendente(backendDev);
    }
}
