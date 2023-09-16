import java.util.Date;
import java.util.List;

public class Playlist {
    private int cod_playlist;
    private Date data_criacao;
    private String nome;
    private List<Musica> musicas;
    private int cod_usuario;
    
    public int getCod_playlist() {
        return cod_playlist;
    }

    public void setCod_playlist(int cod_playlist) {
        this.cod_playlist = cod_playlist;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
}
