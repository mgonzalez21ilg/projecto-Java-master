package ilgg;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        //profeSubstitut.iniciarSubstitucio(dataInici, dataFi);


        Institut ins = new Institut();
        ins.imprimirInformacio("Institut La Guineueta");
        String cole = ins.obtenirDades();
        System.out.println(cole);



        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.canviarNom("Manu");
        p1.assignarDni("41112112N");
        String dades = p1.obtenirDades();

        System.out.println(dades);





        ProfessorSubstiut profe2 = new ProfessorSubstiut();
        profe2.canviarNom("Antonio");
        profe2.canviarSou(1);
        profe2.assignarDni("42359324A");
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        profe2.assignarSubstitucio(dataInici, dataFi);

        dades = profe2.obtenirDades();

        System.out.println( dades );

        Estudiant e = new Estudiant();
        e.posarNota(3);
        e.canviarNom("Ash");
        e.assignarDni("48931468L");
        dades = e.obtenirDades();
        System.out.println(dades);

        Professor p = new Professor();
        p.canviarNom("Pep");
        p.canviarSou(3000);
        p.assignarDni("42342534H");
        dades = p.obtenirDades();
        System.out.println(dades + ")");


    }
}
