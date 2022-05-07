package ilgg;

import java.util.Locale;

public class Persona {

    public String nom;
    public String dni;

    //Aquesta funcio canvia el nom de la persona
    public void canviarNom(String nom) throws Exception {
        if (this.nom == null){
            if (nom == ""){
                throw new Exception("Error no hi ha Nom");
            }

        }
        this.nom = nom;

    }

    public String obtenirDades() {
        return  " Persona amb nom: " + this.nom + " i" + " DNI:" + this.dni ;

    }


    public void assignarDni(String dni) throws Exception {
        if (this.dni == null){
          if (dni.length()==9){

          }
          else {
              throw new Exception("DNI: NO correcte");
          }
          if (dni == ""){
              throw new Exception("Error no hi ha DNI");
          }

        }
        this.dni = dni;
    }


}
