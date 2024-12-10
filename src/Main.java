
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        Main programa= new Main();
        programa.inicio();

    }

    public void inicio() {
        ArrayList<String> hobbies= new ArrayList<>();
        hobbies.add("Fotografía 📸");
        hobbies.add("Ver Series 📺");
        hobbies.add("Viajar ✈️");

        ArrayList<String> food= new ArrayList<>();
        food.add("Pasta 🍝");
        food.add("Sushi 🍙");
        food.add("Hamburguesa 🍔");
        food.add("Pizza 🍕");

        ArrayList<String> funFacts= new ArrayList<>();
        funFacts.add("hablo 3 idiomas 💬");
        funFacts.add("Tengo 2 perritos, Mauri y Cistal 🐶");
        funFacts.add("Soy fan de Formula 1 🏎️");

        Perfil perfil = new Perfil("Paula Benitez","\n Hola! soy Paula, me encanta aprender cosas nuevas y exponerme a nuevos desafios. \n me gusta viajar y conocer culturas, personas e historias. ", hobbies,food,funFacts);

        Scanner sc = new Scanner(System.in);
        int opciones;

        /* Menú de opciones*/
        do {
            System.out.println("Menu, AboutMe "+ perfil.getName());
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Facts");
            System.out.println("[4] Salir");

            opciones = sc.nextInt();
            sc.nextLine();

            switch (opciones){

                case 1:
                    System.out.println(perfil.getFormattedStory());
                    break;
                case 2;
                    System.out.println(perfil.getFormattedHobbies());
                    System.out.println(perfil.getFormattedFoods());
                    break;
                case 3;
                    System.out.println(perfil.getFormattedFunFacts());
                    break;
                case 4:
                    System.out.println("Haz elegido salir, hasta pronto ;)");
                    break;
                default:
                    System.out.println("Opción invalida. escoja una de estas opciones.");

            }

        }while (opciones !=4);


    }
}