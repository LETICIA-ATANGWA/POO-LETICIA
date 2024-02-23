public class ProduitElectronique extends Produit{

    private int dureeGarantie;

    public ProduitElectronique(){

    }
    public ProduitElectronique(String nom,String description ,int prix, int dureeGarantie){
        super(nom, description,prix);
        this.dureeGarantie = dureeGarantie;

    }

    public int getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public void afficher(){

        System.out.println("Nom du produitElectronique :" + getNom());
        System.out.println("Description du produit  :" + getDescription());
        System.out.println(("le prix vaut :" +getPrix() + "$"));
        System.out.println("duree de garantie : " + dureeGarantie + "mois");
    }
}
