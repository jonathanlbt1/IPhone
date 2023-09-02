package Entities;

public class ReprodutorMusical {

    private String tocar;
    private String pausar;
    private String selecionarMusica;

    public ReprodutorMusical(String tocar, String pausar, String selecionarMusica) {
        this.tocar = tocar;
        this.pausar = pausar;
        this.selecionarMusica = selecionarMusica;
    }

    public ReprodutorMusical() {
    }

    public String getTocar() {
        return tocar;
    }

    public void setTocar(String tocar) {
        this.tocar = tocar;
    }

    public String getPausar() {
        return pausar;
    }

    public void setPausar(String pausar) {
        this.pausar = pausar;
    }

    public String getSelecionarMusica() {
        return selecionarMusica;
    }

    public void setSelecionarMusica(String selecionarMusica) {
        this.selecionarMusica = selecionarMusica;
    }
}
