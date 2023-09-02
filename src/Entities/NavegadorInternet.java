package Entities;

public class NavegadorInternet {

    private String exibirPagina;
    private String adicionarNovaAba;
    private String atualizarPagina;

    public NavegadorInternet(String exibirPagina, String adicionarNovaAba, String atualizarPagina) {
        this.exibirPagina = exibirPagina;
        this.adicionarNovaAba = adicionarNovaAba;
        this.atualizarPagina = atualizarPagina;
    }

    public NavegadorInternet() {
    }

    public String getExibirPagina() {
        return exibirPagina;
    }

    public void setExibirPagina(String exibirPagina) {
        this.exibirPagina = exibirPagina;
    }

    public String getAdicionarNovaAba() {
        return adicionarNovaAba;
    }

    public void setAdicionarNovaAba(String adicionarNovaAba) {
        this.adicionarNovaAba = adicionarNovaAba;
    }

    public String getAtualizarPagina() {
        return atualizarPagina;
    }

    public void setAtualizarPagina(String atualizarPagina) {
        this.atualizarPagina = atualizarPagina;
    }
}
