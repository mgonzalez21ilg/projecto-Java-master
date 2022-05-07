package ilgg;

import java.util.Date;

public class ProfessorSubstiut extends Professor {
    private Date dataInici;
    private Date dateFi;


    public void assignarSubstitucio(Date dataInici, Date dateFi) {
        this.dataInici = dataInici;
        this.dateFi = dateFi;
    }

    public String obtenirDades() {
        return super.obtenirDades()+ ", del " +
                dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() +" al " +
                dateFi.getDate() + "/" + dateFi.getMonth() + "/" + dateFi.getYear() + ")";
    }
}

