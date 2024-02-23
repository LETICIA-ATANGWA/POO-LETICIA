import java.util.ArrayList;

public class Panier {
    private ArrayList<Produit> articles = new ArrayList<>();

    public void addProduit(Produit produit){
        articles.add(produit);
    }

    public  int prixTotalPanier(){
        int prixTotal = 0;
        for (Produit produit : articles){
            prixTotal += produit.getPrix();
        }
        return prixTotal;
    }

}
