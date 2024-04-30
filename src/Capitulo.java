import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    String escolhafinal = "";
    Scanner scamescolha = new Scanner(System.in);

    public Capitulo(String nome, String escolha1, String escolha2, String texto) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
    }

    void Mostrar() {
        System.out.println(nome + "\n" + texto + "\n");
    }

    public String Escolher() {
        if (escolha1.equals(null) || escolha2.equals(null)){
            
        }else{
            System.out.println("Opção 1: " + escolha1);
            System.out.println("Opção 2: " + escolha2);
        }
        


        // Loop para garantir que o usuário digite uma escolha válida
        while (true) {
            String escolha = scamescolha.nextLine();
            if (escolha.equals("1")) {
                return "1";
            } else if (escolha.equals("2")) {
                return "2";
            } else {
                System.out.println("Escolha inválida! Por favor, digite 1 ou 2.");
            }
        }
    }
}
