package techstore;

public abstract class AppareilInformatique extends Article implements Garantissable {
    private double resolutionEcran;
    private String processeur;
    private long ram;
    private SystemeExploitation systemeExploitaion;

    public AppareilInformatique(int id, String nom, String reference, double prix,
            double resolutionEcran, String processeur, long ram,
            SystemeExploitation systemeExploitaion) {
        super(id, nom, reference, prix);   // 1re instruction obligatoire
        this.resolutionEcran = resolutionEcran;
        this.processeur = processeur;
        this.ram = ram;
        this.systemeExploitaion = systemeExploitaion;
    }

    @Override
    public abstract int garantirAppareil();
    // + getters/setters + toString()

	public double getResolutionEcran() {
		return resolutionEcran;
	}

	public void setResolutionEcran(double resolutionEcran) {
		this.resolutionEcran = resolutionEcran;
	}

	public String getProcesseur() {
		return processeur;
	}

	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}

	public long getRam() {
		return ram;
	}

	public void setRam(long ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
	    return super.toString() + ", resolutionEcran=" + resolutionEcran
	            + ", processeur=" + processeur + ", ram=" + ram
	            + ", systemeExploitaion=" + systemeExploitaion;
	}
	public SystemeExploitation getSystemeExploitaion() {
		return systemeExploitaion;
	}

	public void setSystemeExploitaion(SystemeExploitation systemeExploitaion) {
		this.systemeExploitaion = systemeExploitaion;
	}
}