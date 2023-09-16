public class Album {
    private int cod_album;
    private String titulo_album;
    private int ano_lancamento;
    private String genero_musical;
    
    public int getCod_album() {
        return cod_album;
    }

    public void setCod_album(int cod_album) {
        this.cod_album = cod_album;
    }

    public String getTitulo_album() {
        return titulo_album;
    }

    public void setTitulo_album(String titulo_album) {
        this.titulo_album = titulo_album;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getGenero_musical() {
        return genero_musical;
    }

    public void setGenero_musical(String genero_musical) {
        this.genero_musical = genero_musical;
    }
}
