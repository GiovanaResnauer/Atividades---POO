import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcao;
        do {
            System.out.println("\n BEM VINDO!");
            System.out.println("1. Cadastrar");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Extrato");
            System.out.println("5. Alterar Informações");
            System.out.println("6. Listar clientes por gerente");
            System.out.println("7. Sair");
            System.out.print("Digite a opção: ");

            opcao = Integer.parseInt(sc.nextLine());
            if (opcao == 1) {
                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();
                System.out.print("Nome do gerente: ");
                String nomeGerente = sc.nextLine();

                Gerente gerente = null;
                for (Gerente g : gerentes) {
                    if (g.getNome().equalsIgnoreCase(nomeGerente)) {
                        gerente = g;
                    }
                }
                if (gerente == null) {
                    gerente = new Gerente(nomeGerente);
                    gerentes.add(gerente);
                }
                Cliente cliente = new Cliente(nome, new ContaBancaria(), gerente);
                clientes.add(cliente);
                gerente.adicionarCliente(cliente);

                System.out.println("Cliente cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();

                Cliente encontrado = null;

                for (Cliente c : clientes) {
                    if (c.getNome().equalsIgnoreCase(nome)) {
                        encontrado = c;
                    }
                }
                if (encontrado != null) {
                    System.out.print("Valor do saque: ");
                    double valor = Double.parseDouble(sc.nextLine());

                    encontrado.getConta().sacar(valor);
                } else {
                    System.out.println("Cliente não encontrado!");
                }
            } else if (opcao == 3) {
                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();

                Cliente encontrado = null;

                for (Cliente c : clientes) {
                    if (c.getNome().equalsIgnoreCase(nome)) {
                        encontrado = c;
                    }
                }
                if (encontrado != null) {
                    System.out.print("Valor do depósito: ");
                    double valor = Double.parseDouble(sc.nextLine());

                    encontrado.getConta().depositar(valor);
                } else {
                    System.out.println("Cliente não encontrado!");
                }

            } else if (opcao == 4) {

                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();

                Cliente encontrado = null;

                for (Cliente c : clientes) {
                    if (c.getNome().equalsIgnoreCase(nome)) {
                        encontrado = c;
                    }
                }
                if (encontrado != null) {
                    encontrado.getConta().exibirExtrato();
                } else {
                    System.out.println("Cliente não encontrado!");
                }
            } else if (opcao == 5) {
                System.out.print("Nome atual do cliente: ");
                String nome = sc.nextLine();

                Cliente encontrado = null;
                for (Cliente c : clientes) {
                    if (c.getNome().equalsIgnoreCase(nome)) {
                        encontrado = c;
                    }
                }
                if (encontrado != null) {
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    encontrado.setNome(novoNome);

                    System.out.println("Informações alteradas!");
                } else {
                    System.out.println("Cliente não encontrado!");
                }

            } else if (opcao == 6) {

                System.out.print("Nome do gerente: ");
                String nomeGerente = sc.nextLine();

                Gerente gerente = null;

                for (Gerente g : gerentes) {
                    if (g.getNome().equalsIgnoreCase(nomeGerente)) {
                        gerente = g;
                    }
                }
                if (gerente != null) {
                    gerente.listarClientes();
                } else {
                    System.out.println("Gerente não encontrado!");
                }

            } else if (opcao == 7) {

                System.out.println("Encerrado.");

            } else {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        sc.close();
    }
}
