package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificação;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificação() {
        return classificação;
    }

    public void curte() {
        totalCurtidas ++;
    }

    public void reproduz() {
//        System.out.println("Reproduzindo...");
        totalReproducoes ++;
    }
}
