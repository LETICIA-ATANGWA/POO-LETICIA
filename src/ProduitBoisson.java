public class ProduitBoisson extends Produit{

    private int quantite;

    public ProduitBoisson(){

    }

    public ProduitBoisson(String nom, String description ,int prix, int quantite){
        super(nom, description,prix);
        this.quantite = quantite;

    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void afficher(){

        System.out.println("Nom du produitBoissons :" + getNom());
        System.out.println("Description du produit  :" + getDescription());
        System.out.println(("le prix vaut :" +getPrix() + "$"));
        System.out.println("la quantite : " + quantite + "L");
    }
}
