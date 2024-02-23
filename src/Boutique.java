import java.lang.reflect.Array;
import java.util.ArrayList;

public class Boutique {
    ArrayList<Produit> produits = new ArrayList<>();

    public void addProduit(Produit produit){
        produits.add(produit);
    }

    public ArrayList<Produit> getProduits(){
        return produits;
    }

    public void afficherStock(){
        System.out.println("Stock de produit de la boutique");
        for (Produit produit : produits) {
            produit.afficher();
            System.out.println();
        }

    }



}
