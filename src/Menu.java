import java.util.Scanner;
public class Menu {
    Scanner scammenu = new Scanner(System.in);
    public String menuprincipal(){
        String menu = "";
        while(!menu.equals("1") && !menu.equals("3")){
            System.out.println("______DARK AND DAKRNESS______\n" +
            "   |      1 - COMEÇAR     |\n"+
            "   |    2 - INSTRUÇÕES    |\n" +
            "   |       3 - SAIR       |\n");
            menu = scammenu.nextLine();
            if (menu.equals("2")){
                System.out.println("Bem-Vindo(a), a Dark and Darkness, isso é uma aventura onde você estará perdido dentro de uma caverna e terá que encontrar a saída custo oque custar\n" +
                "E ao longo dessa aventura você tentará encontrar seus amigos, que entraram com você...\n" +
                "Você terá alguns básicos status, sendo:\n" +
                "Stamina: Você começará com 100 e perderá 20 a cada ação feita(movimento) e 5 para cada ataque(combate)\n" +
                "Vida: Você começará com 20 de HP e perderá aos poucos quando: Acertado em batalha\n"+
                "Ataque: Você terá um ataque de 10 de Dano.");
            }
               
        }
        return menu;   
    }   
            
}       
