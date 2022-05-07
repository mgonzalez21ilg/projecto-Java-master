package ilgg;

public class Professor extends Persona{


    private double sou;

    public Professor() {}

    public void canviarSou(double sou) throws Exception  {
        if (sou > 3000.00){
            throw new Exception(" Error sou ");

        }
        else if (sou < 0){
            throw new Exception ("Error sou ");

        }
        else {
            this.sou = sou;
        }
    }


    public String obtenirDades() {
        return super.obtenirDades() + " (PROFE amb sou: " + this.sou ;
    }



}
