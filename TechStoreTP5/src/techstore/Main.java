package techstore;

public class Main {
    public static void main(String[] args) {
        OrdinateurDeBureau pc = new OrdinateurDeBureau(1, "Tour Pro", "REF-PC1", 1800.0,
                24.0, "Intel i7", 16, SystemeExploitation.Windows, 1000, "RTX 4060", "650W");
        Mobile mob = new Mobile(2, "Phone X", "REF-MB1", 1500.0,
                6.1, "A17", 8, SystemeExploitation.IOS, 48.0, 12.0, 2, 4000);
        ComposantStockage ssd = new ComposantStockage(3, "SSD 256", "REF-ST1", 120.0, 256);

        Garantissable[] tab = { pc, mob, ssd };
        for (Garantissable g : tab) {
            System.out.println(g);
            System.out.println("  -> garantie : " + g.garantirAppareil() + " an(s)");
        }
    }
}

/*Article
├── AppareilInformatique (abstract, implements Garantissable)
│   ├── Ordinateur (abstract)
│   │   ├── OrdinateurDeBureau   → garantie 1 an
│   │   └── OrdinateurPortable   → garantie 2 ans
│   └── Mobile                   → 2 ans si prix > 1000, sinon 1 an
├── ComposantStockage (implements Garantissable) → 1 an si capacité ≤ 500, sinon 2 ans
└── Peripheriques (pas de garantie)*/