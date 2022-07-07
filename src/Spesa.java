import java.util.ArrayList;

public class Spesa {

    private ArrayList<Frutta> listafrutta = new ArrayList<>();
    private double conto;

    public Spesa() {
    }

    public void addFrutto(Frutta frutto){
        this.listafrutta.add(frutto);
        this.conto += frutto.getPrezzo();
    }

    public double getConto() {
        return conto;
    }

    public ArrayList<Frutta> getListafrutta() {
        return listafrutta;
    }

    @Override
    public String toString() {
        return "Spesa{" +
                "listafrutta=" + listafrutta +
                ", conto=" + conto +
                '}';
    }
}
