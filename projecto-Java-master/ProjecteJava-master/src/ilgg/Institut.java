package ilgg;

public class Institut {

    public String nom;



    public void imprimirInformacio(String nom){
        this.nom = nom;
    }


    public String obtenirDades() {
        return  " Escola: " + this.nom + " llista: ";


    }




}
