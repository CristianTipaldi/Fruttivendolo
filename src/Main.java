import java.awt.*;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Frutta mele_rosse = new Frutta(1,"mele", "rosse",1);
        Frutta mele_bianche = new Frutta(2,"mele", "bianche",1.5);
        Frutta fragole = new Frutta(2,"fragole", "rosse",1);
        Frutta ciliege = new Frutta(1.50,"ciliege", "rosse",2);
        Frutta ciliegino = new Frutta(3,"ciliegino", "rosse",1.5);
        Frutta kiwi = new Frutta(1,"kiwi", "verde",1.5);
        Frutta uva_bianca = new Frutta(1,"uva", "bianca",1);

        Spesa spesaFrancesca = new Spesa();

        spesaFrancesca.addFrutto(mele_rosse);
        spesaFrancesca.addFrutto(mele_bianche);
        spesaFrancesca.addFrutto(fragole);
        spesaFrancesca.addFrutto(ciliege);
        spesaFrancesca.addFrutto(ciliegino);
        spesaFrancesca.addFrutto(kiwi);
        spesaFrancesca.addFrutto(uva_bianca);

        sortedList(spesaFrancesca);
        prezzoFrutto(spesaFrancesca,"mele");
        SpesaConRincaro(spesaFrancesca, "rosse");

        System.out.println(spesaFrancesca.getConto());
    }

    public static void sortedList(Spesa spesa){

        List<Frutta> listaSortColor = spesa.getListafrutta().stream().sorted(Comparator.comparing(Frutta::getColore)).toList();
        List<Frutta> listaSortNome = spesa.getListafrutta().stream().sorted(Comparator.comparing(Frutta::getNome)).toList();

        System.out.println(listaSortColor);
        System.out.println(listaSortNome);

    }

    public static void prezzoFrutto(Spesa spesa, String nome){
        double prezzoSingolo = 0;

        List<Frutta> listafrutta = spesa.getListafrutta().stream().filter(x -> x.getNome() == nome).toList();
        for(Frutta frutto : listafrutta){
            prezzoSingolo += frutto.getPrezzo();
        }

        System.out.println("il prezzo singolo:" +prezzoSingolo);
    }

    public static void SpesaConRincaro(Spesa spesa, String colore){
        double prezzototale = 0;

        List<Frutta> listafruttaFratello = spesa.getListafrutta().stream().filter(x -> x.getColore() == colore).toList();
        for(Frutta frutto: listafruttaFratello){
            frutto.rincaro(0.50);
            prezzototale += frutto.getPrezzo();
        }

        System.out.println("Spesa del fratello: " +prezzototale);
    }
}
