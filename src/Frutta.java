public class Frutta {

    private double prezzo;
    private String nome;
    private String colore;
    private double kg;

    public Frutta(double prezzo, String nome, String colore, double kg) {
        this.prezzo = prezzo * kg;
        this.nome = nome;
        this.colore = colore;
        this.kg = kg;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo * this.kg;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getColore() {
        return colore;
    }

    public double getKg() {
        return kg;
    }

    @Override
    public String toString() {
        return "Frutta{" +
                "prezzo=" + prezzo +
                ", nome='" + nome + '\'' +
                ", colore='" + colore + '\'' +
                ", kg=" + kg +
                '}';
    }

    public void rincaro(double aggiunta){
        this.prezzo = this.prezzo/this.kg;
        this.prezzo = this.prezzo + aggiunta;
        this.prezzo = this.prezzo * this.kg;
    }
}
