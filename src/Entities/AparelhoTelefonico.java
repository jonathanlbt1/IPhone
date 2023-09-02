package Entities;

public class AparelhoTelefonico {

    private String ligar;
    private String atender;
    private String iniciarCorreioVoz;

    public AparelhoTelefonico(String ligar, String atender, String iniciarCorreioVoz) {
        this.ligar = ligar;
        this.atender = atender;
        this.iniciarCorreioVoz = iniciarCorreioVoz;
    }

    public AparelhoTelefonico() {
    }

    public String getLigar() {
        return ligar;
    }

    public void setLigar(String ligar) {
        this.ligar = ligar;
    }

    public String getAtender() {
        return atender;
    }

    public void setAtender(String atender) {
        this.atender = atender;
    }

    public String getIniciarCorreioVoz() {
        return iniciarCorreioVoz;
    }

    public void setIniciarCorreioVoz(String iniciarCorreioVoz) {
        this.iniciarCorreioVoz = iniciarCorreioVoz;
    }
}
