package victor_vasconcelos.icomp.ufam.edu.br.composicaocolaborativa;

/**
 * Created by Victor Freitas Vasconcelos on 01/06/2016.
 */
public class Ambiente {

    private int id;
    private String descricao;
    private double latitudeA, longitudeA,
                    latitudeB,longitudeB,
                    latitudeC,longitudeC;
    private float raio;
    private int totalPessoas;

    public Ambiente(int id, String descricao,
                    double longitudeA, double latitudeA,
                    double longitudeB, double latitudeB,
                    double longitudeC, double latitudeC,
                    float raio, int totalPessoas) {
        this.id = id;
        this.descricao = descricao;
        this.latitudeA = latitudeA;
        this.longitudeA = longitudeA;
        this.latitudeB = latitudeB;
        this.longitudeB = longitudeB;
        this.latitudeC = latitudeC;
        this.longitudeC = longitudeC;
        this.raio = raio;
        this.totalPessoas = totalPessoas;
    }

    public float getRaio() {
        return raio;
    }

    public double getLatitudeA() {
        return latitudeA;
    }


    public double getLongitudeA() {
        return longitudeA;
    }


    public double getLatitudeB() {
        return latitudeB;
    }


    public double getLongitudeB() {
        return longitudeB;
    }


    public double getLatitudeC() {
        return latitudeC;
    }


    public double getLongitudeC() {
        return longitudeC;
    }

    public int getId() {
        return id;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }

    public String getDescricao() {
        return descricao;
    }
}
