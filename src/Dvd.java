/*
Criar classe Filha chamada Dvd

Atributos:
- idioma: String
- possuiLegenda: boolean
- idiomaLegenda: String

Métodos:
- sobrescrever darPlay(): exibir a mensagem "filme iniciado"
- construtor(todos os argumentos)
- get() e set()
- legenda(boolean ligar, String idioma): liga a legenda e atualiza o idioma da legenda
- legenda(boolean ligarDesligar): apenas atualiza a variável possuiLegenda
*/

public class Dvd extends Midia{

    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    public Dvd(String codigo, double preco, String nome, String idioma, boolean possuiLegenda, String idiomaLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    public void darPlay(){
        System.out.println("Filme iniciado!");
    }

    public void legenda(boolean ligar, String idiomaLegenda){
        setPossuiLegenda(ligar);
        setIdiomaLegenda(idiomaLegenda);
    }

    public void legenda(boolean ligarDesligar){
        setPossuiLegenda(ligarDesligar);
    }

    @Override
    public String toString() {
        return super.toString() + "Dvd {" +
                "Idioma: " + idioma + '\n' +
                "Possui legenda? " + possuiLegenda + '\n' +
                "Idioma da legenda: " + idiomaLegenda + '\n' +
                '}';
    }
}
