package ti2;
import java.util.List;
import java.util.Scanner;
import dao.VeiculoDAO;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeiculoDAO dao = new VeiculoDAO();
        int opcao = 0;

        do {
            System.out.println("\n\tMENU");
            System.out.println("1 - Listar Veículos");
            System.out.println("2 - Inserir Veículo");
            System.out.println("3 - Atualizar Veículo");
            System.out.println("4 - Excluir Veículo");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("\nLista de Veículos:");
                    List<Veiculo> lista = dao.listar();
                    
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum veículo encontrado.");
                    } 
                    else {
                        for (Veiculo v : lista) {
                            System.out.println("ID: " + v.getId() + ", Marca: " + v.getMarca() +
                                               ", Modelo: " + v.getModelo() + ", Ano: " + v.getAno() +
                                               ", Preço: " + v.getPreco());
                        }
                    }
                    break;
                    
                case 2:
                    Veiculo novo = new Veiculo();
                    System.out.print("Marca: ");
                    novo.setMarca(scanner.nextLine());
                    
                    System.out.print("Modelo: ");
                    novo.setModelo(scanner.nextLine());
                    
                    System.out.print("Ano: ");
                    novo.setAno(scanner.nextInt());
                    
                    System.out.print("Preço: ");
                    novo.setPreco(scanner.nextDouble());
                    
                    scanner.nextLine();
                    dao.inserir(novo);
                    
                    System.out.println("Veículo inserido com sucesso!");
                    break;
                    
                case 3:
                    Veiculo atualizar = new Veiculo();
                    System.out.print("ID do veículo a atualizar: ");
                    atualizar.setId(scanner.nextInt());
                    scanner.nextLine();
                    
                    System.out.print("Nova Marca: ");
                    atualizar.setMarca(scanner.nextLine());
                    
                    System.out.print("Novo Modelo: ");
                    atualizar.setModelo(scanner.nextLine());
                    
                    System.out.print("Novo Ano: ");
                    atualizar.setAno(scanner.nextInt());
                    
                    System.out.print("Novo Preço: ");
                    atualizar.setPreco(scanner.nextDouble());
                    scanner.nextLine();
                    
                    dao.atualizar(atualizar);
                    
                    System.out.println("Veículo atualizado com sucesso!");
                    break;
                    
                case 4:
                    System.out.print("ID do veículo a excluir: ");
                    int idExcluir = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    dao.excluir(idExcluir);
                    System.out.println("Veículo excluído com sucesso!");
                    break;
                    
                case 5:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 5);
        
        scanner.close();
    }
}
