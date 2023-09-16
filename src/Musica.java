import java.util.Date;
import java.util.List;

public class Musica {
    private int cod_musica;
    private String titulo;
    private String genero_musica;
    private int tempo_reproducao;
    private Date data_lancamento;
    private int cod_album;
    private List<Artista> artistas;
    
    public int getCod_musica() {
        return cod_musica;
    }

    public void setCod_musica(int cod_musica) {
        this.cod_musica = cod_musica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero_musica() {
        return genero_musica;
    }

    public void setGenero_musica(String genero_musica) {
        this.genero_musica = genero_musica;
    }

    public int getTempo_reproducao() {
        return tempo_reproducao;
    }

    public void setTempo_reproducao(int tempo_reproducao) {
        this.tempo_reproducao = tempo_reproducao;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public int getCod_album() {
        return cod_album;
    }

    public void setCod_album(int cod_album) {
        this.cod_album = cod_album;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
}
