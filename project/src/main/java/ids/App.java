package ids;

public final class App {
    private App() {}
    public static void main(String[] args) {
        Dipendente Sviluppo = new Dipartimento("Dipartimento di Sviluppo");
        Dipendente Project = new Dipartimento("Project X Division");
        Dipendente SoftwareDevelopers = new Dipartimento("Software Developers");
        Dipendente SecurityDevelopers = new Dipartimento("Security Developers");

        Sviluppo.aggiungiDipendente(Project);
        Project.aggiungiDipendente(SoftwareDevelopers);
        Project.aggiungiDipendente(SecurityDevelopers);

        Dipendente ManagerSviluppo = new Manager("Emiliano Tramontana", 5432);
        Dipendente SWDevA = new Sviluppatore("Kent Beck", 2345);
        Dipendente SWDevB = new Sviluppatore("Martin Fowler", 2534);
        Dipendente SecDev = new Sviluppatore("Robert Martin", 2435);
        Dipendente ProjectLeader = new Sviluppatore("Andrea Fornaia", 5432); 

        Sviluppo.aggiungiDipendente(ManagerSviluppo);
        SoftwareDevelopers.aggiungiDipendente(SWDevA);
        SoftwareDevelopers.aggiungiDipendente(SWDevB);
        SecurityDevelopers.aggiungiDipendente(SecDev);
        Project.aggiungiDipendente(ProjectLeader);
        
        Sviluppo.displayDettagli();
        System.out.println(Project.getStipendio());
    }
}
