package ilgg;

public class Estudiant extends Persona{


    private double nota;

    public Estudiant() {}

    public void posarNota(double nota) throws Exception {
        if (nota > 10){
            throw new Exception("Error nota");
        }
        else if (nota < 0)
            throw new Exception("Error nota");
        else {
            this.nota = nota;
        }

    }

    public String obtenirDades() {
        return super.obtenirDades() +  " (ESTUDIANT amb nota: " + this.nota +")";
    }
}
