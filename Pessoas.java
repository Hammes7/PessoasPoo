public class Pessoas {
    private String nome;
    private int codigo;

    public Pessoas(String n, int i) {
        this.setNome(n);
        this.setCodigo(i);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\nCodigo: " + this.getCodigo();
    }
}