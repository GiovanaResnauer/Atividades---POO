public class Cliente {

    private String nome;
    private ContaBancaria conta;
    private Gerente gerente;

    public Cliente(String nome, ContaBancaria conta, Gerente gerente) {
        this.nome = nome;
        this.conta = conta;
        this.gerente = gerente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ContaBancaria getConta() {
        return conta;
    }
    public Gerente getGerente() {
        return gerente;
    }
}
