import java.util.ArrayList;

public class Gerente {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Gerente(String nome) {
        this.nome = nome;
        clientes = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
