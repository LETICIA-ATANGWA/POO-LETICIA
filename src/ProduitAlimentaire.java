import java.util.Date;

public class ProduitAlimentaire extends Produit{



    private String pattern1;
    public ProduitAlimentaire(){

    }
    public ProduitAlimentaire(String nom, String description ,int prix, String pattern1){
        super(nom,description,prix);
        this.pattern1  = pattern1;

    }

    public String getPattern1() {
        return pattern1;
    }

    public void setPattern1(String pattern1) {
        this.pattern1 = pattern1;
    }

    public void afficher(){

        System.out.println("Nom du produitAlimentaire :" + getNom());
        System.out.println("Description du produit  :" + getDescription());
        System.out.println(("le prix vaut :" +getPrix() + "$"));
        System.out.println("Date expiration : " + pattern1);
    }




}
