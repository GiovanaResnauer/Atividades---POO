import java.util.ArrayList;
public class Usuario {
    private String nome;
    private String email;
    private ArrayList<Perfil> perfis;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.perfis = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public void criarPerfil(String nome) {
        perfis.add(new Perfil(nome));
        System.out.println("Perfil criado com sucesso!");
    }
    public ArrayList<Perfil> getPerfis() {
        return perfis;
    }
    public void listarPerfis() {
        if (perfis.isEmpty()) {
            System.out.println("Nenhum perfil encontrado.");
            return;
        }
        for (int i = 0; i < perfis.size(); i++) {
            System.out.println((i + 1) + " - " + perfis.get(i).getNome());
        }
    }
}

