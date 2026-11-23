import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Conteudo> catalogo = new ArrayList<>();

    public static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }
    public static Usuario selecionarUsuario() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return null;
        }

        System.out.println("\n Usuários:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
        }
        int opcao = lerInteiro("Escolha um usuário: ");
        if (opcao < 1 || opcao > usuarios.size()) {
            System.out.println("Opção inválida.");
            return null;
        }
        return usuarios.get(opcao - 1);
    }
    public static Perfil selecionarPerfil(Usuario usuario) {
        if (usuario.getPerfis().isEmpty()) {
            System.out.println("Esse usuário não possui perfil.");
            return null;
        }
        System.out.println("\n Perfil:");
        usuario.listarPerfis();
        int opcao = lerInteiro("Escolha um perfil: ");
        if (opcao < 1 || opcao > usuario.getPerfis().size()) {
            System.out.println("Opção inválida.");
            return null;
        }
        return usuario.getPerfis().get(opcao - 1);
    }
    public static void exibirCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("Catálogo vazio.");
            return;
        }
        System.out.println("\n Catálogo:");

        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println("\n" + (i + 1) + " - ");
            catalogo.get(i).exibirInformacoes();
        }
    }
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n NETFLIX");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Criar perfil");
            System.out.println("3. Listar perfis");
            System.out.println("4. Cadastrar filme");
            System.out.println("5. Cadastrar série");
            System.out.println("6. Exibir catálogo");
            System.out.println("7. Adicionar conteúdo");
            System.out.println("8. Remover conteúdo");
            System.out.println("9. Exibir lista do perfil");
            System.out.println("0. Sair");

            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    usuarios.add(new Usuario(nome, email));
                    System.out.println("Usuário cadastrado!");
                    break;

                case 2:
                    Usuario usuarioPerfil = selecionarUsuario();

                    if (usuarioPerfil != null) {
                        System.out.print("Nome do perfil: ");
                        String nomePerfil = scanner.nextLine();

                        usuarioPerfil.criarPerfil(nomePerfil);
                    }
                    break;

                case 3:
                    Usuario usuarioLista = selecionarUsuario();

                    if (usuarioLista != null) {
                        usuarioLista.listarPerfis();
                    }
                    break;

                case 4:
                    System.out.print("Título do filme: ");
                    String tituloFilme = scanner.nextLine();

                    int anoFilme = lerInteiro("Ano: ");

                    System.out.print("Classificação: ");
                    String classificacaoFilme = scanner.nextLine();

                    int duracao = lerInteiro("Duração em minutos: ");

                    catalogo.add(new Filme(
                            tituloFilme, anoFilme, classificacaoFilme, duracao
                    ));

                    System.out.println("Filme cadastrado!");
                    break;

                case 5:
                    System.out.print("Título da série: ");
                    String tituloSerie = scanner.nextLine();

                    int anoSerie = lerInteiro("Ano: ");

                    System.out.print("Classificação: ");
                    String classificacaoSerie = scanner.nextLine();

                    int temporadas = lerInteiro("Quantidade de temporadas: ");

                    catalogo.add(new Serie(
                            tituloSerie, anoSerie, classificacaoSerie, temporadas
                    ));

                    System.out.println("Série cadastrada!");
                    break;

                case 6:
                    exibirCatalogo();
                    break;

                case 7:
                    Usuario usuarioAdicionar = selecionarUsuario();

                    if (usuarioAdicionar != null) {
                        Perfil perfilAdicionar = selecionarPerfil(usuarioAdicionar);

                        if (perfilAdicionar != null) {
                            exibirCatalogo();

                            if (!catalogo.isEmpty()) {
                                int indice = lerInteiro("Escolha o conteúdo: ");

                                if (indice >= 1 && indice <= catalogo.size()) {
                                    perfilAdicionar.adicionarConteudo(
                                            catalogo.get(indice - 1)
                                    );
                                } else {
                                    System.out.println("Opção inválida.");
                                }
                            }
                        }
                    }
                    break;

                case 8:
                    Usuario usuarioRemover = selecionarUsuario();

                    if (usuarioRemover != null) {
                        Perfil perfilRemover = selecionarPerfil(usuarioRemover);

                        if (perfilRemover != null) {
                            perfilRemover.exibirLista();

                            if (!perfilRemover.getLista().isEmpty()) {
                                int indiceRemover = lerInteiro(
                                        "Escolha o conteúdo para remover: "
                                );

                                perfilRemover.removerConteudo(indiceRemover - 1);
                            }
                        }
                    }
                    break;

                case 9:
                    Usuario usuarioExibir = selecionarUsuario();

                    if (usuarioExibir != null) {
                        Perfil perfilExibir = selecionarPerfil(usuarioExibir);

                        if (perfilExibir != null) {
                            perfilExibir.exibirLista();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
