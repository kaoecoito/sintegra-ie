package br.gov.sintegra.ie;

/**
 *
 * @author kaoe
 */
public class Main {

    public static void main(String[] args) {
        
        InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("TO");
        boolean valido = ie.validar("2901022783-6");
        System.out.println("Válido: "+valido);
        
    }
    
}
