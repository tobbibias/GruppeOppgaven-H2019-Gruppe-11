package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import no.hiof.tobiasgs.GruppeOppgaven.Model.FederationEmployee;

import java.util.ArrayList;
import java.util.Collection;

public class FederationDatahandler {
    private final static ArrayList<Federation>FEDERATION_ARRAY_LIST = new ArrayList<Federation>();

    public static ArrayList<Federation> getFederationArrayList(){
        if (FEDERATION_ARRAY_LIST.isEmpty()){
            FEDERATION_ARRAY_LIST.addAll(collectFederations());
        }
        return FEDERATION_ARRAY_LIST;
    }

    private static ArrayList<Federation> collectFederations() {
        ArrayList<Federation> federations = new ArrayList<Federation>();
        Federation nff = new Federation("Norges fotball forening","nff@email.no","oslo","0000");
        Federation ncf = new Federation("Norges Cykle forbund","ncf@email.no","oslo","0000");

        federations.add(nff);
        federations.add(ncf);

        return  federations;
    }
    public void addFederation(Federation f){


        if(!FEDERATION_ARRAY_LIST.contains(f)) {
            FEDERATION_ARRAY_LIST.add(f);
        }
    }
    public void removeFederation(Federation f){
        if (FEDERATION_ARRAY_LIST.remove(f)){
            System.out.println("Federation: "+ f + " was sucsessfully removed.");
        }else {
            System.out.println("federation: " + f + " was not removed.");
        }
    }

}
