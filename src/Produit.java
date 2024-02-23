public class Produit {

    private String nom;

    private String description;
    private int prix;

    public Produit(){

    }

    public Produit(String nom, String description, int prix){
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void afficher(){

        System.out.println("Nom du produit :" + nom);
        System.out.println("Description du produit  :" + description);

    }


    /*public String toString(){
        return "le produit donc le {" +
                "nom = " + nom +
                ", description '" + description+ '\'' +
                '}';

    }*/
}
