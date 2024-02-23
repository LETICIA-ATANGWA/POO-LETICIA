import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Boutique boutique = new Boutique();


        boutique.addProduit(new ProduitElectronique("chaffage", "pour chauffer  maison",5000, 10));
        boutique.addProduit(new ProduitAlimentaire("riz","riz parfumé",500, "12/04/2023"));
        boutique.addProduit(new ProduitBoisson("yop", "yaourt vanille" ,24, 4));
        boutique.afficherStock();


        Panier panier = new Panier();
        panier.addProduit(new ProduitElectronique("chaffage", "pour chauffer  maison",20, 10));
        panier.addProduit(new ProduitAlimentaire("riz","riz parfumé",30, "12/04/2023"));
        panier.addProduit(new ProduitBoisson("yop", "yaourt vanille"  ,20, 4));

        System.out.println("prix total du panier :" + panier.prixTotalPanier());




    }
}